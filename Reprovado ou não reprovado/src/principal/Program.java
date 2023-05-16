package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1 = 11;
		double nota2 = 11;
		double nota3 = 11;
		double nota4 = 11;
		
		double resultado =((nota1 + nota2 + nota3 + nota4)/4);
		System.out.println("A Média é: "+ resultado);
		
		if (resultado < 6) {
			System.out.println("Reprovado");
				
		}
		
		else if (resultado >=6 && resultado <7 ) {
			System.out.println("Recuperação");
			
		}
		else if (resultado == 10) {
			
			System.out.println("Aprovado com honra");
		}
		
		else if (resultado > 10 ) {
			System.out.println("TIRE DA TOMADA IMEDIATAMENTE, É HACKER");
			
		}
		
		else {
		
			System.out.println("Aprovado");
			
		}
		
		
	}

}
