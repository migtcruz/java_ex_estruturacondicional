package Lista02;

import java.util.Scanner;

public class exerc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	10. Faça um Programa que pergunte em que turno você estuda. 
		// 		Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
		// 		Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!"
		//		 conforme o caso.
		
		Scanner input = new Scanner(System.in);
		
		//Ler e receber turno
		System.out.println("Informe o turno que voce estuda (M) Matutino  (V) Vespertino  (N) Noturno:");
		char turno = input.next().toUpperCase().charAt(0); 
									// Lê o primeiro caractere digitado e
									// converte para maiúsculas
		
		//Estrutura Condicional e Imprimir mensagem
		if (turno=='M') {
			System.out.println("Bom Dia !!");}
		else if (turno=='V') {
			System.out.println("Boa Tarde !!");}
		else {
			System.out.println("Boa Noite !!");}
		input.close();
			
			}

}
