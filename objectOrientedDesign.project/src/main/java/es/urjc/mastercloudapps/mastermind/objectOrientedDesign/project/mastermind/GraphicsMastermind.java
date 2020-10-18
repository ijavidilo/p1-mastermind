package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}