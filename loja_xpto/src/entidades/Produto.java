package entidades;

public class Produto {
	private String name;
	private Double preco;
	
	public Produto() {}

	public Produto(String name, Double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String precoEtiqueta() {
		return name + " $ " + String.format("%.2f", preco);
	}
}
