package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.Console;

public class ColorView extends es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.ColorView {

    public ColorView(Color color) {
        super(color);
    }

    public void write() {
        new Console().write(ColorView.INITIALS[this.color.ordinal()]);
    }

}
