package Lista02;
import java.util.Scanner;
import java.util.Arrays;

public class exerc09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9. Faça um Programa que leia três números
		//	e mostre-os em ordem decrescente.
		
		Scanner input = new Scanner(System.in);
		
		// Ler e receber 3 numeros
		// Solicita que o usuário digite os três números
        System.out.println("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        double numero3 = input.nextDouble();
        
        // Cria um array para armazenar os números
        double[] numeros = {numero1, numero2, numero3};
        
        // Ordena o array em ordem decrescente
        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(+numeros[i]);
            
            
        }
        
       input.close();
		
		
				

	}

}
