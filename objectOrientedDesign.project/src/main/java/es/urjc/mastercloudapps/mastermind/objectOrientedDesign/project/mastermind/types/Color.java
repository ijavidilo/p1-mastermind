package es.urjc.mastercloudapps.mastermind.objectOrientedDesign.project.mastermind.types;

public enum Color {
	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE;

	public static int length() {
		return Color.values().length;
	}
	
}
