/* uDig - User Friendly Desktop Internet GIS client
 * http://udig.refractions.net
 * (C) 2004-2012, Refractions Research Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * (http://www.eclipse.org/legal/epl-v10.html), and the Refractions BSD
 * License v1.0 (http://udig.refractions.net/files/bsd3-v10.html).
 */
package com.github.rytina.udigger.map.commands;

import java.util.ArrayList;
import java.util.List;

import net.refractions.udig.core.IBlockingProvider;
import net.refractions.udig.core.internal.FeatureUtils;
import net.refractions.udig.project.ILayer;
import net.refractions.udig.project.command.MapCommand;
import net.refractions.udig.project.command.PostDeterminedEffectCommand;
import net.refractions.udig.project.command.UndoableMapCommand;
import net.refractions.udig.project.internal.Layer;
import net.refractions.udig.project.internal.Messages;
import net.refractions.udig.project.internal.commands.edit.AbstractEditCommand;
import org.opengis.filter.Filter;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.geotools.data.FeatureStore;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.GeoTools;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.filter.FilterFactory;

/**
 * Deletes a feature from the map.
 * 
 * @author Jesse
 * @since 1.0.0
 */
public class CustomDeleteFeatureCommand extends AbstractEditCommand implements UndoableMapCommand, 
    PostDeterminedEffectCommand {


    private IBlockingProvider<ILayer> layerProvider;

    private final Filter filter;
    
    protected boolean done;


	private ILayer oldLayer;

    /**
     * Construct <code>DeleteFeatureCommand</code>.
     */
    public CustomDeleteFeatureCommand( Filter filter, IBlockingProvider<ILayer> layerProvider ) {
        this.layerProvider = layerProvider;
        this.filter = filter;
    }

    /**
     * @see net.refractions.udig.project.command.MapCommand#run()
     */
    public void run( IProgressMonitor monitor ) throws Exception {
        execute(monitor);
    }

    public boolean execute( IProgressMonitor monitor ) throws Exception {
        monitor.beginTask(Messages.DeleteFeatureCommand_deleteFeature, 4); 
        monitor.worked(1);
        oldLayer = layerProvider.get(new SubProgressMonitor(monitor, 1));
        FilterFactory filterFactory = CommonFactoryFinder.getFilterFactory(GeoTools.getDefaultHints());
        List<String> featureIDs = new ArrayList<String>();
		oldLayer.getResource(FeatureStore.class, null).removeFeatures(filter);
        map.getEditManagerInternal().setEditFeature(null, null);
        return true;
    }

    /**
     * @see net.refractions.udig.project.command.MapCommand#getName()
     */
    public String getName() {
        return Messages.DeleteFeatureCommand_deleteFeature; 
    }

	@Override
	public void rollback(IProgressMonitor monitor) throws Exception {
		// TODO Auto-generated method stub
	}


}
