package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//O Random gera n�meros aleat�rios...
		
		Random random = new Random ();
		
		
			int opcao = random.nextInt (7)+1;
		System.out.println("Op��o sorteada: " + opcao);
		
		//SwitchCase � como se fosse o IF Else...
		
			switch (opcao) {
			case 1:
				System.out.println("domingo");
				break;
			case 2:
				System.out.println("segunda");
				break;
			case 3:
				System.out.println("ter�a");
				break;
			case 4:
				System.out.println("quarta");
				break;
			case 5:
				System.out.println("quinta");
				break;
			case 6:
				System.out.println("sexta");
				break;
			case 7:
				System.out.println("s�bado");
				break;
				
				
				default:
				System.out.println("N�o corresponde a um dia da semana");
				break;
			}
		
		
		/*String semana = "quinta";
		
		if (semana == "sexta-feira" ){
		System.out.println("Hoje � sexta!!");
		}
		
		else {
			System.out.println("N�o � sexta");
			}
		*/
	}


	}
