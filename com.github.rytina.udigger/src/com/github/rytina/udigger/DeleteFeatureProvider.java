package com.github.rytina.udigger;

import java.io.IOException;

import net.refractions.udig.core.IBlockingProvider;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.geotools.data.FeatureStore;
import org.geotools.feature.FeatureCollection;
import org.geotools.filter.FidFilterImpl;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.filter.identity.FeatureId;

import com.github.rytina.udigger.filter.FeatureIDFilterImpl;

public class DeleteFeatureProvider implements IBlockingProvider<SimpleFeature> {
    private ILayer layer;
	private FeatureId fid;
	public DeleteFeatureProvider( ILayer layer, FeatureId fid) {
    	this.layer = layer;
    	this.fid = fid;
    }
    public SimpleFeature get( IProgressMonitor monitor, Object... params ) {
    	try {
			FeatureStore store = layer.getResource(FeatureStore.class, new SubProgressMonitor(monitor, 2));
			FeatureCollection<SimpleFeatureType, SimpleFeature> feats = store.getFeatures(new FeatureIDFilterImpl(fid));
	    	if(feats.size() > 0){
	    		return feats.features().next();
	    	}
    	return null;
    	} catch (IOException e) {
    		e.printStackTrace();
			return null;
		}
    }
}