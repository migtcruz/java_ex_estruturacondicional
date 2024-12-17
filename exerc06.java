package Lista02;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 6. Faça um Programa que leia três números e 
		// mostre o maior deles
		
		Scanner input = new Scanner(System.in);
		
		//  Ler e receber 3 numeros
		System.out.println("Informe 1° numero : ");
		double num1 = input.nextDouble();
		System.out.println("Informe 2° numero :");
		double num2 = input.nextDouble();
		System.out.println("Informe 3° numero : ");
		double num3 = input.nextDouble();
		
		// Calcular o maior numero entre os 3
		double maiornum = num1;
		if (num2>maiornum) {
			maiornum = num2; }
		if (num3>maiornum) {
			maiornum = num3;}
		
		// Imprimir maior numero
		System.out.println("O Nº MAIOR é :  "+maiornum);
		
		input.close();
		
		
		}

}
