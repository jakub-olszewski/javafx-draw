package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.element.Punkt;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

/**
 * Klasa opisujaca obszar po którym możemy rysować
 * 
 * @author student
 *
 */
public class Plotno extends Canvas {

	private GraphicsContext context;

	public Plotno() {
		super();
		context = getGraphicsContext2D();
	}

	public void czysc() {
		context.clearRect(0, 0, 640, 640);
	}

	public void rysujOkrag(int startx, int starty, int promien) {
		rysujOkrag(startx, starty, promien, Color.BLUE);
	}

	public void rysujOkrag(double x, double y, int promien, Color color) {
		context.setFill(color);
		context.setStroke(color);
		context.setLineWidth(5);
		context.fillOval(x, y, promien, promien);
	}

	/**
	 * Metoda rysuje linie
	 * 
	 * @param x1
	 *            punkt początku
	 * @param y1
	 *            punkt początku
	 * @param x2
	 *            punkt końca
	 * @param y2
	 *            punkt końca
	 */
	public void rysujLinie(double x1, double y1, double x2, double y2) {
		context.setFill(Color.BLUE);
		context.setStroke(Color.BLUE);
		context.setLineWidth(5);
		context.strokeLine(x1, y1, x2, y2);
	}

	/**
	 * Rysowanie linii polaczenie punktow
	 * 
	 * @param p1
	 *            punkt poczatek
	 * @param p2
	 *            punkt koniec
	 */
	public void rysujLinie(Punkt p1, Punkt p2) {
		context.setFill(Color.BLUE);
		context.setStroke(Color.BLUE);
		context.setLineWidth(5);
		context.strokeLine(p1.x, p1.y, p2.x, p2.y);
	}

	/**
	 * Metoda służy do rysowania prostokąta pomiędzy 2 punktami.
	 * 
	 * @param p1
	 *            to punkt 1
	 * @param p2
	 *            punkt 2
	 * @param kolor
	 *            to kolor prostokąta.
	 */
	public void rysujProstokat(Punkt p1, Punkt p2, Color kolor) {
		context.setFill(kolor);
		context.setStroke(kolor);
		context.setLineWidth(5);
		context.strokeRect(p1.x, p1.y, p2.x, p2.y);
	}

	/**
	 * Metoda służy do rysowania prostokąta wypelnionego kolorem w srodku pomiędzy 2
	 * punktami.
	 * 
	 * @param p1
	 *            to punkt 1
	 * @param p2
	 *            punkt 2
	 * @param kolor
	 *            to kolor prostokąta.
	 */
	public void rysujPelnyProstokat(Punkt p1, Punkt p2, Color kolor) {
		context.setFill(kolor);
		context.setStroke(kolor);
		context.setLineWidth(5);
		context.fillRect(p1.x, p1.y, p2.x, p2.y);
	}

	/**
	 * Metoda rysuje wypelniony prostokat
	 * 
	 * @param punktRysowania
	 *            miejsce rozpoczecia rysowania
	 * @param wysokosc
	 *            prostokata
	 * @param szerokosc
	 *            prostokata
	 * @param kolor
	 *            wypelnienia prostokata
	 */
	public void rysujPelnyProstokat(Punkt punktRysowania, int wysokosc, int szerokosc, Color kolor) {
		rysujPelnyProstokat(punktRysowania, new Punkt(szerokosc, wysokosc), kolor);
	}

	/**
	 * jest to metoda ktora wypisuje tekst na plotnie
	 * 
	 * @param x
	 *            to wspolrzedna pozioma
	 * @param y
	 *            to wspolrzedna pionowa
	 * @param rozmiar
	 *            rozmiar czcionki
	 * @param tekst
	 *            to napis wypisany na plotnie
	 * @param kolor
	 */
	public void wypiszTekst(double x, double y, int rozmiar, String tekst, Paint kolor) {
		context.setStroke(kolor);
		context.setFill(kolor);

		context.setFont(new Font("Arial", rozmiar));
		context.fillText(tekst, x, y);
	}

	public void ustawRozmiar(double wysokosc, double szerokosc) {
		setHeight(wysokosc);
		setWidth(szerokosc);
	}

	public void rysujPunkt(double x, double y) {
		context.setFill(Color.BLACK);
		context.fillRect(x, y, 1, 1);
	}

	public void rysujPunkt(Punkt punkt) {
		context.setFill(Color.GREEN);
		context.fillRect(punkt.x, punkt.y, 10, 10);
		wypiszTekst(punkt.x - 7, punkt.y - 7, 14, punkt.getNazwa(), Color.GREEN);
	}


}
