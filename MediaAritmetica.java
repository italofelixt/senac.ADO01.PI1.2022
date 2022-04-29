/*	4) Entrar com dois números reais e imprimir a média aritmética 
 * 	com a mensagem “média: “ antes do resultado*/

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
		
			System.out.print("Digite o primeiro número: ");
			num1 = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = sc.nextDouble();
			
			media = (num1 + num2) / 2;
			
			System.out.println("média:" + media);
		
		sc.close();
		
	}
	
}
