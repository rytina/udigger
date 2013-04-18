package com.github.rytina.udigger.map.commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import net.refractions.udig.catalog.CatalogPlugin;
import net.refractions.udig.catalog.IGeoResource;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.ui.ExceptionDetailsDialog;
import net.refractions.udig.ui.PlatformGIS;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.geotools.data.FeatureStore;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureCollections;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.feature.simple.SimpleFeatureTypeBuilder;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.MultiPoint;


public class CreateInitialFeaturesCommand {
	
	public static void initFeatures(){
		System.out.println("CreateInitialFeaturesCommand.initFeatures()");
	    final HashMap<String, Coordinate> placesMap = new HashMap<String, Coordinate>(1000);
        URL placesIT = CreateInitialFeaturesCommand.class.getResource("IT.txt");
        try {
			populatePlacesMap(placesMap, placesIT);
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
        final Set<String> keySet = placesMap.keySet();
        
        IRunnableWithProgress operation = new IRunnableWithProgress(){

            public void run( IProgressMonitor pm ) throws InvocationTargetException, InterruptedException {

                try {
                    GeometryFactory gF = new GeometryFactory();
                    // create the feature type
                    SimpleFeatureTypeBuilder b = new SimpleFeatureTypeBuilder();
                    b.setName("places");
                    b.setCRS(DefaultGeographicCRS.WGS84);
                    b.add("the_geom", MultiPoint.class);
                    b.add("name", String.class);
                    SimpleFeatureType type = b.buildFeatureType();

                    FeatureCollection<SimpleFeatureType, SimpleFeature> newCollection = FeatureCollections
                            .newCollection();

                    int size = keySet.size();

                    pm.beginTask("Converting geometries of places...", size);
                    int id = 0;
                    for( String name : keySet ) {
                        Coordinate coordinate = placesMap.get(name);
                        MultiPoint point = gF.createMultiPoint(new Coordinate[]{coordinate});
                        SimpleFeatureBuilder builder = new SimpleFeatureBuilder(type);
                        Object[] values = new Object[]{point, name};
                        builder.addAll(values);
                        SimpleFeature feature = builder.buildFeature(type.getTypeName() + "." + id);
                        id++;
                        newCollection.add(feature);
                        pm.worked(1);
                    }
                    pm.done();

                    IGeoResource resource = CatalogPlugin.getDefault().getLocalCatalog()
                            .createTemporaryResource(type);

                    resource.resolve(FeatureStore.class, pm).addFeatures(newCollection);
                    ApplicationGIS.addLayersToMap(ApplicationGIS.getActiveMap(), Collections.singletonList(resource),
                            -1);
                } catch (Exception e) {
                    e.printStackTrace();
                    String message = "An error occurred while loading the places to map";
                    ExceptionDetailsDialog.openError(null, message, IStatus.ERROR, "com.github.rytina.udigger", e);

                }

            }

        };

        PlatformGIS.runInProgressDialog("Loading places in temporary layer...", true, operation, true);
	}
	
    private static void populatePlacesMap( HashMap<String, Coordinate> placesMap, URL fileToRead ) throws FileNotFoundException,
    IOException {
	BufferedReader bR = new BufferedReader(new InputStreamReader(fileToRead.openStream()));
	String line = null;
	while( (line = bR.readLine()) != null ) {
	    String[] lineSplit = line.split("\t");
	    String name = lineSplit[1];
	    String lat = lineSplit[4];
	    String lon = lineSplit[5];
	
	    Coordinate c = new Coordinate(Double.parseDouble(lon), Double.parseDouble(lat));
	    placesMap.put(name, c);
	}
	bR.close();
    }

}
