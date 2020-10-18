package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console.View;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
