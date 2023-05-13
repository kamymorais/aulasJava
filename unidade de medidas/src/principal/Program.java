package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner graus = new Scanner (System.in);
		
		double grausF ;
		System.out.print("Temperatura em Fahrenheit: ");
		
		grausF = graus.nextDouble();
		
		double resultado = (5*((grausF-32)/9));
		
		System.out.print("A Temperatura em Celsius é: " + resultado);
		graus.close();
		
	}

}
