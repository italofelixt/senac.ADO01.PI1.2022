/*  11)Faça um algoritmo que  leia 3 valores que representam os lados de um triângulo, 
 *	verifique se os três lados formam um triângulo: 
 *	cada lado deve ser menor do que a soma dos outros dois.*/
package ItaloFelix_LE01;

import java.util.Scanner;

public class VerificaSeEhTriangulo {

	public static void main(String[] args) {

		int lado1, lado2, lado3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o lado 1: ");
		lado1 = sc.nextInt();
		System.out.print("Entre com lado 2: ");
		lado2 = sc.nextInt();
		System.out.print("Entre com lado 3: ");
		lado3 = sc.nextInt();

		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			System.out.println("É um triângulo.");

		} else {
			System.out.println("Não é um triângulo!");
		}
		sc.close();
	}
}
