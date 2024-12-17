package Lista02;
import java.util.Scanner;
public class exerc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//17. Faça um Programa que peça um número correspondente a um determinado ano 
		//e em seguida informe se este ano é ou não bissexto.
		Scanner input = new Scanner(System.in);
		
		// Ler e receber ano
		System.out.println("Vamos verificar se o ano é bissexto. Informe o Ano : ");
		int ano = input.nextInt();
		
		// Verificar Ano 
		if ((ano %4==0 & ano%100 != 0)||(ano%400==0)){
			System.out.println(+ano+" é um ANO BISSEXTO ");}
		else {
			System.out.println(+ano+" nao é um ANO BISSEXTO");}
		}
		
		
	}


