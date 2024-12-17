package Lista02;

import java.util.Scanner;


public class exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Faça um Programa que peça um valor 
		// mostre na tela se o valor é positivo ou negativo.
		
		Scanner input = new Scanner(System.in);
		
		// Leia e receba valor
		System.out.println("Informe o valor : ");
		Double valor = input.nextDouble();
		
		// valor positivo ou negativo
		if (valor>=0) {
			System.out.println("Valor POSITIVO !");}
		else {
			System.out.println(" Valor NEGATIVO !");}
		
			input.close();
	
		
		
	}

}
