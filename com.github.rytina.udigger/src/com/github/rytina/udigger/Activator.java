package com.github.rytina.udigger;

import org.eclipse.osgi.framework.console.CommandProvider;
import org.eclipse.ui.IStartup;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.github.rytina.udigger.cli.commands.HidePlacesCommand;
import com.github.rytina.udigger.cli.commands.ShowPlacesCommand;

public class Activator implements BundleActivator, IStartup {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		context.registerService(CommandProvider.class.getName(), new ShowPlacesCommand(), null);
		context.registerService(CommandProvider.class.getName(), new HidePlacesCommand(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

	@Override
	public void earlyStartup() {
		System.out.println("Activator.earlyStartup()");
	}

}
