package program;

import java.util.Scanner;

public class Contadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int contador = 0;
        int opcao = 0 ;
        
        System.out.println("Deseja entrar no laço? ");
        System.out.println("1 = sim e 2 = não");
        opcao = sc.nextInt();
        
        while (opcao == 1 ) {
        	contador ++;   	
       System.out.println("Deseja entrar no laço? ");
       System.out.println("1 = sim e 2 = não");
       opcao = sc.nextInt();
        }
        System.out.println("Saiu");
        System.out.println("Entrou " + contador + " vezes");
				
		
		sc.close();
		
		
	}

}
