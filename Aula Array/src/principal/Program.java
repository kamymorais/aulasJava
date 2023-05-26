package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] numero = new int [5];
		int[] numero2 = {100,250,02,25,88};
						
			numero [0]= 10;
			numero [1]= 25;
			numero [2]= 1;
			numero [3]= 99;
			numero [4]= 33;
		
				
			System.out.println(numero[4]);
			System.out.println(numero2[2]);
			
		
			Scanner sc = new Scanner (System.in);
				
			System.out.print("Quantos nomes deseja salvar? ");
		    int qtd = sc.nextInt();
		    sc.nextLine ();
		        	
		    String[] nome = new String [qtd];
		    
		    for (int contador = 0; contador < nome.length; contador ++) {
		    	System.out.println("Entre com o nome: ");
		    	nome[contador] = sc.nextLine();
		    	}
				
		    
			for (int contador = 0; contador < nome.length ; contador++ ) {
				System.out.println(nome[contador]);
				}
								
				
			String verificar = "Théo";
			if (nome [0].equals(verificar)){
				System.out.println("É igual");
				}
			else {
				System.out.println("Não é");
				}
			
			for (String nomes:nome) {
				System.out.println(nomes);
			}
				
				sc.close();
		
		
		
		
		
		
		
	}

}
