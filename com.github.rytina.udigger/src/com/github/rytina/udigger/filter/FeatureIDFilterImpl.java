package com.github.rytina.udigger.filter;


import org.eclipse.core.runtime.Assert;
import org.geotools.factory.CommonFactoryFinder;
import org.opengis.feature.Feature;
import org.opengis.filter.identity.FeatureId;

public class FeatureIDFilterImpl extends org.geotools.filter.AbstractFilterImpl{

	private FeatureId fid;

	public FeatureIDFilterImpl(FeatureId fid) {
		super(CommonFactoryFinder.getFilterFactory(null));
		Assert.isNotNull(fid);
		this.fid = fid;
	}	

	@Override
	public boolean evaluate(Object object) {
		try{
			if(object instanceof Feature){
				Feature feature = (Feature)object;
				return feature.getIdentifier().equals(fid);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}





}
