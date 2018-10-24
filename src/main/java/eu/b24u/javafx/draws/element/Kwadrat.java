package eu.b24u.javafx.draws.element;

import eu.b24u.javafx.draws.Rysunek;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;

public class Kwadrat extends Rysunek {

	/**
	 * @param plotno
	 */
	public Kwadrat(Plotno plotno) {
		super(plotno);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.b24u.javafx.draws.DrawElement#rysuj()
	 */
	@Override
	public void rysuj() {
		Punkt punkt1 = new Punkt(180, 180, "Punkt1");
		Punkt punkt2 = new Punkt(180, 40, "Punkt2");
		Punkt punkt4 = new Punkt(40, 180, "Punkt4");
		Punkt punkt3 = new Punkt(40, 40, "Punkt3");

		plotno.rysujLinie(punkt1, punkt2);
		plotno.rysujLinie(punkt2, punkt3);
		plotno.rysujLinie(punkt3, punkt4);
		plotno.rysujLinie(punkt4, punkt1);

		plotno.rysujPunkt(punkt1);
		plotno.rysujPunkt(punkt2);
		plotno.rysujPunkt(punkt3);
		plotno.rysujPunkt(punkt4);

		// TODO Auto-generated method stub

	}

}