package Lista02;
import java.util.Scanner;
public class exerc26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//26. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		//	a. Alcool:
		//	b. até 20 litros, desconto de 3% por litro
		//	c. acima de 20 litros, desconto de 5% por litro
		//	d. Gasolina:
		//	e. até 20 litros, desconto de 4% por litro
		//	f. acima de 20 litros, desconto de 6% por litro 
		//  Escreva um algoritmo que leia o número de litros vendidos, 
		//	o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
		//	calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do 
		//	litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

		Scanner input = new Scanner(System.in);
		
		// Preços dos combustíveis por litro
        double precoAlcool = 1.90;
        double precoGasolina = 2.50;

        System.out.print("Informe o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipoCombustivel = input.next().charAt(0);

        System.out.print("Informe a quantidade de litros vendidos: ");
        int litrosVendidos = input.nextInt();

        double precoTotal = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litrosVendidos <= 20) {
                precoTotal = litrosVendidos * precoAlcool * (1 - 0.03);
            } else {
                precoTotal = litrosVendidos * precoAlcool * (1 - 0.05);
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                precoTotal = litrosVendidos * precoGasolina * (1 - 0.04);
            } else {
                precoTotal = litrosVendidos * precoGasolina * (1 - 0.06);
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            System.exit(1); // Encerrar o programa com código de erro
        }

        System.out.println("Valor a ser pago: R$" + precoTotal);
        input.close();
    }
}