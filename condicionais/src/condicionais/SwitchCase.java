package condicionais;

public class SwitchCase {
	public static void main(String[] args) {

		/* SWITCH CASE: OPERAÇÕES EXATAS */
		int numero = 8;
		
		
		String diasSemana = switch (numero) { // Modelo novo de Switch
		case 1 -> "Janeiro";
		case 2 -> "Fevereiro";
		case 3 -> "Março";
		case 4 -> "Abril";
		case 5 -> "Maio";
		case 6 -> "Junho";
		case 7 -> "Julho";
		case 8 -> "Agosto";
		case 9 -> "Setembro";
		case 10 -> "Outubro";
		case 11 -> "Novembro";
		case 12 -> "Dezembro";
		default -> "Dia não encontrado";
		};
		
		/*switch (numero) { // Modelo Antigo
		case 1:
			System.out.println("Janeiro");
			break;

		default:
			break;
		}*/
		
		System.out.println(diasSemana);

	}
}
