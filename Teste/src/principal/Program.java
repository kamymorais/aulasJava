package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		double num1 ;
		double num2 ;
		
		System.out.print("Qual o n�mero1: ");
		num1 = leia.nextDouble();
		
		System.out.print("Qual o n�mero2: ");
		num2 = leia.nextDouble();
		
		double resultado = num1+num2;
		
		System.out.print("O resultado �: " + resultado);
		
		leia.close();
		
		
	}

}
