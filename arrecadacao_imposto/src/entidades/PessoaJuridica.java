package entidades;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionario;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public PessoaJuridica() {
		super();
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public Double imposto() {
		if(numeroFuncionario > 10) {
			return getRendaAnual() * 0.14;
		}
		return getRendaAnual() * 0.16;
	}

}
