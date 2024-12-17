package Lista02;
import java.util.Scanner;

public class exerc13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13. Faça um Programa que leia um número e exiba o dia correspondente da semana. 
		//(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero de 1 a 7 :");
		int numero = input.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TERÇA");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SABADO");
			break;
		default :
			System.out.println("Nº INVALIDO");
		}
		
		input.close();
	}

}
