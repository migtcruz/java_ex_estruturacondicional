package Lista02;

import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// 5. Faça um programa para a leitura de duas  notas parciais de um aluno. 
		//    O programa deve calcular a média alcançada por aluno e apresentar:
		//		•	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		//		•	A mensagem "Reprovado", se a média for menor do que sete;
		//		•	A mensagem "Aprovado com Distinção", se a média for igual a dez.

		Scanner input = new Scanner(System.in);
		
		// leia e receba 02 notas do Aluno
		System.out.println("Digite a 1° nota parcial : ");
		Double nota1 = input.nextDouble();
		System.out.println("Digite a 2° nota parcial : ");
		Double nota2 = input.nextDouble();
		
		// Calcular media do aluno
		Double media = ((nota1+nota2)/2);
		
		// Imprimir Resultados
		if (media==10) {
			System.out.println("Aluno APROVADO com distinção");}
		else if (media>=7) {
			System.out.println("Aluno APROVADO");}
		else  {
			System.out.println("Aluno REPROVADO");}
		
		input.close();
		
	}
}


