package com.github.rytina.udigger.cli.commands;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

public class HidePlacesCommand implements CommandProvider{

	public void _hideplaces(CommandInterpreter commandInterpreter) {
		commandInterpreter.println("HidePlacesCommand._hideplaces()");
	}
	
	@Override
	public String getHelp() {
		return "HidePlacesCommand.getHelp()";
	}

}
