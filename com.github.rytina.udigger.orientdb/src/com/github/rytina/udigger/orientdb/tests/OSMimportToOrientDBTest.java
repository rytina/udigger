package com.github.rytina.udigger.orientdb.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.script.ScriptException;

import jline.History;

import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.codehaus.groovy.tools.shell.InteractiveShellRunner;
import org.eclipse.core.runtime.Assert;
import org.junit.Test;

import com.github.rytina.udigger.osm.OsmNode;
import com.orientechnologies.orient.core.db.graph.OGraphDatabase;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.object.db.graph.OGraphVertex;
import com.tinkerpop.blueprints.TransactionalGraph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;
import com.tinkerpop.gremlin.Imports;
import com.tinkerpop.gremlin.groovy.Gremlin;
import com.tinkerpop.gremlin.groovy.console.ErrorHookClosure;
import com.tinkerpop.gremlin.groovy.console.NullResultHookClosure;
import com.tinkerpop.gremlin.groovy.console.PromptClosure;
import com.tinkerpop.gremlin.groovy.console.ResultHookClosure;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;

public class OSMimportToOrientDBTest {

	public static void importNodes(Collection<OsmNode> nodes) {
		OGraphDatabase odb = new OGraphDatabase(
				"remote:localhost/osm_stuttgart_city").open("admin", "admin");
		try {
			TransactionalGraph graph = new OrientGraph(odb);
			for (OsmNode osmNode : nodes) {
//				Vertex vertex = graph.addVertex("class:Place");
//				vertex.setProperty("vid", osmNode.getId());
//				vertex.setProperty("lon", osmNode.getLon());
//				vertex.setProperty("lat", osmNode.getLat());
			}

			odb.commit();
			System.out.println("OSMimportToOrientDBTest.importNodes() - commited successfully" );
		} finally {
			odb.close();
		}
	}

}
