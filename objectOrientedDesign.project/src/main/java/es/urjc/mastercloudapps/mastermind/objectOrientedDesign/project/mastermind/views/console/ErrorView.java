package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.Console;

class ErrorView extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}
