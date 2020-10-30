package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Error;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.Console;

public class ErrorView extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.ErrorView {

	public ErrorView(Error error) {
		super(error);
	}

	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}

}
