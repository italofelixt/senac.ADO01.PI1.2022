/*	9) Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
 	* carioca
 	* paulista
 	* mineiro
 	* outros estados*/

package ItaloFelix_LE01;

import java.util.Scanner;

public class QualEstado {
	public static void main(String[] args) {

		String siglaEstado = ("");

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a sigla do seu estado?");
		siglaEstado = sc.next();

		switch (siglaEstado.toUpperCase()) {
		case "RJ":
			System.out.println("CARIOCA");
			break;

		case "SP":
			System.out.println("PAULISTA");
			break;
		case "MG":
			System.out.println("MINEIRO");
			break;
		case "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "PA", "PB", "PR", "PE", "PI", "RN",
				"RS", "RO", "RR", "SC", "SE", "TO":
			System.out.println("Outros Estados.");
			break;

		default:
			System.out.println("Resposta inválida");
		}
		sc.close();
	}

}
