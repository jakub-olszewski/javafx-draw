package eu.b24u.javafx.draws;

import eu.b24u.javafx.minecraft.engine.Plotno;

public abstract class Rysunek extends DrawElement {

	protected int x;
	protected int y;

	public Rysunek(Plotno plotno) {
		super(plotno);
	}

	public Rysunek(Plotno plotno, int x, int y) {
		super(plotno);
		this.x = x;
		this.y = y;
	}
}
