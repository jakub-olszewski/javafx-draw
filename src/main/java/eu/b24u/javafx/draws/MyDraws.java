package eu.b24u.javafx.draws;


import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Aplikacja;
import eu.b24u.javafx.minecraft.engine.GameMenuBar;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.engine.Scena;

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

		Punkt p2 = new Punkt(1920, 1050);
		Punkt p1 = new Punkt(0, 0);
		plotno.rysujPelnyProstokat(p1, p2, javafx.scene.paint.Color.GRAY);

		// wartosc poczatkowa ; warunek kontunuacji ; krok
		for (int i = 1; i < 0; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 50);

			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.BLUEVIOLET);
		}
		for (int i = 1; i < 2; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 50);
			plotno.rysujOkrag(x, y, 5, javafx.scene.paint.Color.GREEN);

			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.BLUE);
		}
		for (int i = 1; i < 0; i++) {
			int x = Program.losujLiczbe(20, 1820);
			int y = Program.losujLiczbe(20, 600);
			int r = Program.losujLiczbe(20, 100);
			plotno.rysujOkrag(x, y, r, javafx.scene.paint.Color.DARKBLUE);
		}

		// Trojkat figuraTrojkat = new Trojkat(plotno);

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
