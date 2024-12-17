package Lista02;
import java.util.Scanner;

public class exerc22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22. Faça um Programa que peça um número inteiro e 
		//     determine se ele é par ou impar. 
		//       Dica: utilize o operador módulo (resto da arredondamento.

		Scanner input = new Scanner(System.in);
		
		// ler e receber numero inteiro
		System.out.println("Informe um numero inteiro : ");
		int num = input.nextInt();
		
		// Verificar numero par ou impar e imprimir
		if (num %2==0) {
			System.out.println("Numero PAR");}
			else {
				System.out.println("Numero IMPAR");}
		}
	}


