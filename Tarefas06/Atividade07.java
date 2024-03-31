/**
 * 7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				int[] numerosInteiros = new int[4];

				System.out.println("Digite quatro números inteiros, para saber se é divisível por 2 ou 3:");
				for (int i = 0; i < 4; i++) {
					numerosInteiros[i] = sc.nextInt();
				}

				System.out.println("Números divisíveis por 2 e 3:");
				for (int i = 0; i < 4; i++) {
					if (numerosInteiros[i] % 2 == 0 || numerosInteiros[i] % 3 == 0) {
						System.out.println(numerosInteiros[i]);
					}

				}
				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode o programa novamente.");
			sc.close();
		}
	}

}
