package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public abstract class Mastermind {

	private Game game;
	private StartController startController;
	private ProposalController proposalController;
	private ResumeController resumeController;
	private View view;

	protected Mastermind() {
		this.game = new Game();
		this.startController = new StartController(this.game);
		this.proposalController = new ProposalController(this.game);
		this.resumeController = new ResumeController(this.game);
		this.view = this.createView(this.startController, this.proposalController, this.resumeController);
	}

	protected abstract View createView(StartController startController, ProposalController proposalController, ResumeController resumeController);

	protected void play() {
		this.view.interact();
	}

}