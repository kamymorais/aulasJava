package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     /*
        Operadores de comparação
        > maior que
        < menor que
        >= maior ou igual 
        <= menor ou igual a 
        != diferente de 
        == igual a 
        
        Operadores lógicos
        
        && = e
        || = ou
        ! = negação
         
         
        */

		int numero1 = 10;
		int numero2 = 25;
		boolean verdadeiro = false;
		
		if(numero1> numero2) {
			
			System.out.println("numero1 é o maior");
			
			}
		
		else {
			
			System.out.println("número2 é o maior");
		}
		
		if (verdadeiro != true) {
		
			System.out.println("Verdadeiro");
			
		}
			else {
				
				System.out.println("Falso");
				
				}
		
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Enre com um numero para saber se é par ou ímpar");
		
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			
			System.out.println("Número par!");
			
			}
		
		else {
			
			System.out.println("Número ímpar");
		}
		
		
			
		leia.close();
			
	}
}
	

	


