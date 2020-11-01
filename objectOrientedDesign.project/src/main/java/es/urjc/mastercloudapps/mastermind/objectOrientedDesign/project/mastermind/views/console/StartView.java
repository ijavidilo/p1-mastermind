package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;

class StartView {

	void interact(StartController startController) {
		MessageView.TITLE.writeln();
		startController.getSecretCombination();
	}

}
