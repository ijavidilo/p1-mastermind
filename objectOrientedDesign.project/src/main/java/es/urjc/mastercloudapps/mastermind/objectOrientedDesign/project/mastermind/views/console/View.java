package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(Game game) {
		super(game);
		this.startView = new StartView();
		this.proposalView = new ProposalView(game);
		this.resumeView = new ResumeView(game);
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
