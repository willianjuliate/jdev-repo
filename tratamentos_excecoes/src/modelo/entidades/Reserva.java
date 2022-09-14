package modelo.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.excecao.DomainException;

public class Reserva {
	private static DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer numeroQuarto;
	private LocalDate checkIn;
	private LocalDate checkOut;

	public Reserva() {
	}

	public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if(!checkOut.isAfter(checkIn)) { /*Programação defenciva*/
			throw new DomainException("A data de check-out deve ser posterior à data de check-in");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public int duracao() {
		return checkOut.compareTo(checkIn);
	}

	public void atualizaDatas(LocalDate checkIn, LocalDate checkOut) throws DomainException {		
		LocalDate now = LocalDate.now();		
		if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new DomainException( "As datas de reserva para atualização devem ser datas futuras");
		}
		
		if(!checkOut.isAfter(checkIn)){
			throw new DomainException("A data de check-out deve ser posterior à data de check-in");
		}					
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto " + numeroQuarto + ", check-in " + checkIn.format(FMT) + ", check-out " + checkOut.format(FMT)
				+ ", " + duracao() + " noites";
	}

}
