/*	8) Entrar com um n�mero e informar se ele � divis�vel por:
 *  10, por 5, por 2 ou se n�o � divis�vel por nenhum destes.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class DivDezCincoDois {
	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero e direi se ele � divis�vel por 10, por 5 ou por 2:");
		num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println("Ele � divis�vel por 10.");
		}
		if (num % 5 == 0) {
			System.out.println("Ele � divis�vel por 5.");
		}
		if (num % 2 == 0) {
			System.out.println("Ele � divis�vel por 2.");
		} else {
			System.out.println("Ele n�o divis�vel por nenhum.");
		}

		sc.close();
	}

}
