package entidades;

import entidades.enums.Cor;

public abstract class Forma {

	private Cor color;

	public Forma() {
	}

	public Forma(Cor color) {
		this.color = color;
	}

	public Cor getColor() {
		return color;
	}

	public void setColor(Cor color) {
		this.color = color;
	}

	public abstract double area();
}
