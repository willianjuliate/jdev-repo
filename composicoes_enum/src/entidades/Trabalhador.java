package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.NivelTrabalho;

public class Trabalhador {

	private String name;
	private NivelTrabalho nivel;
	private Double baseSalario;

	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	public Trabalhador(String name, NivelTrabalho nivel, Double baseSalario, Departamento departamento) {
		this.name = name;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public void adicionaContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(HoraContrato contrato) {
		if(!contratos.isEmpty())
			contratos.remove(contrato);
	}
	
	public double renda(int mes, int ano) {
		double soma = baseSalario;		
		for(HoraContrato c: contratos) {
			if(mes == c.getData().getMonthValue() && ano == c.getData().getYear()) {
				soma += c.totalValor();
			}
		}
		return soma;
	}

}
