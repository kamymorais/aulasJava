package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero;
		
	System.out.print("Digite o seu n�mero: ");
	
	numero = leia.nextInt();
	System.out.println("O n�mero informado � o " + numero);
		
		
		leia.close();
	}

}
