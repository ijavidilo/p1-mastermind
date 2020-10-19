package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.*;

public class View extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View implements ControllerVisitor {

	@Override
	public void visit(StartController startController) {
	}

	@Override
	public void visit(ProposalController proposalController) {

	}

	@Override
	public void visit(ResumeController resumeController) {

	}

	@Override
	public void interact(UseCaseController useCaseController) {
		useCaseController.accept(this);
	}
}
