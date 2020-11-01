package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;


import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;

public class LooserDispatcher extends Dispatcher {

	public LooserDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		this.tcpip.send(((PlayControllerImplementation)this.acceptorController).isLooser());
		System.out.println("	> LooserDispatcher -> "+ ((PlayControllerImplementation)this.acceptorController).isLooser());
	}

}
