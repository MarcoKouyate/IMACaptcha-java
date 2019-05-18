package fr.upem.capcha.images.panneaux;
import  fr.upem.capcha.images.Item;

public class Panneau extends Item {

	public Panneau(boolean isSelected) {
		super(isSelected);
	}
	
	@Override public String toString() {
		return "Panneau";
	}

	@Override public boolean check(Item item) {
		if (item instanceof Panneau) {
			return true;
		} else {
			return false;
		}
	}	
}
