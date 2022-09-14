package aplicacao.classes;

import java.util.Objects;

/* Essa classe Disciplina servirá para todos os objetos e instancias de notas e materias*/
public class Disciplina {

	private double notas;
	private String disciplinas;

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return disciplinas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, notas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplinas, other.disciplinas)
				&& Double.doubleToLongBits(notas) == Double.doubleToLongBits(other.notas);
	}

}
