package aplicacao.auxiliares;

import aplicacao.interfaces.IPermitirAcesso;

public class FnAutenticacao {
	
	private IPermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FnAutenticacao(IPermitirAcesso permitirAcesso) {
		this.permitirAcesso = permitirAcesso;
	}
}
