package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double idade ;
		
		Scanner idadeFinal = new Scanner (System.in);
		System.out.print("Qual sua idade atual? ");
		idade = idadeFinal.nextDouble();
		
		double resultado = idade + 100;
		System.out.println("Sua idade daqui 100 anos é: " + resultado);
		
		idadeFinal.close();
		
		
		
	}

}
