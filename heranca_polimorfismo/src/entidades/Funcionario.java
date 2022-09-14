package entidades;

public class Funcionario {
	private String name;
	private Integer horas;
	private Double valorHora;

	public Funcionario() {
	}

	public Funcionario(String name, Integer horas, Double valorHora) {
		this.name = name;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return horas * valorHora;
	}

}
