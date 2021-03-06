package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class MushroomCube extends Cube {

	public MushroomCube(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
	}

	@Override
	protected void buduj(Plotno plotno) {
		// punkt rysowania to punkt ktory wpisujemy
		// w drugim argumencie czyli...
		// MushroomCube(argument_pierwszy,argument_drugi);
		Punkt rysowania = getWspolrzedne();
		Color kolorCzerwony = Color.rgb(195, 0, 0);

		// pien jest przesuniety od punktu rysowania
		// o 25 na x
		// o 10 na y
		Punkt pienPunkt = rysowania.przesun(27, 10);

		// rysujemy prostokat o kolorze BROWN
		// w punkcie pienPunkt o wymiarach
		// szerokosci 5 i wysokosci 30
		// kolor rgb
		// https://www.w3schools.com/colors/colors_rgb.asp
		plotno.rysujPelnyProstokat(pienPunkt, 8, 3, Color.WHITE);

		// rysujemy prostokat o kolorze DARKGREEN
		// w punkcie koronaPunkt o wymiarach
		// szerokosci 30 i wysokosci 30
		Punkt koronaPunkt = rysowania.przesun(25, 10);
		plotno.rysujPelnyProstokat(koronaPunkt, 3, 8, kolorCzerwony);

	}

}
