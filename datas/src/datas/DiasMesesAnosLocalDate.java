package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiasMesesAnosLocalDate {
	public static void main(String[] args) {
		LocalDate dataBase =  LocalDate.now();//LocalDate.parse("2022-10-05");
		/*System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		
		//---------MINUS------------------------------------------------------
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.minusDays(1)));
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.minusWeeks(1)));
		System.out.println("Mais 5 meses: " + (dataBase = dataBase.minusMonths(1)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.minusYears(1)));*/
		
		// -----------------Vencimento do boleto-------------
		for(int i = 1; i <= 12; i++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data do vencimento do boleto : "+
					dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês: "+ i);
			
		}
	}
}
