package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models.Game;

public abstract class Controller {
    
    protected Game game;

	Controller(Game game) {
		this.game = game;
  }

}
