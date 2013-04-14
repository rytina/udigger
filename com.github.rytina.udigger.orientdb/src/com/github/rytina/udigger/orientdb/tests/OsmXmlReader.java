package com.github.rytina.udigger.orientdb.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.github.rytina.udigger.osm.OsmNode;
import com.github.rytina.udigger.osm.util.OsmResourceFactoryImpl;

public class OsmXmlReader {

	static{
	}
	
	public static void main(String[] args){
		ResourceSetImpl rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new OsmResourceFactoryImpl());
		URI uri = URI.createURI("file:C:/Users/rytina/git/udigger/com.github.rytina.udigger.orientdb/src/com/github/rytina/udigger/orientdb/tests/suttgart_city.osm");
		Resource resource = rSet.getResource(uri, true);
		EObject root = resource.getContents().get(0);
		TreeIterator<EObject> iter = root.eAllContents();
		List<OsmNode> nodes = new ArrayList<OsmNode>();
		while(iter.hasNext()){
			EObject next = iter.next();
			if(next instanceof OsmNode){
				nodes.add((OsmNode) next);
			}
		}
		OSMimportToOrientDBTest.importNodes(nodes);
		System.out.println("OsmXmlReader.main() - node count: " +nodes.size());
	}

}
