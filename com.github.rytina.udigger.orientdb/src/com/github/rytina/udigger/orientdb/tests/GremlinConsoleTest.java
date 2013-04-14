package com.github.rytina.udigger.orientdb.tests;

import java.io.File;
import java.io.IOException;

import javax.script.ScriptException;

import jline.History;

import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.codehaus.groovy.tools.shell.InteractiveShellRunner;
import org.junit.Test;

import com.orientechnologies.orient.core.db.graph.OGraphDatabase;
import com.tinkerpop.gremlin.Imports;
import com.tinkerpop.gremlin.groovy.Gremlin;
import com.tinkerpop.gremlin.groovy.console.ErrorHookClosure;
import com.tinkerpop.gremlin.groovy.console.NullResultHookClosure;
import com.tinkerpop.gremlin.groovy.console.PromptClosure;
import com.tinkerpop.gremlin.groovy.console.ResultHookClosure;
import com.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;

public class GremlinConsoleTest {
	

	@Test
	public void testGremlinConsole() {
		GremlinGroovyScriptEngine engine = new GremlinGroovyScriptEngine();
		try {
			System.out.println(engine.eval("g = new OrientGraph(\"remote:localhost/osm_stuttgart_city\");"));
			for ( Object o: (Iterable)engine.eval("g.V[0..20000].lon")) {
				System.out.println(o);
			}
			System.out.println(engine.eval("g.shutdown()"));
			
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
	



}