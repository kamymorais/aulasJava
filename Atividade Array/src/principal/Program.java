package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double [] notas = new double [4];
	
	System.out.print("Nome do aluno: ");
	String nomeAluno = sc.nextLine();
	
	double somaNotas = 0;
	for(int i = 0; i < notas.length; i ++) {
		System.out.print("Nota: " + (i+1) + ": ");
		notas [i] = sc.nextDouble();
		somaNotas = somaNotas + notas [i];
		
		}
		
	System.out.print("A média é : " + somaNotas/notas.length);

	sc.close();
	
	}

}
