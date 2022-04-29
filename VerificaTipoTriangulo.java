/*	12)Fa�a um algoritmo que  leia 3 valores que representam os lados de um tri�ngulo, 
 * 	verifique se � um triangulo equil�tero (tr�s lados iguais), is�sceles (dois lados iguais) ou escaleno (tr�s lados diferentes). 
 *	Verifique se os tr�s lados formam um tri�ngulo: cada lado deve ser menor do que a soma dos outros dois.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class VerificaTipoTriangulo {

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
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triangulo Equilatero");
			} else if ((lado1 == lado2) || (lado1 == lado3)) {
				System.out.println("Triangulo Isosceles");
			} else
				System.out.println("Tri�ngulo Escaleno");
		} else {
			System.out.println("N�o � um triangulo!");
		}
		sc.close();
	}
}
