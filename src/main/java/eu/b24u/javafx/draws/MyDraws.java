package eu.b24u.javafx.draws;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Aplikacja;
import eu.b24u.javafx.minecraft.engine.GameMenuBar;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.engine.Scena;
import javafx.scene.paint.Color;

public class MyDraws extends Aplikacja {

	public MyDraws() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GameMenuBar budujMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void zdarzenieStrzalkaWDol() {
		// TODO Auto-generated method stub

	}

	@Override
	public void zdarzenieStrzalkaWLewo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void zdarzenieStrzalkaWPrawo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void zdarzenieStrzalkaWGore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void zdarzenieNaKlikniecieWSpacje() {
		// TODO Auto-generated method stub

	}

	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("My Draws");
		scena.ustawRozmiar(1050, 1920);
		scena.zablokujOkno();
		plotno.ustawRozmiar(1050, 1920);

		// plotno.rysujOkrag(300, 300, 50, javafx.scene.paint.Color.BLUE);
		// plotno.rysujLinie(275, 325, 275, 430);
		
		Punkt pierwszy = new Punkt(1050, 1920);
		Punkt drugi = new Punkt(0, 0);
		// plotno.rysujPelnyProstokat(p1 , p2, Color.GRAY);

		// wieleKulek(plotno);

		plotno.rysujOkrag(150, 150, 50, javafx.scene.paint.Color.BLUE);
		plotno.rysujOkrag(300, 300, 50, javafx.scene.paint.Color.BLUE);

		double odleglosc = Oblicz.odlegloscPomiedzyDwomaPunktami(pierwszy, drugi);
		plotno.wypiszTekst(50, 50, 30, "Odleglosc :" + odleglosc, Color.RED);

		for (int i = 0; i < 10; i++) {
			new Kulka(plotno, 500 + i * 50, 500, Color.AQUA);
			new Kulka(plotno, 500 + i * 50, 550, Color.BLUEVIOLET);
			new Kulka(plotno, 500 + i * 50, 600, Color.BROWN);
		}

		// mojaKulka.rysuj();
		// Trojkat figuraTrojkat = new Trojkat(plotno);

	}

	private void wieleKulek(Plotno plotno) {
		// wartosc poczatkowa ; warunek kontunuacji ; krok
		for (int i = 1; i < 100; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 50);

			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.BLUEVIOLET);
		}
		for (int i = 1; i < 50; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 50);
			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.BLUE);
		}
		for (int i = 1; i < 20; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 100);
			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.DARKBLUE);
		}
	}


	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);

		int r = Program.losujLiczbe(20, 100);
		plotno.rysujOkrag(x - r / 2, y - r / 2, r, javafx.scene.paint.Color.RED);
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujOkrag(x, y, 5, javafx.scene.paint.Color.BLUEVIOLET);

	}

}
