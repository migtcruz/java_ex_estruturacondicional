package Lista02;
import java.util.Scanner;
public class exerc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//15. Faça um Programa que peça os 3 lados de um triângulo. 
		// O programa deverá informar se os valores podem ser um triângulo. 
		// Indique, caso os lados formem um triângulo, se o mesmo é: 
		// equilátero, isósceles ou escaleno.
		//  Dicas
		// • Três lados formam um triângulo quando a soma de quaisquer dois lados 
		//   for maior que o terceiro;
		// • Triângulo Equilátero: três lados iguais;
		// • Triângulo Isósceles: quaisquer dois lados iguais;
		// • Triângulo Escaleno: três lados diferentes;
		
		Scanner input = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		//ler e receber valores dos lados
		System.out.println("Informe valor 1º lado : ");
		lado1 = input.nextDouble();
		System.out.println("Informe o valor do 2 lado : ");
		lado2 = input.nextDouble();
		System.out.println("Informe o valor do 3º lado : ");
		lado3 = input.nextDouble();
		
		//Condição para formar Triangulo
		if ( lado2+lado3<lado1 & lado2+lado1<lado3 & lado3+lado1<lado2) {
			System.out.println("Os valores informados não formam um Triangulo !");}
			else if ( lado1==lado2 & lado2==lado3 ) {
				System.out.println("Os valores formam um TRIANGULO EQUILATERO !");}
			else if ( lado1!=lado2 & lado2!=lado3 & lado3!=lado1) {
				System.out.println("Os valores formam um TRIANGULO ESCALENO !");}
			else {
				System.out.println("Os valore formam um TRIANGULO ISOCELES !");}
		
		input.close();		
		}
		
		
	}


