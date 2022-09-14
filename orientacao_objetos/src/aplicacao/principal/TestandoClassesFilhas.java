package aplicacao.principal;

import aplicacao.classes.Aluno;
import aplicacao.classes.Diretor;
import aplicacao.classes.Pessoa;
import aplicacao.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Willian JDEV");
		aluno.setIdade(25);

		Diretor diretor = new Diretor();
		diretor.setNome("João");
		diretor.setRegistroGeral("5151656589595-66");
		diretor.setIdade(50);
		

		Secretario secretario = new Secretario();
		secretario.setNome("Paulo");
		secretario.setDataNascimento("10/05/1993");
		secretario.setIdade(29);
				
		System.out.println("Aluno -> " + aluno + "\nDiretor -> " + diretor + "\nSecretario -> " + secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " "+ aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário Diretor é = " + diretor.salario());
		
		// Pessoa pessoa = new Aluno(); -> Polimorfismo
		exibeOpcoes(aluno);
		exibeOpcoes(diretor);
		exibeOpcoes(secretario);
	}
	
	public static void exibeOpcoes(Pessoa pessoa) {
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Salario: "+ pessoa.salario());
		System.out.println("Idade: "+ pessoa.getIdade());
	}

}
