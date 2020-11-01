package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import java.util.List;

public class ProposedCombination extends Combination {

    ProposedCombination(List<Color> colors) {
        this.colors = colors;
    }

    boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

    boolean contains(Color color) {
        for (Color colorObj : this.colors) {
            if (colorObj == color) {
                return true;
            }
        }
        return false;
    }

    public List<Color> getColors() {
        return this.colors;
    }

}
