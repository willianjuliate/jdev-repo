package aplicacao.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import aplicacao.constantes.StatusAluno;

/*
 * Está é a classe/objeto que representa o aluno
 * 
 * */
public class Aluno extends Pessoa {
	/* ATRIBUTOS DO ALUNO */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() { /*Cria os dados na mémorias - Sendo padrão do Java*/}
	
	public Aluno(String nome, int idade, String numeroCPF, String nomeMae) {
		this.nome = nome;
		this.idade = idade;
		this.numeroCPF = numeroCPF;
		this.nomeMae = nomeMae;
	}
	/* VEREMOS O METODOS SETTERS E GETTERS DO OBJETOS */
	/* SET É PARA ADICIONAR OU RECEBER DADOS PARA OS ATRIBUTOS */
	/* GET É PARA RESGATAR OU OBTER O VALOR DO ATRIBUTO */

	/* INICIO GETTERS E SETTERS */

	/*
	 * public void setNome(String nome) { this.nome = nome; }
	 * 
	 * public String getNome() { return nome; }
	 * 
	 * public int getIdade() { return idade; }
	 * 
	 * public void setIdade(int idade) { this.idade = idade; }
	 * 
	 * public String getDataNascimento() { return dataNascimento; }
	 * 
	 * public void setDataNascimento(String dataNascimento) { this.dataNascimento =
	 * dataNascimento; }
	 * 
	 * public String getRegistroGeral() { return registroGeral; }
	 * 
	 * public void setRegistroGeral(String registroGeral) { this.registroGeral =
	 * registroGeral; }
	 * 
	 * public String getNumeroCPF() { return numeroCPF; }
	 * 
	 * public void setNumeroCPF(String numeroCPF) { this.numeroCPF = numeroCPF; }
	 * 
	 * public String getNomeMae() { return nomeMae; }
	 * 
	 * public void setNomeMae(String nomeMae) { this.nomeMae = nomeMae; }
	 * 
	 * public String getNomePai() { return nomePai; }
	 * 
	 * public void setNomePai(String nomePai) { this.nomePai = nomePai; }
	 */

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/*
	 * public void setDisciplinas(List<Disciplina> disciplinas) { this.disciplinas =
	 * disciplinas; }
	 */
	/* FIM GETTERS E SETTERS */

	public double getMedia() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNotas();
		}
		return somaNotas / disciplinas.size();
	}

	public String getAlunoAprovado() {
		double media = this.getMedia();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		}
		return StatusAluno.REPROVADO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCPF);
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCPF, other.numeroCPF);
	}
	
	@Override // Identifica metodo sobrescrito
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "MAIOR DE IDADE!": "MENOR DE IDADE!";
	}

	@Override
	public double salario() {
		return 0;
	}

}
