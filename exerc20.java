package Lista02;
import java.util.Scanner;
public class exerc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20. Faça um Programa para leitura de três notas parciais de um aluno. 
		//    O programa deve calcular a média alcançada por aluno e presentar:
		//   	a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
		//  	b. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
		//  	c. A mensagem "Aprovado com Distinção", se a média for igual a 10.

			Scanner input = new Scanner(System.in);
			// ler e receber as notas
			System.out.println("Informe a 1º nota :");
			double nota1 = input.nextDouble();
			System.out.println("Informe a 2º nota :");
			double nota2 = input.nextDouble();
			System.out.println("Informe a 3º nota :");
			double nota3 = input.nextDouble();
			// Calcular media das notas
			double media = (nota1+nota2+nota3)/3;
			// Imprimir mensagem e media alcancada
			if (media>=7 & media<10) {
				System.out.println("Aluno APROVADO / MEDIA DO ALUNO : "+media);}
			else if (media<7) {
				System.out.println("Aluno REPROVADO / MEDIA DO ALUNO : "+media);}
			else {
				System.out.println("Aluno APROVADO COM DISTINÇÃO / MEDIA DO ALUNO : "+media);}
	}
}

				
				


			
			
			