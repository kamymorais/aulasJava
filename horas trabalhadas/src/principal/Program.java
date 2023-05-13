package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner salario = new Scanner (System.in);
		
		double salarioPorHora;
		double horasTrabalhadasNoMes;
		
		System.out.print("Quanto você ganha por hora? ");
	    salarioPorHora = salario.nextDouble();
		
	    System.out.print("Quantas horas você trabalhou? ");
	    horasTrabalhadasNoMes = salario.nextDouble();
		
	    double salarioAReceber = (salarioPorHora*horasTrabalhadasNoMes);
	    
	    System.out.println("O seu salário mensal é de: " + salarioAReceber);
		
		salario.close();
		
		
	}

}
