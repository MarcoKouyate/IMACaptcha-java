package fr.upem.capcha.engine;
import fr.upem.capcha.engine.Match;

public class MainEngine {
	public static void launch(String[] args) {
		if (Match.checkAnswers()) {
			System.out.println("Ca passe");
		} else {
			System.out.println("Ca casse");
		}
	}
}
