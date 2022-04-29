/* 13)Faça um algoritmo que simule uma calculadora com as quatro operações básicas (+, -, *, /). 
 * O algoritmo deve solicitar ao usuário a entrada de dois operandos e da operação a ser executada, na forma de um menu. 
 * Dependendo da opção escolhida, deve ser executada a operação solicitada e escrito seu resultado. 
 * Utilize uma variável caractere  para armazenar a operação e utilize o comando caso (switch/case) 
 * para escolher a operação a ser executada a partir do operador.*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primero número real:");
		double n1 = sc.nextDouble();

		System.out.print("Digite a operação desejada:");
		String operacao = sc.next();

		System.out.print("Digite o segundo número real:");
		double n2 = sc.nextDouble();

		if (operacao.equals("+")) {
			System.out.print("Soma = " + (n1 + n2));

		} else if (operacao.equals("-")) {
			System.out.print("Subtração = " + (n1 - n2));

		} else if (operacao.equals("/")) {
			System.out.printf("Quociente = %.3f ", (n1 / n2));

		} else if (operacao.equals("*")) {
			System.out.printf("Produto = %.3f ", (n1 * n2));
		}
		sc.close();
	}

}
