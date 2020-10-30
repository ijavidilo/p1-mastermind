package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

import es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types.Color;

import java.util.List;

class ProposedCombination extends Combination {

	ProposedCombination(List<Color> colors) {
		this.colors = colors;
	}

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

}
