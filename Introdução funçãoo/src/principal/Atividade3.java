package principal;

import java.util.Scanner;

public class Atividade3 {

	static String lucro () {
		
		Scanner sc = new Scanner (System.in);
		double valorProduto = 0 ;
		double valorLucro = 0 ;
		double percentual = 0 ;
		
		System.out.print("Valor do produto: ");
		valorProduto = sc.nextDouble();
		
		System.out.print("Lucro desejado (%): ");
		percentual = sc.nextDouble();
		
		valorLucro = valorProduto + (valorProduto*(percentual/100));
				
		return "O valor para venda do produto é de: R$ " + valorLucro ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(lucro ());
	}

}
