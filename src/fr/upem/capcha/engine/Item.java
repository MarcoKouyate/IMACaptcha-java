package fr.upem.capcha.engine;

public class Item {
	boolean isSelected;
	
	public Item (boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public boolean selected() {
		return isSelected;
	}
	
	public String toString() {
		return "Item";
	}
	
	public boolean check(Item item) {
		if (item instanceof Item) {
			return true;
		} else {
			return false;
		}
	}
}
