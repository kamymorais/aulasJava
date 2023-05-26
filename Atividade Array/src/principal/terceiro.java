package principal;

import java.util.Random;

public class terceiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random sc = new Random ();
		String [] nome = new String [10];
	
		int numeroSorte = 0 ;
		
		for (int i = 0 ; i < nome.length; i++) {
			numeroSorte = sc.nextInt(10)+1;
			
			System.out.println("Aluno " + "número: " + (i+1));
		}
		
	System.out.println("O vencedor é o aluno " + numeroSorte);
		
	

		
	}

}
