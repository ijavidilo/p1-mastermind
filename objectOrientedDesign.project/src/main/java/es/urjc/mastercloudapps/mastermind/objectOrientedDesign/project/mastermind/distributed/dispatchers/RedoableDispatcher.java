package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;


import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;

public class RedoableDispatcher extends Dispatcher {

	public RedoableDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayControllerImplementation)this.acceptorController).redoable());
		System.out.println("	> RedoableDispatcher -> "+ ((PlayControllerImplementation)this.acceptorController).redoable());
	}

}
