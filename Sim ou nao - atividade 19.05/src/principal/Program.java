package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner opcao = new Scanner (System.in);
	int k = 0;
    char valorDigitado = 's' ;
    

    do {
	
		System.out.print("Qual o código? ");
		valorDigitado = opcao.next ().charAt(0);
		k++;
	   
	
	}
	
	while ((valorDigitado) == 's');
	System.out.print(k );
	
	
	
 opcao.close();
		

}
}
