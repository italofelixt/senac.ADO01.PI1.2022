/*	1) Fa�a um algoritmo que leia um n�mero inteiro 
 	* diferente de zero e diga se este � positivo ou negativo
*/

package ItaloFelix_LE01;
import java.util.Scanner;

public class PositOuNeg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
			while (numero == 0) {	
		
				System.out.print("Escolha um n�mero inteiro e diferente de Zero: ");
		
				numero = sc.nextInt();
		
				if (numero < 0) {
					System.out.println("Este n�mero � NEGATIVO.");
		
				}else if (numero > 0) {
					System.out.println("Este n�mero � POSITIVO.");
				}else {
					System.out.println("N�mero zero n�o � v�lido.\nTente novamente.");
				}
		
			}
		sc.close();
	}

}
