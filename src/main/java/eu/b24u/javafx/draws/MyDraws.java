package eu.b24u.javafx.draws;

import eu.b24u.javafx.draws.element.Trojkat;
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
		scena.ustawRozmiar(630, 600);
		scena.zablokujOkno();
		plotno.ustawRozmiar(630, 600);

		// plotno.rysujOkrag(300, 300, 50, javafx.scene.paint.Color.BLUE);
		plotno.rysujLinie(275, 325, 275, 430);
		plotno.rysujOkrag(250, 300, 50, javafx.scene.paint.Color.BLUEVIOLET);


		Trojkat figuraTrojkat = new Trojkat(plotno);

	}

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujOkrag(x, y, 5, javafx.scene.paint.Color.BLUEVIOLET);

	}

}
