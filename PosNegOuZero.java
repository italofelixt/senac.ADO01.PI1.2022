/*	6) Faça um algoritmo que leia um número inteiro diferente de zero
 *	diga se este é positivo, negativo ou zero.
 *	Utilize a sequencia de comandos se (if) encadeado*/

package ItaloFelix_LE01;

import java.util.Scanner;


public class PosNegOuZero {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int numero = 0;
	
		
	System.out.print("Escolha um número inteiro: ");

	numero = sc.nextInt();

	if (numero < 0) {
		System.out.println("O número é NEGATIVO.");
	}
		if (numero > 0) {
			System.out.println("O número é POSITIVO.");
		}	
			if (numero == 0) {
				System.out.println("O número é zero.");
			}

	
	sc.close();



	}
}
