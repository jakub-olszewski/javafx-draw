package eu.b24u.javafx.draws;

import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

/**
 * Klasa rysujaca kulke
 * 
 * @author student
 *
 */
public class Kulka extends Rysunek {

	int promien = 50;
	private Color kolor;

	/**
	 * Konstruktor do tworzenia kulki
	 * 
	 * @param plotno
	 * @param x
	 * @param y
	 */
	public Kulka(Plotno plotno, int x, int y, javafx.scene.paint.Color kolor) {
		super(plotno, x, y);
		this.kolor = kolor;
		rysuj();
	}

	@Override
	public void rysuj() {
		plotno.rysujOkrag(x - promien / 2, y - promien / 2, promien, kolor);
	}


}
