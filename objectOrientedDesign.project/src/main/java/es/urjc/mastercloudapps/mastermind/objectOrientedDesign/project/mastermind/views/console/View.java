package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Logic logic) {
		this.startView = new StartView(logic);
		this.proposalView = new ProposalView(logic);
		this.resumeView = new ResumeView(logic);
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
