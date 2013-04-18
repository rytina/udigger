package com.github.rytina.udigger.map.commands.parameter;

import com.vividsolutions.jts.geom.Point;

public class CreateNewFeaturesParameter {

	private final String id;
	private final Point geo;

	public CreateNewFeaturesParameter(String id, Point geo) {
		this.id = id;
		this.geo = geo;
	}

	public String getId() {
		return id;
	}

	public Point getGeo() {
		return geo;
	}

}
