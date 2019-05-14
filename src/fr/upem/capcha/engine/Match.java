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
//		for (int i = 0; i < 9; i++) {
//			items.add(new Item(true));
//		}
		
		items.add(new Item(false));
		items.add(new Panneau(true));
		items.add(new Panneau(true));
		items.add(new Item(false));
		items.add(new Item(false));
		items.add(new Panneau(true));
		items.add(new Item(false));
		items.add(new Panneau(true));
	}
	
	public boolean checkAnswers() {
		boolean isTotalCorrect = true;
		
		for (int i = 0; i < items.size(); i++) {
			boolean isCorrect = sample.check(items.get(i));
			boolean isSelected = items.get(i).selected();
					
			if (isCorrect) {
				if (isSelected) {
					
				} 
				System.out.println(i + " correct : " + isCorrect + " / selected : " + isSelected );
				isTotalCorrect = isTotalCorrect & isCorrect & isSelected;
			}
		}
		
		return isTotalCorrect;
	}
}
