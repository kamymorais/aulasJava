package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		double numero1;
		double numero2;
		
		
		System.out.print("Qual o n�mero 1? ");	
		numero1 = leia.nextInt();
		System.out.print("Qual o n�mero 2? ");
		numero2 = leia.nextInt();
		
		
		
		double resultado = numero1 + numero2;
		
		System.out.println("O resultado � o: " + resultado);
		
		
		
		leia.close();
		
		
	}

}
