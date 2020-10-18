package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Logic;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(Logic logic) {
		return new View(logic);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}