package com.github.rytina.udigger.cli.commands;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.IMap;
import net.refractions.udig.project.internal.Project;
import net.refractions.udig.project.internal.ProjectPlugin;
import net.refractions.udig.project.ui.ApplicationGIS;
import net.refractions.udig.tools.edit.commands.CreateNewOrSelectExitingFeatureCommand;

public class ShowPlacesCommand implements CommandProvider {

	public void _showplaces(CommandInterpreter commandInterpreter) {
		GremlinGroovyScriptEngine engine = new GremlinGroovyScriptEngine();
		try {
			List<Vertex> verticies = executeQuery(commandInterpreter, engine);
			Project project = ProjectPlugin.getPlugin().getProjectRegistry()
					.getCurrentProject();
			IMap map = ApplicationGIS.getActiveMap();
			GeometryFactory fac = new GeometryFactory();
			ILayer placesLayer = map.getMapLayers().get(1);
			for (Vertex vertex : verticies) {
				Point geo = fac
						.createPoint(new Coordinate(Double.parseDouble(vertex
								.getProperty("lon").toString()), Double
								.parseDouble(vertex.getProperty("lat")
										.toString())));
				String id = toIdString(vertex.getProperty("vid"));
				if(id!=null){
					CreateNewOrSelectExitingFeatureCommand command = new CreateNewOrSelectExitingFeatureCommand(
							id, placesLayer, geo);
					command.setMap(map);
					project.sendASync(command);					
				}
			}
		} catch (Throwable e) {
			commandInterpreter.printStackTrace(e);
		} finally {
			try {
				engine.eval("g.shutdown()");
			} catch (Throwable e) {
				// ignore
			}
		}
	}

	private String toIdString(Object property) {
		String id = null;
		if (property == null) {
			return null;
		}
		id = property.toString();
		Assert.isNotNull(id);
		return id;
	}

	private List<Vertex> executeQuery(CommandInterpreter commandInterpreter,
			GremlinGroovyScriptEngine engine) {
		List<Vertex> vercities = new ArrayList<Vertex>();
		try {
			System.out
					.println(engine
							.eval("g = new OrientGraph(\"remote:localhost/osm_stuttgart_city\");"));
			for (Object o : (Iterable) engine.eval(commandInterpreter
					.nextArgument())) {
				if (o instanceof Vertex) {
					vercities.add((Vertex) o);
				}
			}
			return vercities;
		} catch (Throwable e) {
			commandInterpreter.printStackTrace(e);
		}
		return vercities;
	}

	@Override
	public String getHelp() {
		return "ShowPlacesCommand.getHelp()";
	}

}
