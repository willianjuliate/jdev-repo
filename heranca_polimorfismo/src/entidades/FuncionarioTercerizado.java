package entidades;

public class FuncionarioTercerizado extends Funcionario {
	private Double custosAdicionais;

	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String name, Integer horas, Double valorHora, Double custosAdcionais) {
		super(name, horas, valorHora);
		this.custosAdicionais = custosAdcionais;
	}
	
	public Double getCustosAdicionais() {
		return custosAdicionais;
	}	

	public void setCustosAdicionais(Double custosAdicionais) {
		this.custosAdicionais = custosAdicionais;
	}
	
	@Override
	public double pagamento() {
	 	return super.pagamento() + custosAdicionais * 1.1;
	}
	
}
