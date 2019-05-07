package fr.upem.capcha.engine;

public class MatchPanneau extends Match {

	public MatchPanneau() {
		super();
	}
	
	public static boolean check(Item item) {
		if (item instanceof Item) {
			return true;
		} else {
			return false;
		}
	}
}
