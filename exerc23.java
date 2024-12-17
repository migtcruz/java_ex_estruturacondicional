package Lista02;
import java.util.Scanner;
public class exerc23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//23. Faça um programe que peça um numero e informe se o numero é inteiro ou decimal. 
		//    Dica: Utilize uma função de arredondamento 
		 Scanner input = new Scanner(System.in);

	        System.out.println("Digite um número:");
	        double numero = input.nextDouble();

	        if (numero == Math.round(numero)) {
	            System.out.println(numero + " é um número INTEIRO.");}
	        else {
	            System.out.println(numero + " é um número DECIMAL.");  }
	    }
	}
