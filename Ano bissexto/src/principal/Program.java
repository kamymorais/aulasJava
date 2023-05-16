package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int ano ;
		
		System.out.print("Qual o ano: ");
		ano = leia.nextInt();
		
		if ((ano %4 == 0 && ano %100 !=0 )|| ano %400 == 0) {
		
		System.out.print("Ano bissexto");
		}
		
		else {
			System.out.println("Não é bissexto");
			
		}
		
		
		leia.close();
		
		
		
		
	}

}
