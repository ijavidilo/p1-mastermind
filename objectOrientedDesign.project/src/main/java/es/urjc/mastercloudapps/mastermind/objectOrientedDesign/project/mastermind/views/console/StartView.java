package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;

class StartView extends SubView {

	StartView(Logic logic) {
		super(logic);
	}

	void interact() {
		MessageView.TITLE.writeln();
		logic.getSecretCombination();
	}

}
