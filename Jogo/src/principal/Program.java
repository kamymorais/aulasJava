package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		
		int doisNumeros = 0 ;
		int tresNumeros = 0 ;
		
		
		Random numero1 = new Random ();
		
		
	    int dado1 = numero1.nextInt(6)+1;
	    int dado2 = numero1.nextInt(6)+1;
	    int dado3 = numero1.nextInt(6)+1;
	    
		System.out.println("Os números sorteados foram " + dado1 + dado2 + dado3 );
		
      		
		int soma = (dado1 + dado2 + dado3);
		
		System.out.println("A soma dos três números é: " + soma);
		
	
		if (dado1 == dado2 && dado1 == dado3 ) {
			tresNumeros = 6;
		
			System.out.println("Você ganhou " + tresNumeros+  " pontos, que sortudo!!");
		
	 		}
				
		
		else if
			
			(dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
			doisNumeros = 2;
				System.out.println("Você ganhou " + doisNumeros + " pontos de bonus");
		}

		int bonus = (doisNumeros + tresNumeros);
		
		int totalDePontos = (soma + bonus);
		System.out.println("Sua pontuação final é: " + totalDePontos);
		
		if (totalDePontos < 15) {
			System.out.println("Game Over!! =( ");
		}
		
		else {
			System.out.println("You Win!! <3 ");
		}
		
		

	}

}
