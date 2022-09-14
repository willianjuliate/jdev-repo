package entidades;

public class ProdutoImportado extends Produto {
	private Double custosImportacao;

	public ProdutoImportado(){
            super();
	}
	
	public ProdutoImportado(String name, Double preco, Double custosImportacao) {
		super(name, preco);
		this.custosImportacao = custosImportacao;
	}
	
	
	private Double totalPreco() {
		return getPreco() + custosImportacao;
	}
	
	@Override
	public String precoEtiqueta() {
		return getName() + " $ " +totalPreco() + String.format(" (Custos importação: $ %.2f)", custosImportacao);
	}	
}
