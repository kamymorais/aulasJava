package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		for (int contador= 1 ; contador <= 25; contador = contador +2) {
						
			System.out.print(contador + "  ");
			soma += contador;
			
		}
		
	    System.out.println();
		System.out.println("O total é: " + soma);
		
		}
			
	}


