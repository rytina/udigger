package com.github.rytina.udigger.filter;

import org.geotools.factory.CommonFactoryFinder;
import org.opengis.filter.FilterVisitor;

public interface FeatureIDFilter extends org.opengis.filter.Filter{
	
	public static org.opengis.filter.Filter ALL = new org.geotools.filter.AbstractFilterImpl(CommonFactoryFinder.getFilterFactory(null)) {
		
		@Override
		public boolean evaluate(Object object) {
			return true;
		}
	};

}
