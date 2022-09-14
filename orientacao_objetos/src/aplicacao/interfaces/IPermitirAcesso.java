package aplicacao.interfaces;

/* ESSA INTERFACE SERPA O NOSSO CONTRATO DE AUTENRICAÇÃO */
public interface IPermitirAcesso {
	//public boolean autenticar(); /* APENAS DECLARAÇÃO DO MÉTODO */
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
