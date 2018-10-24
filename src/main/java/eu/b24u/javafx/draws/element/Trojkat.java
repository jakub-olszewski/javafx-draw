/**
 * 
 */
package eu.b24u.javafx.draws.element;

import eu.b24u.javafx.draws.Rysunek;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;

/**
 * @author student
 *
 */
public class Trojkat extends Rysunek {

	/**
	 * @param plotno
	 */
	public Trojkat(Plotno plotno) {
		super(plotno);
	}


	@Override
	public void rysuj() {
		plotno.wypiszTekst(50, 50, 12, "Trójkąt", javafx.scene.paint.Color.BLACK);

		Punkt punkt1 = new Punkt(50, 100, "Punkt 1");
		Punkt punkt2 = new Punkt(300, 100, "Punkt 2");
		Punkt punkt3 = new Punkt(300, 200, "Punkt 3");

		plotno.rysujLinie(punkt1, punkt2);
		plotno.rysujLinie(punkt2, punkt3);
		plotno.rysujLinie(punkt3, punkt1);

		plotno.rysujPunkt(punkt1);
		plotno.rysujPunkt(punkt2);
		plotno.rysujPunkt(punkt3);

	}

}
