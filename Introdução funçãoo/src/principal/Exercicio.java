package principal;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {

	
	static String ganhador () {
		Random random = new Random ();
		Scanner sc = new Scanner (System.in);
		int numeroSorteado = random.nextInt(11);
		
		String [] nomes = new String [10];
		
		
		for (int i = 0; i < nomes.length ; i ++) {s
			System.out.print("Candidato: ");
			nomes [i] = sc.nextLine();
		
		}
		
		
		
		return "O ganhador foi " + nomes [numeroSorteado];
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(ganhador());	
		
	}

}
