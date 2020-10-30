package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.console;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.controllers.PlayController;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.views.MessageView;
import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.utils.WithConsoleView;

import java.util.ArrayList;
import java.util.List;

class ProposedCombinationView extends WithConsoleView {

    private PlayController playController;

    ProposedCombinationView(PlayController playController) {
        this.playController = playController;
    }

    void write(int position) {
        for (Color color : this.playController.getColors(position)) {
            new ColorView(color).write();
        }
    }

    List<Color> read() {
        String characters = this.console.readString(MessageView.PROPOSED_COMBINATION.getMessage());
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < characters.length(); i++) {
            colors.add(ColorView.getInstance(characters.charAt(i)));
        }
        return colors;
    }

}
