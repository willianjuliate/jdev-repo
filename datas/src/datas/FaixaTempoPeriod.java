package datas;

import java.time.LocalDate;
import java.time.Period;

public class FaixaTempoPeriod {
	public static void main(String[] args) {
		LocalDate dataAntiga = LocalDate.of(2012, 3, 12);
		LocalDate novaData = LocalDate.of(2022, 8, 24);
		
		System.out.println("Data antiga é maior que data nova: "+ dataAntiga.isAfter(novaData));
		System.out.println("Data antiga é anterior a data nova: "+ dataAntiga.isBefore(novaData));
		System.out.println("Data antiga é igual a data nova: "+ dataAntiga.isEqual(novaData));
		
		Period periodo = Period.between(dataAntiga, novaData);
		
		System.out.println("Quantos dias: "+ periodo.getDays());
		System.out.println("Quantos mêses: "+ periodo.getMonths());
		System.out.println("Quantos anos: "+ periodo.getYears());
		System.out.println("Apenas meses: "+ periodo.toTotalMonths());
		
		System.out.println("Perido é: "+ periodo.getDays() + " dias, " + periodo.getMonths() + " meses, " + periodo.getYears() + " anos!");
	}
	
}
