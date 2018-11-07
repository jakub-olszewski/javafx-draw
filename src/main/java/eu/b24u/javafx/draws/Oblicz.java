package eu.b24u.javafx.draws;

import eu.b24u.javafx.element.Punkt;

public class Oblicz {

	public static double odlegloscPomiedzyDwomaPunktami(Punkt pierwszy, Punkt drugi) {
		return Math.sqrt(
				(drugi.x - pierwszy.x) * (drugi.x - pierwszy.x) + (drugi.y - pierwszy.y) * (drugi.y - pierwszy.y));
	}

}