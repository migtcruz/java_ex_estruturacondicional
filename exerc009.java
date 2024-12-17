package Lista02;
import java.util.Scanner;
public class exerc009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite os três números
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        
        // Variáveis temporárias para armazenar os números durante a troca
        double temp;
        
        // Verifica e ordena os números em ordem decrescente usando o algoritmo de seleção
        if (numero1 < numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        if (numero1 < numero3) {
            temp = numero1;
            numero1 = numero3;
            numero3 = temp;
        }
        if (numero2 < numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        
        // Exibe os números em ordem decrescente
        System.out.println("Os números em ordem decrescente são: " + numero1 + ", " + numero2 + ", " + numero3);
        
        scanner.close();
	}

}
