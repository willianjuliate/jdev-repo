package aplicacao.classes;

import aplicacao.interfaces.IPermitirAcesso;

public class Secretario extends Pessoa implements IPermitirAcesso {

	private String registro;
	private String nvCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario() {}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNvCargo() {
		return nvCargo;
	}

	public void setNvCargo(String nvCargo) {
		this.nvCargo = nvCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nvCargo=" + nvCargo + ", experiencia=" + experiencia + ", nome="
				+ nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 0;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}

}
