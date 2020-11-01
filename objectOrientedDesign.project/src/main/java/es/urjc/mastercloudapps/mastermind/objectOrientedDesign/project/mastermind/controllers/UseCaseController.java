package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;

public abstract class UseCaseController {

	protected Game game;
	protected State state;

	UseCaseController(Game game, State state) {
		this.game = game;
		this.state = state;
	}
	int getWidth() {
		return this.game.getWidth();
	}

	public abstract void control();

}
