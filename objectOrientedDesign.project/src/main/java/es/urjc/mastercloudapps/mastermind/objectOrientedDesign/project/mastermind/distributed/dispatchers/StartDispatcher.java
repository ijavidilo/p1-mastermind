package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.StartControllerImplementation;

public class StartDispatcher extends Dispatcher {

	public StartDispatcher(StartControllerImplementation startControllerImplementation) {
		super(startControllerImplementation);
	}

	@Override
	public void dispatch() {
		((StartControllerImplementation) this.acceptorController).start();
		System.out.println("	> StartDispatcher");
	}

}
