/*	2) Fa�a um algoritmo para determinar o consumo m�dio de um autom�vel, 
 	* considerando que a dist�ncia total percorrida 
 	* e o total de combust�vel gasto s�o fornecidos.
*/

package ItaloFelix_LE01;
import java.util.Scanner;


public class ConsumoCombustivel {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double distanciaTotal;
		double gastoCombustivelTotal;
		double mediaDeConsumo;
		
			System.out.print("Informe a dist�ncia total percorrida em km: ");
			distanciaTotal = sc.nextDouble();
			
			System.out.print("Informe o gasto total de combust�vel em L: ");
			gastoCombustivelTotal = sc.nextDouble();
			
			mediaDeConsumo = distanciaTotal / gastoCombustivelTotal;
			
			System.out.printf("O comsumo m�dio de combust�vel foi de: %.2f " ,  mediaDeConsumo);
			System.out.println("km/L");
			
		sc.close();
	}

}
