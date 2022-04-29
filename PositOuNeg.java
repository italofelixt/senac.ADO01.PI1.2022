/*	1) Faça um algoritmo que leia um número inteiro 
 	* diferente de zero e diga se este é positivo ou negativo
*/

package ItaloFelix_LE01;
import java.util.Scanner;

public class PositOuNeg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
			while (numero == 0) {	
		
				System.out.print("Escolha um número inteiro e diferente de Zero: ");
		
				numero = sc.nextInt();
		
				if (numero < 0) {
					System.out.println("Este número é NEGATIVO.");
		
				}else if (numero > 0) {
					System.out.println("Este número é POSITIVO.");
				}else {
					System.out.println("Número zero não é válido.\nTente novamente.");
				}
		
			}
		sc.close();
	}

}
