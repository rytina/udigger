package com.github.rytina.udigger.filter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.geotools.factory.CommonFactoryFinder;
import org.opengis.feature.Feature;
import org.opengis.filter.identity.FeatureId;

public class FeatureIDFilterImpl extends org.geotools.filter.AbstractFilterImpl implements FeatureIDFilter{

	
	private final Set<String> fids;

	public FeatureIDFilterImpl(Set<String> fids) {
		super(CommonFactoryFinder.getFilterFactory(null));
		Assert.isNotNull(fids);
		this.fids = fids;
	}
	
	public FeatureIDFilterImpl(String fid) {
		this(new HashSet<String>(Collections.singleton(fid)));
	}

	@Override
	public boolean evaluate(Object object) {
//		try{
//			if(object instanceof Feature){
//				Feature feature = (Feature)object;
//				return fids.contains(feature.getProperty("vid").getValue());
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
		throw new RuntimeException("not yet implemented!");
	}





}
