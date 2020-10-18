package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

public abstract class View {

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
