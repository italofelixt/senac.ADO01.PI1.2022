/*	6) Fa�a um algoritmo que leia um n�mero inteiro diferente de zero
 *	diga se este � positivo, negativo ou zero.
 *	Utilize a sequencia de comandos se (if) encadeado*/

package ItaloFelix_LE01;

import java.util.Scanner;


public class PosNegOuZero {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int numero = 0;
	
		
	System.out.print("Escolha um n�mero inteiro: ");

	numero = sc.nextInt();

	if (numero < 0) {
		System.out.println("O n�mero � NEGATIVO.");
	}
		if (numero > 0) {
			System.out.println("O n�mero � POSITIVO.");
		}	
			if (numero == 0) {
				System.out.println("O n�mero � zero.");
			}

	
	sc.close();



	}
}
