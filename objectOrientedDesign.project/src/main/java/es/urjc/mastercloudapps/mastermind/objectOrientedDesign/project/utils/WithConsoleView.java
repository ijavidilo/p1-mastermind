package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils;

public abstract class WithConsoleView {

	protected Console console;

	protected WithConsoleView() {
		this.console = new Console();
	}
	
}