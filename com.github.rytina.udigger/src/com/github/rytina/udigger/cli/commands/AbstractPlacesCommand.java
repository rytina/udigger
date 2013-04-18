package com.github.rytina.udigger.cli.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.osgi.framework.console.CommandInterpreter;

import com.github.rytina.udigger.map.commands.CreateInitialFeaturesCommand;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;

public abstract class AbstractPlacesCommand {

	private static boolean initialized = false;
	
	protected List<Vertex> executeQuery(CommandInterpreter commandInterpreter,
			GremlinGroovyScriptEngine engine) {
		if(!initialized){
			CreateInitialFeaturesCommand.initFeatures();
		}
		initialized = true;
		List<Vertex> vercities = new ArrayList<Vertex>();
		try {
			System.out
					.println(engine
							.eval("g = new OrientGraph(\"remote:localhost/osm_stuttgart_city\");"));
			long begin = System.currentTimeMillis();
			commandInterpreter.println("executing orientdb query...");
			Iterable queryResult = (Iterable) engine.eval(commandInterpreter.nextArgument());
			commandInterpreter.println("orientdb query executed. It took " + (System.currentTimeMillis() - begin) +"ms");
			for (Object o : queryResult) {
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
}
