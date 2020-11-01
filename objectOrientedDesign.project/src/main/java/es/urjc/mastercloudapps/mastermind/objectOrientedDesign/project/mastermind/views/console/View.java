package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.*;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View implements ControllerVisitor  {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(UseCaseController useCaseController) {
		useCaseController.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(ProposalController proposalController) {
		this.proposalView.interact(proposalController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
}