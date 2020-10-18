package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.YesNoDialog;

class ResumeView {

	private boolean newGame;

	ResumeView() {
		this.newGame = true;//Jpanel...
	}

	boolean isResumeGame() {
		MessageView.RESUME.write();
		return new YesNoDialog().read();
	}

}
