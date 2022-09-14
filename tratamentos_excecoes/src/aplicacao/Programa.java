package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import modelo.entidades.Reserva;
import modelo.excecao.DomainException;

public class Programa {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Numero do quarto: ");
			int numero = sc.nextInt();

			System.out.print("Check-in data (dd/mm/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-in data (dd/mm/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			
			System.out.println("Reserva " + reserva + "\n");

			System.out.println("Insira os dados para atualizar a reserva: ");
			System.out.print("Check-in data (dd/mm/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out data (dd/mm/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt);

			reserva.atualizaDatas(checkIn, checkOut);
			System.out.println("Reservado: " + reserva);
		}
		catch (DateTimeParseException err) {
			System.out.println("Formato da data inserido é inválido!");
		}		
		catch(DomainException err) {
			System.out.println("Erro ao Reservar "+err.getMessage());
		}
		catch (RuntimeException err) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();

	}

}
