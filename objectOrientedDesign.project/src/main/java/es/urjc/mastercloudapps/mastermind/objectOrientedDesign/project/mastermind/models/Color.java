package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.models;

public enum Color {
	RED,
	BLUE,
	YELLOW,
	GREEN,
	ORANGE,
	PURPLE;

	static int length() {
		return Color.values().length;
	}
	
}
