package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;


import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;

public class UndoableDispatcher extends Dispatcher {

	public UndoableDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayControllerImplementation)this.acceptorController).undoable());
		System.out.println("	> UndoableDispatcher -> "+ ((PlayControllerImplementation)this.acceptorController).undoable());
	}

}
