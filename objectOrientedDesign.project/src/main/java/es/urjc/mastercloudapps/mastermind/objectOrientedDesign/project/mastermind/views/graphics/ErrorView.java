package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

class ErrorView extends WithConsoleView {

	private static final String[] MESSAGES = { 
			"Repeated colors",
			"Wrong colors, they must be: " + ColorView.allInitials(),
			"Wrong proposed combination length" };

	private Error error;

	ErrorView(Error error) {
		this.error = error;
	}
	
	void writeln() {
		this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
