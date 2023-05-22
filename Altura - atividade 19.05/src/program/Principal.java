package program;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner sc = new Scanner (System.in);	
		
      double somaAltura = 0;
      double altura = 0;
 
    for (int contador = 1 ; contador <=5 ; contador ++) {
    System.out.print("Insira a altura: ");
    
    altura = sc.nextDouble ();
    somaAltura += altura ;
    
 }
  
   System.out.print("A média das alturas é: " + (somaAltura/5));  
		
   sc.close();
   
   
	}

}
