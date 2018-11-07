package eu.b24u.javafx.draws;

import eu.b24u.javafx.minecraft.engine.Plotno;

/**
 * Klasa rysujaca kulke
 * 
 * @author student
 *
 */
public class Kulka extends Rysunek {

	int promien = 50;

	/**
	 * Konstruktor do tworzenia kulki
	 * 
	 * @param plotno
	 * @param x
	 * @param y
	 */
	public Kulka(Plotno plotno, int x, int y) {
		super(plotno, x, y);
	}

	@Override
	public void rysuj() {
		plotno.rysujOkrag(x - promien / 2, y - promien / 2, promien, javafx.scene.paint.Color.RED);
	}


}
