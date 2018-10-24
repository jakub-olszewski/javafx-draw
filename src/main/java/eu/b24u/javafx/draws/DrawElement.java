package eu.b24u.javafx.draws;

import eu.b24u.javafx.minecraft.engine.Plotno;

public abstract class DrawElement {

	protected Plotno plotno;

	public DrawElement(Plotno plotno) {
		this.plotno = plotno;
		rysuj();
	}

	/**
	 * Metoda do rysowania elementu na plotnie
	 */
	public abstract void rysuj();

}
