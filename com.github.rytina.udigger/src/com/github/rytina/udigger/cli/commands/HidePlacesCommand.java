package com.github.rytina.udigger.cli.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.refractions.udig.core.IBlockingProvider;
import net.refractions.udig.core.StaticBlockingProvider;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;
import net.refractions.udig.project.internal.Project;
import net.refractions.udig.project.internal.ProjectPlugin;
import net.refractions.udig.project.ui.ApplicationGIS;

import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.filter.identity.FeatureIdImpl;
import org.opengis.filter.identity.FeatureId;

import com.github.rytina.udigger.filter.FeatureIDFilter;
import com.github.rytina.udigger.filter.FeatureIDFilterImpl;
import com.github.rytina.udigger.map.commands.CustomDeleteFeatureCommand;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;

public class HidePlacesCommand extends AbstractPlacesCommand implements
		CommandProvider {

	public void _hideplaces(CommandInterpreter commandInterpreter) {
		GremlinGroovyScriptEngine engine = new GremlinGroovyScriptEngine();
		try {
			Project project = ProjectPlugin.getPlugin().getProjectRegistry()
					.getCurrentProject();
			IMap map = ApplicationGIS.getActiveMap();
			ILayer placesLayer = map.getMapLayers().get(1);
			IBlockingProvider<ILayer> layerProvider = new StaticBlockingProvider<ILayer>(
					placesLayer);
			org.opengis.filter.Filter filter = null;
			if(commandInterpreter.nextArgument().equalsIgnoreCase("all")){
				filter =  FeatureIDFilter.ALL;
			}else{
				List<Vertex> verticies = executeQuery(commandInterpreter, engine);
				Set<String> featureIDs = getFeatureIDs(verticies);
				filter = new FeatureIDFilterImpl(featureIDs);
			}
			
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

	private Set<String> getFeatureIDs(List<Vertex> verticies) {
		Set<String> ids = new HashSet<String>();
		for (Vertex v : verticies) {
			Object fid =  v.getProperty("vid");
			if(fid!=null){
				ids.add(fid.toString());
			}
		}
		return ids;
	}

	@Override
	public String getHelp() {
		return "HidePlacesCommand.getHelp()";
	}

}
