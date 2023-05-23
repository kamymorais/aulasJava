package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double altura = 0;
		double soma = 0;
		
		for (int contadora = 1 ; contadora <=5 ; contadora++ ) {
			System.out.print("Digite a altura: ");
			altura = sc.nextDouble();
			soma+= altura;
			
						
		}
		System.out.println("A média é: " +(soma/5));
		
		
		
		
	}

}
