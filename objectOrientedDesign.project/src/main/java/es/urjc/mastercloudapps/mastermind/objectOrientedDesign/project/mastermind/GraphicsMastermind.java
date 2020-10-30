package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.View;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }
}
