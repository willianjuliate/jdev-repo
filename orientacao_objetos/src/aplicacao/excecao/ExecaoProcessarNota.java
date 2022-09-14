package aplicacao.excecao;

public class ExecaoProcessarNota extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExecaoProcessarNota(String erro) {
		super(erro);
	}
}
