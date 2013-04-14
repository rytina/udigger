package com.github.rytina.udigger.cli.commands;

import net.refractions.udig.core.IBlockingProvider;
import net.refractions.udig.core.StaticBlockingProvider;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;
import net.refractions.udig.project.command.CompositeCommand;
import net.refractions.udig.project.command.provider.EditFeatureProvider;
import net.refractions.udig.project.internal.Project;
import net.refractions.udig.project.internal.ProjectPlugin;
import net.refractions.udig.project.internal.commands.edit.DeleteFeatureCommand;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.tools.edit.commands.CreateNewOrSelectExitingFeatureCommand;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.filter.identity.FeatureIdImpl;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

import com.github.rytina.udigger.DeleteFeatureProvider;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

public class HidePlacesCommand implements CommandProvider{

	public void _hideplaces(CommandInterpreter commandInterpreter) {
		Project project = ProjectPlugin.getPlugin().getProjectRegistry().getCurrentProject();
		GeometryFactory fac=new GeometryFactory();
        Point geo = fac.createPoint(new Coordinate(9.1809,48.7765));
        IMap map = ApplicationGIS.getActiveMap();
        ILayer placesLayer = map.getMapLayers().get(1);
        IBlockingProvider<ILayer> layerProvider=new StaticBlockingProvider<ILayer>(placesLayer);
        String fid = commandInterpreter.nextArgument();
		FeatureIdImpl featureID = SimpleFeatureBuilder.createDefaultFeatureIdentifier(fid);
        DeleteFeatureCommand deleteFeatureCommand = new DeleteFeatureCommand(new DeleteFeatureProvider(placesLayer, featureID), layerProvider);
        deleteFeatureCommand.setMap(map);
        project.sendASync(deleteFeatureCommand);
	}
	
	@Override
	public String getHelp() {
		return "HidePlacesCommand.getHelp()";
	}

}
