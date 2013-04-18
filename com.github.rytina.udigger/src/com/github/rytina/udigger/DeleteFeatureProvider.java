package com.github.rytina.udigger;

import java.io.IOException;
import java.util.List;

import net.refractions.udig.core.IBlockingProvider;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.geotools.data.FeatureStore;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import org.geotools.filter.FidFilterImpl;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.filter.identity.FeatureId;

import com.github.rytina.udigger.filter.FeatureIDFilterImpl;

public class DeleteFeatureProvider implements IBlockingProvider<SimpleFeature[]> {
    private final ILayer layer;
	private final List<FeatureId> fids;
	public DeleteFeatureProvider( ILayer layer, List<FeatureId> fids) {
    	this.layer = layer;
    	this.fids = fids;
    }
    public SimpleFeature[] get( IProgressMonitor monitor, Object... params ) {
    	try {
			FeatureStore store = layer.getResource(FeatureStore.class, new SubProgressMonitor(monitor, 2));
			FeatureCollection<SimpleFeatureType, SimpleFeature> feats = store.getFeatures(new FeatureIDFilterImpl(fids));
	    	if(feats.size() > 0){
	    		FeatureIterator<SimpleFeature> iter = feats.features();
	    		SimpleFeature[] features = new SimpleFeature[feats.size()];
	    		for (int i = 0; i < feats.size(); i++) {
					features[i] = iter.next();
				}
	    		return features;
	    	}
    	return null;
    	} catch (IOException e) {
    		e.printStackTrace();
			return null;
		}
    }
}