package Lista02;

import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

		Scanner scanner = new Scanner(System.in);
		
		// Ler letra digitada F ou M
		System.out.println("Informe o Sexo F ou M :");
		char sexo = scanner.next().charAt(0); // Lê o primeiro caractere digitado
		
		// Verificação 
		if (sexo=='F'||sexo=='f') {
			System.out.println("F - Feminino");}
		else if(sexo=='M'||sexo=='m') {
			System.out.println("M - Masculino");}
			else {
				System.out.println("Sexo Invalido");}
		
		scanner.close();
		
		
		
		
	}

}
