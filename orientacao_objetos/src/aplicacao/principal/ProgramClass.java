package aplicacao.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import aplicacao.auxiliares.FnAutenticacao;
import aplicacao.classes.Aluno;
import aplicacao.classes.Diretor;
import aplicacao.classes.Disciplina;
import aplicacao.constantes.StatusAluno;

public class ProgramClass {
	public static void main(String[] args) {
		/* Objeto ainda não existe na memória */
		// Aluno aluno1;
		/* Agora temos um objeto real na memória */

		try {

			String login = JOptionPane.showInputDialog("INFORME O LOGIN");
			String senha = JOptionPane.showInputDialog("INFORME A SENHA");

			// IPermitirAcesso secretario = new Secretario(); // Diretamente diretamente com
			// objeto

			// secretario.setLogin(login);
			// secretario.setSenha(senha);
			// IPermitirAcesso secretario = new Secretario(login, senha);

			if (new FnAutenticacao(new Diretor(login, senha)).autenticar()) { // (new Secretario().autenticar(login,
																				// senha)) SE TRUE ACESSA SENÃO NÃO
																				// ACESSA
				// HashMap<CHAVE , VALOR>
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				List<Aluno> alunos = new ArrayList<Aluno>(); ////

				/*
				 * List<Aluno> alunosAprovados = new ArrayList<Aluno>(); List<Aluno>
				 * alunosRecuperacao = new ArrayList<Aluno>(); List<Aluno> alunosReprovados =
				 * new ArrayList<Aluno>();
				 */

				for (int q = 1; q <= 1; q++) {

					String nome = JOptionPane.showInputDialog("QUAL O NOME DO ALUNO " + q + "?");
					//String idade = JOptionPane.showInputDialog("QUAL O IDADE DO ALUNO?");
					/*String dataNascimento = JOptionPane.showInputDialog("QUAL A DATA NASCIMENTO DO ALUNO?");
					String rg = JOptionPane.showInputDialog("QUAL A RG DO ALUNO?");
					String cpf = JOptionPane.showInputDialog("QUAL A CPF DO ALUNO?");
					String nomeMae = JOptionPane.showInputDialog("QUAL O NOME DA MAE DO ALUNO?");
					String nomePai = JOptionPane.showInputDialog("QUAL O NOME DO PAI DO ALUNO?");
					String dataMatricula = JOptionPane.showInputDialog("QUAL A DATA DA MATRICULA DO ALUNO?");
					String nomeEscola = JOptionPane.showInputDialog("QUAL O NOME DA ESCOLA?");
					String serieMatriculada = JOptionPane.showInputDialog("QUAL A SERIE MATRICULADA?");*/

					String numeroDisciplina = JOptionPane.showInputDialog("QUAL O NUMERO DE DISCIPLINA?");

					Aluno aluno = new Aluno(); // new Aluno() é uma instância
																							// (Criação de Objeto)

					aluno.setNome(nome);
					//aluno.setIdade(Integer.valueOf(idade));
					//aluno.setDataNascimento(dataNascimento);
					//aluno.setRegistroGeral(rg);
					// aluno.setNumeroCPF(cpf);
					// aluno.setNomeMae(nomeMae);
					//aluno.setNomePai(nomePai);
					//aluno.setDataMatricula(dataMatricula);
					//aluno.setNomeEscola(nomeEscola);
					//aluno.setSerieMatriculado(serieMatriculada);

					for (int i = 1; i <= Integer.valueOf(numeroDisciplina); i++) {
						String nomeDisciplina = JOptionPane.showInputDialog("NOME DA DISCIPLINA " + i + "?");
						String notaDisciplina = JOptionPane.showInputDialog("NOTA DA DISCIPLINA " + i + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplinas(nomeDisciplina);
						disciplina.setNotas(Double.valueOf(notaDisciplina));

						aluno.getDisciplinas().add(disciplina);
					}

					int opcaoJO = JOptionPane.showConfirmDialog(null, "DESEJA REMOVER ALGUMA DISCIPLINA?");
					int posisaoLista = 0;

					if (opcaoJO == 0) { /* Opção SIM e Zero */
						int continuarRemover = 0;
						while (continuarRemover == 0) {
							String DisciplinaRemover = JOptionPane
									.showInputDialog("QUAL A DISCIPLINA\n" + aluno.getDisciplinas() + "\n");
							aluno.getDisciplinas().remove(Integer.parseInt(DisciplinaRemover) - posisaoLista);
							posisaoLista++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "CONTINUAR A REMOVER?");
						}
					}
					alunos.add(aluno);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
				}

				System.out.println("------------------ Lista dos aprovados ------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno " + aluno.getNome() + " esta " + aluno.getAlunoAprovado()
							+ " com a média de " + aluno.getMedia());
				}

				System.out.println("------------------ Lista dos recuperação ------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno " + aluno.getNome() + " esta " + aluno.getAlunoAprovado()
							+ " com a média de " + aluno.getMedia());
				}
				System.out.println("------------------ Lista dos reprovados ------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno " + aluno.getNome() + " esta " + aluno.getAlunoAprovado()
							+ " com a média de " + aluno.getMedia());
				}

				/*
				 * for(int pos = 0; pos < alunos.size(); pos++) { Aluno aluno = alunos.get(pos);
				 * 
				 * if(aluno.getNome().equalsIgnoreCase("willian")) { Aluno trocar = new Aluno();
				 * trocar.setNome("Aluno foi trocado");
				 * 
				 * Disciplina disciplina = new Disciplina();
				 * disciplina.setDisciplinas("Matematica para para computadores");
				 * disciplina.setNotas(90);
				 * 
				 * trocar.getDisciplinas().add(disciplina); alunos.set(pos, trocar); aluno =
				 * alunos.get(pos); }
				 * 
				 * System.out.println(aluno);
				 * System.out.println("---------------------------------------------------");
				 * 
				 * for(Disciplina disciplina: aluno.getDisciplinas()) {
				 * System.out.println("MATERIA = "+disciplina.getDisciplinas()+" NOTAS "
				 * +disciplina.getNotas()); } }
				 * 
				 * for (Aluno aluno : alunos) { if(aluno.getNome().equalsIgnoreCase("Willian"))
				 * { alunos.remove(aluno); break; } else { System.out.println(aluno);
				 * System.out.println("---------------------------------------------------"); }
				 * }
				 * 
				 * for(Aluno aluno: alunos) {
				 * System.out.println("ALUNOS QUE SOBRARAM NA LISTA");
				 * System.out.println(aluno.getNome());
				 * 
				 * System.out.println("SUAS MATÉRIAS SÃO"); for(Disciplina disciplina:
				 * aluno.getDisciplinas()) { System.out.println(disciplina.getDisciplinas()); }
				 * 
				 * }
				 */

				// JOptionPane.showMessageDialog(null, "# DADOS BASICO DO ALUNO #\n" + aluno);
				/* Equals e hashcode (Diferenciar e comparar objetos) */
			} else {
				JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
			}
		} catch (NullPointerException e) {
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); /*IMPRIME ERRO DENTRO DO CONSOLE*/
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\nClasse de erro: "+e.getStackTrace()[i].getClassName());
				saida.append("\nMetodo de erro: "+e.getStackTrace()[i].getMethodName());
				saida.append("\nLinha de erro: "+e.getStackTrace()[i].getLineNumber());
			}
			
			JOptionPane.showMessageDialog(null, saida);
		}
		catch (NumberFormatException e ) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally { /*SEMPRE É EXECUTADO OCORRENDOU OU NÃO UM ERRO*/
			JOptionPane.showMessageDialog(null, "SEMPRE É EXECUTADO OCORRENDOU OU NÃO UM ERRO");
		}
	}

}
