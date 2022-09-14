package aulas_reforco;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDataHoraGlobalTexto {
	public static void main(String[] args) {		
		
		Instant d01 = Instant.parse("2022-08-24T01:30:26Z"); // Londres
		
		LocalDate d02 = LocalDate.parse("2022-08-24");
		LocalDateTime d03 = LocalDateTime.parse("2022-08-24T21:43:55");
		
		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault()); // -3h
		LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal")); // + 1h
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));
		
		System.out.println("r1 = "+ r1);
		System.out.println("r2 = "+ r2);
		System.out.println("r3 = "+ r3);
		System.out.println("r4 = "+ r4);
		
		System.out.println("d02 = "+ d02.getDayOfMonth());
		System.out.println("d02 = "+ d02.getMonthValue());
		System.out.println("d02 = "+ d02.getYear());		
		
		System.out.println("d03 = "+ d03.getHour());
		System.out.println("d03 = "+ d03.getMinute());
		System.out.println("d03 = "+ d03.getSecond());
		
		
	}

}
