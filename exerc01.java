package Lista02;

import java.util.Scanner;


public class exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 01 . Faça um Programa que peça dois números e imprima o maior deles.
				Scanner input = new Scanner(System.in);
		// Ler e receber dois numeros				
				System.out.println("Informe o primeiro numero : ");
				double num1 = input.nextDouble();
				System.out.println("Informe o segundo numero : ");
				double num2 = input.nextDouble();
		// Calcular e imprimir maior numero
				if (num1>num2) { 
					System.out.println("O maior numero é : "+num1);
				} else if (num2>num1){
					System.out.println("O maior numero é : "+num2);
				} else {
					System.out.println("Os numeros sao iguais");
					
				}
				
				input.close();
				
				
				
				
	}

}
