package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View {

	public View(StartController startController, ProposalController proposalController, ResumeController resumeController) {
	}

	@Override
	protected void start() {
	}

	@Override
	protected boolean proposal() {
		return false;
	}

	@Override
	protected boolean isResume() {
		return false;
	}

}
