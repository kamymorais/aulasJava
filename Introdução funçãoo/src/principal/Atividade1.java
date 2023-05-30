package principal;

import java.util.Scanner;

public class Atividade1 {

	static String moeda () {
		
		Scanner sc = new Scanner (System.in);
		
		String de = "";
		String para = ""; 
		double euro = 5.40 ;
		double dolar = 5.04 ;
		double valor = 0;
		double resultado = 0 ;
		
		
		System.out.println("Converter de: ");
		de = sc.nextLine();
		
		System.out.println("para: ");
		para = sc.nextLine();
		
		System.out.println("Qual o valor a ser convertido: ");
		valor = sc.nextDouble();
		
		
		switch (de) {
		case "dolar":
			if (para.equals("real")) {
				resultado = dolar * valor ;
				
			}
		
			else if (para.equals("euro")) {
				resultado = (dolar*valor)/euro;
				}
			break;
			
		case "euro" :
			if (para.equals("real")) {
				resultado = euro*valor;
			}
			else if (para.equals("dolar")) {
				double x = euro / dolar;
				resultado = x* valor;
			}
			
			break;
		
		case "real":
			if (para.equals("dolar")) {
				resultado = valor/dolar;
			}
			
			else if (para.equals("euro")) {
				resultado = valor/euro;
			}
			
			break;
		}
		
		
		return "O valor é : " + resultado ;
			
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(moeda());
	
	}

}
