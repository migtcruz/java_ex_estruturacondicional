package Lista02;

import java.util.Scanner;


public class exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. Faça um Programa que verifique se uma letra digitada 
		//é vogal ou consoante.
		Scanner scanner = new Scanner(System.in);
		
		// Ler e receber letra 
		System.out.print("Informe uma letra : ");
		char letra = scanner.next().toLowerCase().charAt(0);
		
		
		//Verificação da letra
		if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
		System.out.println("A letra: "+letra+"  é uma VOGAL");}
		else if ((letra>='a' & letra<='z') & !(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u')){
			System.out.println("A Letra: "+letra+"  é uma CONSOANTE");}
		else {
			System.out.println("Nao informado uma letra valida !!");}
			
		scanner.close();
		
	}

}
