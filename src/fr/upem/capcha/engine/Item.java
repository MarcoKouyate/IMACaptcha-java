package fr.upem.capcha.engine;

public class Item {
	boolean isSelected;
	
	public Item (boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public boolean selected() {
		return isSelected;
	}
}
