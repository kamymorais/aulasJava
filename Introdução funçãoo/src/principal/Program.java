package principal;

import java.util.Scanner;

public class Program {

	static void mensagem () {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2 (int n) {
		System.out.println("O n�mero foi: " + n);
	}
	
	static String mensagem3 () {
		return "aqui � minha fun��o n�mero 2";
		
	}
	static String mensagem4 (int x) {
		return "N�mero informado: " + x ;
				
	}
	
	static int exemplo (double y) {
		return (int) y;
				
	}
	
	static int mensagem5 (int x, int y) {
		return  x+y;
		}

	
			public static void main(String[] args) {
		// TODO Auto-generated method stub

		mensagem ();
		mensagem2 (20);
		System.out.println(mensagem3 ());
		System.out.println(mensagem4 (25));
		System.out.println(exemplo (16.6));
		System.out.println(mensagem5 (5,10));
		
	}
	

}
