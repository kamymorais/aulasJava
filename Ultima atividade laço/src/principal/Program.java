package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tipo ;
		int num ;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o tipo de opera��o? ");
		tipo = sc.next().charAt(0);
		
		System.out.print("Qual o n�mero? ");
	    num = sc.nextInt();
	    
	    switch (tipo){
	    case '+':
	    for (int contador = 1 ; contador <11; contador ++) {
	    System.out.println(num + " + " + contador + " = " + (num+contador));
	    }
	    break;
	    }
	    
	    switch (tipo){
	    case '-':
	    for (int contador = num+1 ; contador <= num + 10; contador ++) {
	    System.out.println(contador + " - " + num + " = " + (contador-num));
	    }
	    break;
	    }
	    
	    switch (tipo){
	    case '*':
	    for (int contador = 1 ; contador <11; contador ++) {
	    System.out.println(num + " x " + contador + " = " + (num*contador));
	    }
	    break;
	    }
	    
	    switch (tipo){
	    
	    case '/':
	    for (double contador = num ; contador <= num*10; contador+= num) {
	    System.out.println(contador + " / " + num + " = " + (contador/num));
	    }
	    break;
	    
	    default:
			System.out.print("Tipo de opera��o n�o encontrada!!");
			break;
	    }
	    
	 
	    
	    sc.close();
        
		}
		
	}





