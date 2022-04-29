/*7) Entrar com um número e informar se ele é ou não divisível por 5.*/

package ItaloFelix_LE01;

import java.util.Scanner;
import java.util.Locale;

public class DivisivelPorCinco {
	public static void main(String[] args) {
		
		double num;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.print("Digite um número e direi se ele é divisível por 5:");
		num = sc.nextDouble();
		
		if (num %5 == 0){
			System.out.println("Ele é divisível por 5");
						
		}else { 
			System.out.println("Ele não é divisível por 5.");
		}
	
		sc.close();
	}

}
