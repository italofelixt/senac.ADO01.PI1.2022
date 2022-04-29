/*	5) Desenhe um algoritmo que leia uma temperatura em graus Celsius 
 * 	e a apresente convertida em graus Fahrenheit. 
 * 	A fórmula de conversão é: F = (9 * C + 160) / 5
 *  sendo F a temperatura em graus Fahrenheit e C,
 *	a temperatura em graus Celsius.*/

package ItaloFelix_LE01;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {

		double celsius, fehrenheit;
		celsius = fehrenheit = 0;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		System.out.print("Digite o valor em graus CELSIUS: ");
		celsius = sc.nextDouble();

		System.out.print("Convertendo para graus FAHRENHEIT será: " + (9 * celsius + 160) / 5);
		System.out.println("ºF");

	}

}
