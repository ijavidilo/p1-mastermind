package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

class StartView extends WithConsoleView {

	private StartController startController;

	StartView(StartController startController) {
		this.startController = startController;
	}

	void interact() {
		MessageView.TITLE.writeln();
		startController.getSecretCombination();
	}

}
