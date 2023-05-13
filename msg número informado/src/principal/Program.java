package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero;
		
	System.out.print("Digite o seu número: ");
	
	numero = leia.nextInt();
	System.out.println("O número informado é o " + numero);
		
		
		leia.close();
	}

}
