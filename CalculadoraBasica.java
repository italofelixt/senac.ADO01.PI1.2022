/* 13)Fa�a um algoritmo que simule uma calculadora com as quatro opera��es b�sicas (+, -, *, /). 
 * O algoritmo deve solicitar ao usu�rio a entrada de dois operandos e da opera��o a ser executada, na forma de um menu. 
 * Dependendo da op��o escolhida, deve ser executada a opera��o solicitada e escrito seu resultado. 
 * Utilize uma vari�vel caractere  para armazenar a opera��o e utilize o comando caso (switch/case) 
 * para escolher a opera��o a ser executada a partir do operador.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primero n�mero real:");
		double n1 = sc.nextDouble();

		System.out.print("Digite a opera��o desejada:");
		String operacao = sc.next();

		System.out.print("Digite o segundo n�mero real:");
		double n2 = sc.nextDouble();

		if (operacao.equals("+")) {
			System.out.print("Soma = " + (n1 + n2));

		} else if (operacao.equals("-")) {
			System.out.print("Subtra��o = " + (n1 - n2));

		} else if (operacao.equals("/")) {
			System.out.printf("Quociente = %.3f ", (n1 / n2));

		} else if (operacao.equals("*")) {
			System.out.printf("Produto = %.3f ", (n1 * n2));
		}
		sc.close();
	}

}
