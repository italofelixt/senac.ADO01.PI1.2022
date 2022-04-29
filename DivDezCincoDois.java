/*	8) Entrar com um número e informar se ele é divisível por:
 *  10, por 5, por 2 ou se não é divisível por nenhum destes.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class DivDezCincoDois {
	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número e direi se ele é divisível por 10, por 5 ou por 2:");
		num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println("Ele é divisível por 10.");
		}
		if (num % 5 == 0) {
			System.out.println("Ele é divisível por 5.");
		}
		if (num % 2 == 0) {
			System.out.println("Ele é divisível por 2.");
		} else {
			System.out.println("Ele não divisível por nenhum.");
		}

		sc.close();
	}

}
