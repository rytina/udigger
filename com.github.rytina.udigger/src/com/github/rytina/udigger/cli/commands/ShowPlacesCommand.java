package com.github.rytina.udigger.cli.commands;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;
import net.refractions.udig.project.internal.Project;
import net.refractions.udig.project.internal.ProjectPlugin;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.tools.edit.commands.CreateNewOrSelectExitingFeatureCommand;

public class ShowPlacesCommand implements CommandProvider{

	public void _showplaces(CommandInterpreter commandInterpreter) {
		commandInterpreter.println("ShowPlacesCommand._showplaces()");
		Project project = ProjectPlugin.getPlugin().getProjectRegistry().getCurrentProject();
		GeometryFactory fac=new GeometryFactory();
        Point geo = fac.createPoint(new Coordinate(9.1809,48.7765));
        IMap map = ApplicationGIS.getActiveMap();
        ILayer placesLayer = map.getMapLayers().get(1);
        CreateNewOrSelectExitingFeatureCommand command=new CreateNewOrSelectExitingFeatureCommand("newID", placesLayer, geo);
        command.setMap(map);
		project.sendASync(command);
		System.out.println("ShowPlacesCommand._showplaces()");
	}
	
	@Override
	public String getHelp() {
		return "ShowPlacesCommand.getHelp()";
	}

}
