package fr.upem.capcha;
import java.io.IOException;

import fr.upem.capcha.ui.MainUi;
import fr.upem.capcha.engine.MainEngine;

public class Main {

	public static void main(String[] args) throws IOException {
		MainEngine.launch(args);
		MainUi.launch(args);
	}

}
