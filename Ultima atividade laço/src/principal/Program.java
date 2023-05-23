package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tipo ;
		int num ;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual o tipo de operação? ");
		tipo = sc.next().charAt(0);
		
		System.out.print("Qual o número? ");
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
	    for (int contador = 1 ; contador <11; contador ++) {
	    System.out.println(num + " - " + contador + " = " + (num-contador));
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
	    for (double contador = 1 ; contador <11; contador ++) {
	    System.out.println(num + " / " + contador + " = " + (num/contador));
	    }
	    break;
	    }
	    
	    sc.close();
        
		}
		
	}





