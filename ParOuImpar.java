/* 	10) Fa�a um algoritmo que determine se um dado n�mero �
 	*  par ou impar (utilize o operador resto (<dividendo>
	% <divisor>), que retorna o resto da divis�o inteira.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		double num;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero para saber se � PAR ou �MPAR: ");
		num = sc.nextDouble();

		if (num % 2 == 0) {
			System.out.println(num + " � PAR.");
		} else {
			System.out.println(num + " � �mpar");
		}
		sc.close();
	}

}
