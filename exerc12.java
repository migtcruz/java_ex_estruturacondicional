package Lista02;

import java.util.Scanner;

public class exerc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//12. Faça um programa para o cálculo de uma folha de pagamento, 
		//sabendo que os descontos são do Imposto de Renda, 
		//que depende do salário bruto (conforme tabela abaixo) 
		//e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, 
		//mas não é descontado (é a empresa que deposita). 
		//O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
		//O programa deverá pedir ao usuário o valor da sua hora 
		//a quantidade de horas trabalhadas no mês.
		//Desconto do IR:
		//Salário Bruto até 900 (inclusive) - isento
		//Salário Bruto até 1500 (inclusive) - desconto de 5%
		//Salário Bruto até 2500 (inclusive) - desconto de 10%
		//Salário Bruto acima de 2500 - desconto de 20%
		//Imprima na tela as informações

		//Ler e receber valor/hora e qtd horas/mes
			System.out.print("Informe o valor/hora salarial :");
			double valorhora = input.nextDouble();
			System.out.print("Informe a quantidade horas/mes trabalhadas :");
			double horasmes = input.nextDouble();
		// Calcular salario bruto 
			double sal_bruto = valorhora*horasmes;
		//Definir taxas sindicato + fgts + inss
			double sindicato = sal_bruto*0.03;
			double fgts = sal_bruto*0.11;
			double inss = sal_bruto*0.10;
		//Definir taxa IR x valor do salario e inss
			double taxainss = 0.10;
			double taxair = 0;
		// Condição de Desconto IR
			if (sal_bruto<=900) {
			taxair = 0;}
			else if (sal_bruto<=1500) {
			taxair = 0.05;}
			else if (sal_bruto<=2500) {
			taxair = 0.10;}
			else {
			taxair = 0.20;}
		//Calculo IR
			double IR = sal_bruto*taxair;
		// Imprimir Tabela folha pagamento
			System.out.println("Salario Bruto : R$ "+sal_bruto);
			System.out.println("(-)"+(taxair*100)+(" %")+(" Imposto de Renda : R$ ")+IR);
			System.out.println("(-)"+(taxainss*100)+(" %")+(" INSS : R$ ")+inss);
			System.out.println("Taxa Sindicato : R$ "+sindicato);
			System.out.println("FGTS : R$ "+fgts);
			System.out.println("Salario Liquido : R$ "+(sal_bruto-inss-IR));
			
			input.close();
			
	}
		
			}


