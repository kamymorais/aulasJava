package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1 = 6.95;
		double nota2 = 7.20;
		double nota3 = 8.5;
		double nota4 = 9.9;
		
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
		
		else {
		
			System.out.println("Aprovado");
			
		}
		
		
	}

}
