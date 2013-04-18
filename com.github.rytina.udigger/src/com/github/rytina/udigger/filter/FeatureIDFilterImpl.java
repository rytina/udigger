package com.github.rytina.udigger.filter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.geotools.factory.CommonFactoryFinder;
import org.opengis.feature.Feature;
import org.opengis.filter.identity.FeatureId;

public class FeatureIDFilterImpl extends org.geotools.filter.AbstractFilterImpl{

	private final List<FeatureId> fids;

	public FeatureIDFilterImpl(List<FeatureId> fids) {
		super(CommonFactoryFinder.getFilterFactory(null));
		Assert.isNotNull(fids);
		this.fids = fids;
	}
	
	public FeatureIDFilterImpl(FeatureId fid) {
		this(Arrays.asList(new FeatureId[]{fid}));
	}

	@Override
	public boolean evaluate(Object object) {
		try{
			if(object instanceof Feature){
				Feature feature = (Feature)object;
				return fids.contains(feature.getIdentifier());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}





}
