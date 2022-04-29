/*	3) Entrar com quatro números e imprimir a média ponderada,
 	*  sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
*/

package ItaloFelix_LE01;

import java.util.Scanner;
import java.util.Locale;

public class MediaPonderada {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, mediaPonderada;
		nota1 = nota2 = nota3 = nota4 = mediaPonderada = 0;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
			System.out.print("Digite o valor da NOTA 1: ");
			nota1 = sc.nextDouble();
			System.out.print("Digite o valor da NOTA 2: ");
			nota2 = sc.nextDouble();
			System.out.print("Digite o valor da NOTA 3: ");
			nota3 = sc.nextDouble();
			System.out.print("Digite o valor da NOTA 4: ");
			nota4 = sc.nextDouble();
			
			mediaPonderada = ((nota1*1) + (nota2*2) + (nota3*3) + (nota4*4)) / 10;
		
			System.out.print("A valor da média é: " + mediaPonderada);
		
		sc.close();
	}
	
}
