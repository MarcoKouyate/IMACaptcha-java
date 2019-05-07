package fr.upem.capcha.engine;
import  fr.upem.capcha.engine.Item;
import  fr.upem.capcha.engine.Panneau;
import java.util.ArrayList;

class Match {

	static Item sample = new Panneau(true);
	
    static ArrayList<Item> items = new ArrayList<Item>();
	
	public Match() {
		initializeList();
	}
	
	
	private void initializeList() {
		for (int i = 0; i < 5; i++) {
			items.add(new Item(true));
		}
		items.add(new Item(true));
		items.add(new Panneau(true));
		items.add(new Item(true));
		items.add(new Panneau(true));
	}
	
	public boolean checkAnswers() {
		boolean isCorrect = true;
		
		for (int i = 0; i < items.size(); i++) {
			System.out.println(i + " : " + sample.check(items.get(i)));
			isCorrect = isCorrect & sample.check(items.get(i));
		}
		
		return isCorrect;
	}
}
