package com.github.rytina.udigger.orientdb.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.script.ScriptException;

import jline.History;

import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.codehaus.groovy.tools.shell.InteractiveShellRunner;
import org.eclipse.core.runtime.Assert;
import org.junit.Test;

import com.github.rytina.udigger.osm.OsmNd;
import com.github.rytina.udigger.osm.OsmNode;
import com.github.rytina.udigger.osm.OsmWay;
import com.orientechnologies.orient.core.db.graph.OGraphDatabase;
import com.orientechnologies.orient.core.id.ORecordId;
import com.orientechnologies.orient.core.index.OIndex;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.core.metadata.schema.OProperty;
import com.orientechnologies.orient.core.metadata.schema.OType;
import com.orientechnologies.orient.core.metadata.schema.OClass.INDEX_TYPE;
import com.orientechnologies.orient.core.record.impl.ODocument;
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
	
	
//	@Test
//	public static void importWays(List<OsmWay> ways) {
//		OGraphDatabase odb = new OGraphDatabase(
//				"remote:localhost/osm_stuttgart_city").open("admin", "admin");
//		try {
//			OClass oClass = odb.getMetadata().getSchema().getClass("Place");
//			OProperty prop = oClass.getProperty("vid");
//			OIndex<?> index = prop.createIndex(INDEX_TYPE.UNIQUE);
//			OrientGraph graph = new OrientGraph(odb);
//			for (OsmWay way : ways) {
//				Vertex lastVertex=null;
//				for (OsmNd nd : way.getNd()) {
//					ORecordId id = (ORecordId)index.get(nd.getRef());
//					Assert.isNotNull(id);
//					Vertex currentVertex = graph.getVertex(id);
//					if(lastVertex!=null){
//						graph.addEdge(null, lastVertex, currentVertex, "way");
//					}
//					lastVertex=currentVertex;
//				}
//			}
//			odb.commit();
//			System.out.println("OSMimportToOrientDBTest.importWays() - commited successfully" );
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}finally {
//			odb.close();
//		}		
//	}


}
