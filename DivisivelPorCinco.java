/*7) Entrar com um n�mero e informar se ele � ou n�o divis�vel por 5.*/

package ItaloFelix_LE01;

import java.util.Scanner;
import java.util.Locale;

public class DivisivelPorCinco {
	public static void main(String[] args) {
		
		double num;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.print("Digite um n�mero e direi se ele � divis�vel por 5:");
		num = sc.nextDouble();
		
		if (num %5 == 0){
			System.out.println("Ele � divis�vel por 5");
						
		}else { 
			System.out.println("Ele n�o � divis�vel por 5.");
		}
	
		sc.close();
	}

}
