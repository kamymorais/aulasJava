package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 

		//Uma constante � quando o seu valor n�o muda
		
		//final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		// realiza a potencia
		System.out.println(Math.pow (2,2));
		
	// passagem de 2 numeros como parametro
		// retorna o maior deles
		
		System.out.println(Math.max(valor2, valor1));
		
		// � o inverso do max, pega o m�nimo
		
		System.out.println(Math.min(valor2, valor1));
	
		//retorna a raiz quadrada de um numero
		
		System.out.println(Math.sqrt(18));
		
		// arredonda o numero para mais ou menos
		
		System.out.println(Math.round(25.6578));
		
		// Podemos realizar calculos com valores 
		// retornados pelo calculo de Math
		
		System.out.println( 2+ Math.sqrt(18));
		
		Scanner leia = new Scanner (System.in);
		
		//Alterando entrada para ponto
		Locale ponto = new Locale ("en","us");
		
		System.out.print("Entre com o valor do dolar: ");
	   
		double dolar = leia.useLocale(ponto).nextDouble ();
		
        System.out.print("O valor digitado � o: " + dolar);
        
        String nome = "Kamylla Morais";
        char sexo ='F';
        int idade = 27 ;
        double altura = 1.5264567;
        System.out.println();
        System.out.printf("O meu nome � %s, sou do sexo %c, tenho %d de idade, minha altura �: %.2f ", nome, sexo, idade , altura );
        
        /*
         Operadores de compara��o
         > maior que
         < menor que
         >= maior ou igual 
         <= menor ou igual a 
         != diferente de 
         == igual a 
         
         Operadores l�gicos
         
         && = e
         || = ou
         ! = nega��o
          
          
         */
        
        leia.close();
		
		
	}

}
