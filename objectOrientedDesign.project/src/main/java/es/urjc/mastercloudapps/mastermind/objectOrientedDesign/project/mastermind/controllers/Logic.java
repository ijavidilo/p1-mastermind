package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.State;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
	
	private State state;
	
	private Game game;
	
	private Map<StateValue, Controller> controllers;
		
	public Logic() {
		this.state = new State();
		this.game = new Game();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.game, this.state));
		this.controllers.put(StateValue.EXIT, null);
	}
	
	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}
	
}
