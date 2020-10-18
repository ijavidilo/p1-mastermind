package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import java.util.List;

public class ProposedCombination extends Combination {

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (Color colorObj : this.colors){
			if (colorObj == color) {
				return true;
			}
		}
		/*for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}*/
		return false;
	}

	public List<Color> getColors() {
		return this.colors;
	}

}
