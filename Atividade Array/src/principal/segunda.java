package principal;

import java.util.Random;

public class segunda {

	public static void main(String[] args) {
		
		Random sc = new Random ();
		String [] numero = new String [51];
	
		int numeroPar = 0 ;
		
		for (int i = 0 ; i < numero.length; i++) {
			numeroPar = sc.nextInt(50)+1;
			
			if(i %2 == 0 ) {
				System.out.println("Número: " + numeroPar + " // Posição " + i);
			}
		}
	
		
		
	    
	    	
	    
	
	}
	
		
	}

				


