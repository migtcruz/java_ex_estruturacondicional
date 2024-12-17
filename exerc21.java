package Lista02;
import java.util.Scanner;
public class exerc21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//21. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário 
			//a valor do saque e depois informar quantas notas de cada valor serão fornecidas. 
		//As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 
		//O valor mínimo é de 10 reais e o máximo de 600 reais. 
		//O programa não deve se preocupar com a quantidade de notas existentes na máquina.
		//	a. Exemplo 1: Para sacar a quantia de 256 reais, 
			//o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
		//	b. Exemplo 2: Para sacar a quantia de 399 reais, 
			//o programa fornece três notas de 100, uma nota de 50, 
			//quatro notas de 10, uma nota de 5 e quatro notas de 1.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar (entre 10 e 600 reais):");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O valor deve ser entre 10 e 600 reais.");
            return;  }

        int[] notas = {100, 50, 10, 5, 1};

        System.out.println("Notas fornecidas para o saque de " + valorSaque + " reais:");

        for (int nota : notas) {
            int quantidadeNotas = valorSaque / nota;
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$ " + nota );
                valorSaque %= nota;
            }
        }
    }
}
