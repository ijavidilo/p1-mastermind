package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;

public class WinnerDispatcher extends Dispatcher {

	public WinnerDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayControllerImplementation)this.acceptorController).isWinner());
		System.out.println("	> WinnerDispatcher -> "+ ((PlayControllerImplementation)this.acceptorController).isWinner());
	}

}
