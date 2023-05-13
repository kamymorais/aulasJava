package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char nomeDoAluno;
		String nomeDoAluno1;
		
		//nomeDoAluno.charAt(0)
		
		
		Scanner sobrenome = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		nomeDoAluno = sobrenome.next().charAt (3);
		
		System.out.println("O nome é: " + nomeDoAluno);
		
		
		
	
		
		
		
		
		sobrenome.close();
		
		
	}

}
