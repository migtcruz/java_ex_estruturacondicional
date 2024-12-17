package Lista02;
import java.util.Scanner;

public class exerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//14. Faça um programa que lê as duas  notas  parciais obtidas por um aluno
		//numa disciplina ao longo de um semestre, e calcule a sua média. 
		//A atribuição de conceitos obedece à tabela abaixo:
		//	Média de Aproveitamento - Conceito
		//	Entre 9.0 e 10.0 - A
		//	Entre 7.5 e 9.0 - B
		//	Entre 6.00 e 7.5 - C   
		//	Entre 4.0 e  6.0 - D
		//	Entre 4.0 e zero - E
		//	O algoritmo deve mostrar na tela as notas, a média, 
		//o conceito correspondente e a mensagem "APROVADO" 
		//se o conceito for A, B ou C ou "REPROVADO" se o conceito for D ou E.

		Scanner input = new Scanner(System.in);
		double nota1, nota2, media;
		//Ler e receber notas 
		System.out.println("Informe a 1º nota do aluno");
		nota1 = input.nextDouble();
		System.out.println("Informe a 2º nota do aluno");
		nota2 = input.nextDouble();
		//Calcular media
		media = (nota1+nota2)/2;
		// Conceito
		char conceito;
		if (media >= 9) {
			conceito = 'A';}
		else if (media >= 7.5) {
			conceito = 'B';}
		else if (media >= 6) {
			conceito = 'C';}
		else if (media >= 4) {
			conceito = 'D';}
		else {
			conceito = 'E'; }
		
		System.out.println("NOTAS DO ALUNO : "+nota1+(" e ")+nota2);
		System.out.println("MEDIA DAS NOTAS : "+media);
		System.out.println("CONCEITO : " +conceito);
		
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.println("ALUNO APROVADO");}
		else {
			System.out.println("ALUNO REPROVADO");}
	
		
		input.close();
		
		
			
	
		
		
	}
		
	}



