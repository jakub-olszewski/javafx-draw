package eu.b24u.javafx.draws.element;

import eu.b24u.javafx.draws.Rysunek;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class Domek extends Rysunek {

	public Domek(Plotno plotno, int x, int y) {
		super(plotno, x, y);
	}

	@Override
	public void rysuj() {
		Punkt p1 = new Punkt(x, y);
		Punkt p2 = new Punkt(x, y);
		plotno.rysujPelnyProstokat(p1, p2, Color.BROWN);

	}

}
