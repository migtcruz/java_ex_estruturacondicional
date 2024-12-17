package Lista02;

import java.util.Scanner;

public class exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//11. As Org. Tabajara resolveram dar um aumento de salário aos seus colaboradores 
		// e lhe contrataram para desenvolver o programa que calculará os reajustes.
		// Faça um programa que recebe o salário de um colaborador 
		//  e o reajuste segundo o seguinte critério, baseado no salário atual:
		// 		salários até R$ 280,00 (incluindo) : aumento de 20% 
		// 		salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
		// 		salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		// 		salários de R$ 1500,00 em diante : aumento de 5%
		// Após o aumento ser realizado, informe na tela: 
		//		o salário antes do reajuste;
		// 		o percentual de aumento aplicado;
		// 		o valor ao aumento,
		//		o novo salário, após o aumento.

		Scanner input = new Scanner(System.in);
		
		// Ler e receber o salario 
		System.out.println("Informe o salario do colaborador : ");
		double salario = input.nextDouble();
		
		// Definir a taxa de reajustes
		double taxa = 0;
		if (salario<=280) {
			taxa = 0.20;}
		if (salario>280 & salario <=700) {
			taxa = 0.15;}
		if (salario>700 & salario <=1500) {
			taxa = 0.10;}
		if (salario>1500) {
			taxa = 0.05;}
		
		// Calcular aumento e novo salario
		double aumento = (salario*taxa);
		double novosalario = (aumento+salario);
		
		// Imprimir resultado
		System.out.println("O Salario antes do reajuste = R$ "+salario);
		System.out.println("O percentual de aumento = "+(taxa*100)+" %");
		System.out.println("O valor do aumento = R$ "+aumento);
		System.out.println("O novo salario = R$ "+novosalario);
		
		input.close();
			
		}
	
		
		}
		
		
		
		

	


