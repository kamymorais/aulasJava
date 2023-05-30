package principal;

import java.util.Scanner;

public class Atividade2 {

	static String soma () {
		
		Scanner sc = new Scanner (System.in);
		
		double valor1 = 0 ;
		double valor2 = 0 ;
		double valor3 = 0;
		double resultado = 0 ; 
		
		System.out.print("Qual o 1º valor: ");
		valor1 = sc.nextDouble();
		
		System.out.print("Qual o 2º valor: ");
		valor2 = sc.nextDouble();
		
		System.out.print("Qual o 3º valor: ");
		valor3 = sc.nextDouble();
		
		resultado = valor1 + valor2 + valor3; 
		
		return "O resultado é : " + resultado ; 
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(soma());

	}

}
