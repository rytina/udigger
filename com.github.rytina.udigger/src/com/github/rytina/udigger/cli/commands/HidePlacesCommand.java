package com.github.rytina.udigger.cli.commands;

import java.util.ArrayList;
import java.util.List;

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
import org.opengis.filter.identity.FeatureId;
import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

import com.github.rytina.udigger.DeleteFeatureProvider;
import com.github.rytina.udigger.filter.FeatureIDFilterImpl;
import com.github.rytina.udigger.map.commands.CustomDeleteFeatureCommand;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

public class HidePlacesCommand extends AbstractPlacesCommand implements
		CommandProvider {

	public void _hideplaces(CommandInterpreter commandInterpreter) {
		GremlinGroovyScriptEngine engine = new GremlinGroovyScriptEngine();
		try {
			List<Vertex> verticies = executeQuery(commandInterpreter, engine);

			Project project = ProjectPlugin.getPlugin().getProjectRegistry()
					.getCurrentProject();
			IMap map = ApplicationGIS.getActiveMap();
			ILayer placesLayer = map.getMapLayers().get(1);
			IBlockingProvider<ILayer> layerProvider = new StaticBlockingProvider<ILayer>(
					placesLayer);
			List<FeatureId> featureIDs = getFeatureIDs(verticies);
			FeatureIDFilterImpl filter = new FeatureIDFilterImpl(featureIDs);
			CustomDeleteFeatureCommand deleteFeatureCommand = new CustomDeleteFeatureCommand(
					filter, layerProvider);
			deleteFeatureCommand.setMap(map);
			project.sendASync(deleteFeatureCommand);
		} catch (Throwable e) {
			commandInterpreter.printStackTrace(e);
		}
		finally {
			try {
				engine.eval("g.shutdown()");
			} catch (Throwable e) {
				// ignore
			}
		}
	}

	private List<FeatureId> getFeatureIDs(List<Vertex> verticies) {
		List<FeatureId> ids = new ArrayList<FeatureId>();
		for (Vertex v : verticies) {
			Object fid =  v.getProperty("vid");
			if(fid!=null){
				FeatureIdImpl id = SimpleFeatureBuilder.createDefaultFeatureIdentifier(fid.toString());
				Assert.isNotNull(id);
				ids.add(id);
			}
		}
		return ids;
	}

	@Override
	public String getHelp() {
		return "HidePlacesCommand.getHelp()";
	}

}
