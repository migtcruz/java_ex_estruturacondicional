package Lista02;
import java.util.Scanner;
public class exerc25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//25. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
		//	a. "Telefonou para a vítima?"
		//	b. "Esteve no local do crime?"
		//	c. "Mora perto da vítima?"
		//	d. "Devia para a vítima?"
		//	e. "Já trabalhou com a vítima?" 
		// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
		//	Se a pessoa responder positivamente a 2 questões ela deve ser classificada 
		//	como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
		//	Caso contrário, ele será classificado como "Inocente".
		
		Scanner input = new Scanner(System.in);
		//Ler e receber respostas 
		System.out.println("Leia abaixo as perguntas do crime e responda (1) para SIM / (0) para NÃO ");
		System.out.println("A - Telefonou para a vítima ? ");
		int a = input.nextInt();
		System.out.println("B - Esteve no local do crime?");
		int b = input.nextInt();
		System.out.println("C - Mora perto da vítima?");
		int c = input.nextInt();
		System.out.println("D - Mora perto da vítima?");
		int d = input.nextInt();
		System.out.println("E - Já trabalhou com a vítima?");
		int e = input.nextInt();
		
		// Verificação das respostas
		int soma = (a+b+c+d+e);
		
		// Imprimir resultados
		if (soma == 2) {
			System.out.println("Pessoa SUSPEITA");}
		else if (soma == 3 || soma ==4) {
			System.out.println("Pessoa CUMPLICE");}
		else if (soma == 5) {
			System.out.println("Pessoa ASSASSINA");}
		else {
			System.out.println("Pessoa INOCENTE");}
		}
		
		
	}


