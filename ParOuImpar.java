/* 	10) Faça um algoritmo que determine se um dado número é
 	*  par ou impar (utilize o operador resto (<dividendo>
	% <divisor>), que retorna o resto da divisão inteira.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		double num;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para saber se é PAR ou ÍMPAR: ");
		num = sc.nextDouble();

		if (num % 2 == 0) {
			System.out.println(num + " é PAR.");
		} else {
			System.out.println(num + " é Ímpar");
		}
		sc.close();
	}

}
