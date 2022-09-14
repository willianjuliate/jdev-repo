package condicionais;

public class WhileDoWhile {
	
	public static void main(String[] args) {
		/* ESTRUTURA DE REPETIÇÃO WHILE FIBONACCI */		
		int n = 0, num, numA = 1, numB = 0;
		
		while(n < 10) {
			System.out.print(numA + " ");
			num = numA + numB;
			numB = numA;
			numA = num;
			n++;
		}
	}

}
