package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     /*
        Operadores de compara��o
        > maior que
        < menor que
        >= maior ou igual 
        <= menor ou igual a 
        != diferente de 
        == igual a 
        
        Operadores l�gicos
        
        && = e
        || = ou
        ! = nega��o
         
         
        */

		int numero1 = 10;
		int numero2 = 25;
		boolean verdadeiro = false;
		
		if(numero1> numero2) {
			
			System.out.println("numero1 � o maior");
			
			}
		
		else {
			
			System.out.println("n�mero2 � o maior");
		}
		
		if (verdadeiro != true) {
		
			System.out.println("Verdadeiro");
			
		}
			else {
				
				System.out.println("Falso");
				
				}
		
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Enre com um numero para saber se � par ou �mpar");
		
		numero = leia.nextInt();
		
		if (numero %2 == 0) {
			
			System.out.println("N�mero par!");
			
			}
		
		else {
			
			System.out.println("N�mero �mpar");
		}
		
		
			
		leia.close();
			
	}
}
	

	


