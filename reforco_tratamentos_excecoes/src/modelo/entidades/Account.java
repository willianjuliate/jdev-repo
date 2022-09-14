package modelo.entidades;

import modelo.excecao.DomainException;

public class Account {
	private Integer number;
	private String titular;
	private double saldo;
	private double limiteSaque;
	
	public Account() {}

	public Account(Integer number, String titular, double limiteSaque) {
		this.number = number;
		this.titular = titular;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) throws DomainException {
		if (valor > limiteSaque) {
			throw new DomainException("O valor excede o limite de saque");
		}
		
		if (valor > saldo) {
			throw new DomainException("Saldo insuficiente");
		}				
		
		saldo -= valor;
	}
}
