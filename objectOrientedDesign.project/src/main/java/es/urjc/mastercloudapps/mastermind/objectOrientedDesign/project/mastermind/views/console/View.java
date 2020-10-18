package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(StartController startController, ProposalController proposalController, ResumeController resumeController) {
		this.startView = new StartView(startController);
		this.proposalView = new ProposalView(proposalController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected boolean proposal() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean isResume() {
		return this.resumeView.interact();
	}

}
