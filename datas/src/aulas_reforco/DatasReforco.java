package aulas_reforco;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatasReforco {
	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Instanciando uma data LOCAL
		LocalDate d01 = LocalDate.now();
		
		// Instanciando uma data e hora LOCAL
		LocalDateTime d02 = LocalDateTime.now();
		
		//Instanciando uma data e hora GLOBAL COM HORÁRIO DE LONDRES GMT (Z) -> Zulu Time
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2012-03-16");
		LocalDateTime d05 = LocalDateTime.parse("2012-03-16T21:43:55"); // PADRÃO ISO 8601
		
		Instant d06 = Instant.parse("2012-03-16T21:43:55Z"); // PADRÃO ISO 8601 > PADRÃO DE LONDRES
		Instant d07 = Instant.parse("2012-03-16T21:43:55-03:00"); // PADRÃO ISO 8601 > PADRÃO DE LONDRES	
		
		LocalDate d08 = LocalDate.parse("16/03/2012", fmt1 /*DateTimeFormatter.ofPattern("dd/MM/yyyy")*/);
		LocalDate d09 = LocalDate.parse("16/03/2012 21:45", fmt2);
		
		LocalDate d10 = LocalDate.of(2012, 3, 16);
		LocalDateTime d11 = LocalDateTime.of(2012, 3, 16, 1, 30);
		
		System.out.println("d1  = "+d01);
		System.out.println("d2  = "+d02);
		System.out.println("d3  = "+d03);
		System.out.println("d4  = "+d04);
		System.out.println("d5  = "+d05);
		System.out.println("d6  = "+d06);
		System.out.println("d7  = "+d07);
		System.out.println("d8  = "+d08);
		System.out.println("d9  = "+d09);
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
		
	}
}
