package Lista02;

import java.util.Scanner;

public class exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7. Faça um Programa que leia três números e 
		// 		mostre o maior e o menor deles.
		
		Scanner input = new Scanner(System.in);
		
		// Ler e receber 3 numeros
		System.out.println("Informe o 1º numero");
		double num1 = input.nextDouble();
		System.out.println("Informe o 2º numero");
		double num2 = input.nextDouble();
		System.out.println("Informe o 3º numero");
		double num3 = input.nextDouble();
		
		// Calcular maior numero
		double maior = num1;
		if (num2>maior) {
			maior=num2;}
		if (num3>maior) {
			maior=num3;}
		
		// Calcular menor numero
		double menor = num1;
		if (num2<menor) {
			menor=num2;}
		if (num3<menor) {
			menor=num3;}
		
		//Imprimir Resultado
		System.out.println("MAIOR Nº : "+maior);
		System.out.println("MENOR Nº : "+menor);
		
		input.close();
			
	}

}
