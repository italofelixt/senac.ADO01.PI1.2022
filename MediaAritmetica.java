/*	4) Entrar com dois n�meros reais e imprimir a m�dia aritm�tica 
 * 	com a mensagem �m�dia: � antes do resultado*/

package ItaloFelix_LE01;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 0;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
			System.out.print("Digite o primeiro n�mero: ");
			num1 = sc.nextDouble();
			System.out.print("Digite o segundo n�mero: ");
			num2 = sc.nextDouble();
			
			media = (num1 + num2) / 2;
			
			System.out.println("m�dia:" + media);
		
		sc.close();
		
	}
	
}
