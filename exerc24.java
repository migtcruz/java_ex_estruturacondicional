package Lista02;
import java.util.Scanner;
public class exerc24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//24. Faça um Programa que leia 2 números e em seguida pergunte ao usuário 
		//	qual operação ele deseja realizar. 
		//	O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
		//	a. par ou impar;
		//	b. positivo ou negativo;
		//	c. inteiro ou decimal.
		Scanner input = new Scanner(System.in);
		// ler e receber dois numeros
		System.out.println("Informe 0 1º numero: ");
		double num1 = input.nextDouble();
		System.out.println("Informe o 2º numero: ");
		double num2 = input.nextDouble();
		// escolha da operação a ser realizada
		System.out.println("Escolha a Operação a ser realizada, segue :");
		System.out.println("(1)- SOMA");
		System.out.println("(2)- SUBTRAÇÂO");
		System.out.println("(3)- MULTIPLICAÇÂO");
		System.out.println("(4)- DIVISÂO");
		int escolha = input.nextInt();
		// Variavel armazena operação
		double result = 0;
		// Calculos da operação escolhida
		switch(escolha) {
			case 1:
				result = (num1 + num2);
				System.out.println("O resultado da soma é : "+result);
				break;
			case 2:
				result = (num1-num2);
				System.out.println("O resultado da subtração é : "+result);
				break;
			case 3:
				result = (num1*num2);
				System.out.println("O resultado da multiplicação é : "+result);
				break;
			case 4:
	            if (num2 == 0) {
	            System.out.println("Não é possível dividir por zero.");
	            return; 
	            }
	            result = num1 / num2;
	            System.out.println("Resultado da divisão: " + result);
	            break;
			default:
				System.out.println("Opção Invalida !!");
				return; 
				}
		// Verificar numero par ou impar
		if (result %2==0) {
			System.out.println(result+" é um numero PAR");}
		else {
			System.out.println(result+" é um numero IMPAR");}
		//Verificar numero positivo ou negativo
		if (result > 0) {
			System.out.println(result+" é um numero POSITIVO");}
		else if (result < 0) {
            System.out.println(result + " é um número NEGATIVO");}
		else {
            System.out.println(result + " é um numero NULO");}
		//Verificar numero inteiro ou decimal
		if (result== Math.round(result)) {
			System.out.println(result+" é um numero INTEIRO");}
		else {
			System.out.println(result+" é um numero DECIMAL");
		}
		
					
		}
			
	}


