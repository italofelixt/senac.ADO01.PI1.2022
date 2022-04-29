/*	2) Faça um algoritmo para determinar o consumo médio de um automóvel, 
 	* considerando que a distância total percorrida 
 	* e o total de combustível gasto são fornecidos.
*/

package ItaloFelix_LE01;
import java.util.Scanner;


public class ConsumoCombustivel {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double distanciaTotal;
		double gastoCombustivelTotal;
		double mediaDeConsumo;
		
			System.out.print("Informe a distância total percorrida em km: ");
			distanciaTotal = sc.nextDouble();
			
			System.out.print("Informe o gasto total de combustível em L: ");
			gastoCombustivelTotal = sc.nextDouble();
			
			mediaDeConsumo = distanciaTotal / gastoCombustivelTotal;
			
			System.out.printf("O comsumo médio de combustível foi de: %.2f " ,  mediaDeConsumo);
			System.out.println("km/L");
			
		sc.close();
	}

}
