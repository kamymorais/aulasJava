package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner graus = new Scanner (System.in);
		double temperatura ;
		
		System.out.print("Temperatura em � Celsius: ");
		temperatura = graus.nextDouble();
		
		double resultado = ((temperatura*9)/5)+32;
		
		System.out.println("A temperatura em fFahrenheit �: " + resultado);
		
		graus.close();
		
		
	}

}
