package aulas_reforco;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertDataHoraLocalTexto {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2012-03-16");
		LocalDateTime d02 = LocalDateTime.parse("2012-03-16T21:43:55"); 	
		Instant d03 = Instant.parse("2012-03-16T21:43:55Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/LL HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d01 = "+ d01.format(fmt1)); // Assim <-
		System.out.println("d01 = "+ fmt1.format(d01));// -> Ou Assim 
		System.out.println("d01 = "+ d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//  E Assim <-
		System.out.println("d02 = "+ d02.format(fmt2));
		System.out.println("d03 = "+ fmt3.format(d03));
		
	}
}
