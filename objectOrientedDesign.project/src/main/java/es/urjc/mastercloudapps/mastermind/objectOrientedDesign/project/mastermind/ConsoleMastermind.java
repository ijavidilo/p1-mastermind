package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console.View;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;

public class ConsoleMastermind {

	private Game game;
	private View view;

	private ConsoleMastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}
