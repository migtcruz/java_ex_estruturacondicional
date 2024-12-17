package Lista02;
import java.util.Scanner;
public class exerc08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8. Faça um programa que pergunte o preço de três produtos e
		// informe qual produto você deve comprar, 
		// sabendo que a decisão é sempre pelo mais barato.
		
		Scanner input = new Scanner(System.in);
		
		// leia e receba preço de 3 produtos
		System.out.println("Informe preço do produto 1 :");
		double preco1 = input.nextDouble();
		System.out.println("Informe preço do produto 2 :");
		double preco2 = input.nextDouble();
		System.out.println("Informe preço do produto 3 :");
		double preco3 = input.nextDouble();
		
		
		 // Verifica e informa qual produto tem o preço mais baixo
       
		if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Você deve comprar o primeiro produto.");}
		else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar o segundo produto.");}
        else {
            System.out.println("Você deve comprar o terceiro produto.");}
		
		input.close();
		
		
		}
		
	}

