package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		char tipo;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Qual o 1� n�mero? ");
		num1 = sc.nextDouble();

		System.out.print("Qual o tipo de opera��o? ");
		tipo = sc.next().charAt(0);
		
		System.out.print("Qual o 2� n�mero? ");
		num2 = sc.nextDouble();
		
	   switch (tipo) {
	   case'-':
		System.out.println( "O resultado �: " + (num1 - num2));
	break;
	
	   case'+':
		   System.out.println( "O resultado �: " + (num1 + num2));  
	  break;
	  
	   case '*':
		   System.out.println( "O resultado �: " + (num1 * num2));  
		 break;
	   case '/':
		   System.out.println( "O resultado �: " + (num1 / num2));  
		 break;
	   }
		
	   sc.close();
	   
		
		
		
	}

}
