package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.*;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;

public class GraphicsView extends View implements ControllersVisitor {

    @Override
    public void visit(StartController startController) {
    }

    @Override
    public void visit(PlayController playController) {
    }

    @Override
    public void visit(ResumeController resumeController) {
    }

    @Override
    public void interact(AcceptorController acceptorController) {
        acceptorController.accept(this);
    }

}
