package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	public static DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dataFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String name, Double preco, LocalDate dataFabricacao) {
		super(name, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String precoEtiqueta() {
		return getName()+" (usado) "+super.precoEtiqueta() + 
				String.format(" (Fabricado em: %s)", dataFabricacao.format(FMT));
	}
	
}
