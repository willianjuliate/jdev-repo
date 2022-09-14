package entidades;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		if(getRendaAnual() < 20000.00) {
			return (getRendaAnual() * 0.15) - (gastosSaude * 0.50);
		}
		return (getRendaAnual() * 0.25) - (gastosSaude * 0.50);
	}
	
}
