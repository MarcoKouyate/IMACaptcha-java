package fr.upem.capcha.engine;
import  fr.upem.capcha.engine.Item;

class Match {
	static Item item1 = new Item(true);
	static Item item2 = new Item(false);
	
	static public boolean checkAnswers() {
		return item1.selected() && item2.selected();
	}
}
