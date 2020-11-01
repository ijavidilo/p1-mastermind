package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;


import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.ResumeControllerImplementation;

public class ResumeDispatcher extends Dispatcher {

	public ResumeDispatcher(ResumeControllerImplementation resumeControllerImplementation) {
		super(resumeControllerImplementation);
	}

	@Override
	public void dispatch() {
		boolean newGame = this.tcpip.receiveBoolean();
		((ResumeControllerImplementation)this.acceptorController).resume(newGame);
		System.out.println("	> ResumeDispatcher");
	}

}
