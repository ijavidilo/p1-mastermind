package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ProposalController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ResumeController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.StartController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(StartController startController, ProposalController proposalController, ResumeController resumeController) {
		return new View(startController, proposalController, resumeController);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}