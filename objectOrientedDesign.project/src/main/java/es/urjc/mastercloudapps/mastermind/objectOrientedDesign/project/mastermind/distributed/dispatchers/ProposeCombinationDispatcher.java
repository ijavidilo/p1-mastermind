package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.distributed.dispatchers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.implementation.PlayControllerImplementation;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;

import java.util.ArrayList;
import java.util.List;



public class ProposeCombinationDispatcher extends Dispatcher {

	public ProposeCombinationDispatcher(PlayControllerImplementation playControllerImplementation) {
		super(playControllerImplementation);
	}

	@Override
	public void dispatch() {
		int length = this.tcpip.receiveInt();
		List<Color> colors = new ArrayList<Color>();
		for (int i=0; i<length; i++) {
			colors.add(this.tcpip.receiveColor());
		}
		this.tcpip.send(((PlayControllerImplementation) this.acceptorController).addProposedCombination(colors));
		System.out.println("	> ProposeCombinationDispatcher -> "+ colors.toString());
	}

}
