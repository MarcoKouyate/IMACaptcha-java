package fr.upem.capcha.engine;
import fr.upem.capcha.engine.Match;

public class MainEngine {
	public static void launch(String[] args) {
		Match matching = new Match();
		
		if (matching.checkAnswers()) {
			System.out.println("Ca passe");
		} else {
			System.out.println("Ca casse");
		}
	}
}
