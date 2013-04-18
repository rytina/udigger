/* uDig - User Friendly Desktop Internet GIS client
 * http://udig.refractions.net
 * (C) 2004, Refractions Research Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * (http://www.eclipse.org/legal/epl-v10.html), and the Refractions BSD
 * License v1.0 (http://udig.refractions.net/files/bsd3-v10.html).
 */
package com.github.rytina.udigger.map.commands;

import java.util.List;

import net.refractions.udig.core.internal.FeatureUtils;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.command.AbstractCommand;
import net.refractions.udig.project.command.UndoableMapCommand;
import net.refractions.udig.project.command.factory.EditCommandFactory;
import net.refractions.udig.tool.edit.internal.Messages;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.geotools.data.DefaultQuery;
import org.geotools.data.FeatureStore;
import org.geotools.feature.FeatureIterator;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.filter.Filter;

import com.github.rytina.udigger.map.commands.parameter.CreateNewFeaturesParameter;
import com.vividsolutions.jts.geom.Geometry;

public class CreateNewFeaturesCommand extends AbstractCommand implements UndoableMapCommand {

    private final ILayer layer;
	private final List<CreateNewFeaturesParameter> paraList;
	private CommandInterpreter cmdInterpreter;


    public CreateNewFeaturesCommand(List<CreateNewFeaturesParameter> paraList,
			ILayer placesLayer, CommandInterpreter cmdInterpreter) {
    	this.paraList = paraList;
    	this.layer = placesLayer;
    	this.cmdInterpreter = cmdInterpreter;
	}


	public void run( IProgressMonitor monitor ) throws Exception {
		try{
        createFeature(new SubProgressMonitor(monitor, 100));
		}catch (Throwable e) {
			cmdInterpreter.printStackTrace(e);
		}
    }


    private void createFeature( IProgressMonitor monitor ) throws Exception  {
    	monitor.subTask("rendering features - area");
    	monitor.beginTask("rendering features - area", 100);
        Object[] attributeArray = new Object[layer.getSchema().getAttributeCount()];
        int lastWorkedInPercent = -1;
        for (int i=0; i< paraList.size();i++) {
        	SimpleFeature feature=SimpleFeatureBuilder.build(layer.getSchema(), attributeArray, paraList.get(i).getId()); 
            feature.setDefaultGeometry(paraList.get(i).getGeo());
            UndoableMapCommand createCommand = EditCommandFactory.getInstance().createAddFeatureCommand(feature, layer);
            createCommand.setMap(getMap());
            createCommand.run(new NullProgressMonitor());
            int workedInPercent = (int) ((i+1)/(float)paraList.size()*100);
            monitor.worked(workedInPercent);
            if(lastWorkedInPercent < workedInPercent){
            	cmdInterpreter.println("rendering of places "+workedInPercent +"%");
            }
            lastWorkedInPercent = workedInPercent;
		}
        monitor.done();
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public void rollback( IProgressMonitor monitor ) throws Exception {
    }

}
