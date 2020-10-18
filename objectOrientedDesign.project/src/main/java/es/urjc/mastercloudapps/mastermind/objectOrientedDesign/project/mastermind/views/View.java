package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;

public abstract class View {

	protected Game game;

	public View(Game game) {
		this.game = game;
	}

	public void interact() {
		do {
			this.start();
			do {
			} while (!this.proposal());
		} while (this.isResume());
	}

	protected abstract void start();
	protected abstract boolean proposal();
	protected abstract boolean isResume();

}
