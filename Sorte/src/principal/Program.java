package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sorteio = new Random ();
		
		int num1 = sorteio.nextInt(6)+1;
		int num2 = sorteio.nextInt(6)+1;
		int num3 = sorteio.nextInt(6)+1;
		
		System.out.println("Os n�meros sorteados foram: " + num1 + " // " + num2 + " //" + num3);
		
		int soma = (num1 + num2 + num3);
		
		System.out.println("Total de pontos do sorteio: " + soma);
		
		int bonus = 0;
		
		if (num1 == num2 && num1 == num3 && num2 == num3) {
		bonus = 6;
		System.out.println("B�nus: " + bonus + "... que sortudo!!");
		}
		
		else if (num1 == num2 || num1 == num3 || num2 == num3) {
		bonus = 2;
		
		System.out.println("B�nus "+ bonus );
        }
		
		int ptosfinal = (soma + bonus);
		System.out.println("Pontua��o final: " + ptosfinal);
		
		if (ptosfinal < 15 ) {
			System.out.println("Game Over! =( ");
		}
		
		else {
			System.out.println("You win!! =) ");
		}
		
	}

}
