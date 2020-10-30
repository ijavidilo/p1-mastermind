package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.Controller;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(Controller controller) {
		controller.accept(this);
	}

}
