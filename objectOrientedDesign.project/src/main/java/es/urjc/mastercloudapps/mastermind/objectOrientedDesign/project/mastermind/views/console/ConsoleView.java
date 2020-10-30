package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public class ConsoleView extends View {
	
	private StartView startView;
	
	private ProposalView proposalView;
	
	private ResumeView resumeView;
	
	public ConsoleView(){
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
	}

	
	public void visit(StartController startController) {
		this.startView.interact(startController);		
	}

	
	public void visit(ProposalController proposalController) {
		this.proposalView.interact(proposalController);
	}

	
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

}
