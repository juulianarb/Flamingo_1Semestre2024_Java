/**
 * 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Digite cinco números inteiros, para saber o maior e o menor deles:");

				for (int i = 0; i < 5; i++) {
					int numeroInteiro = sc.nextInt();

					if (numeroInteiro > maiorNumero) {
						maiorNumero = numeroInteiro;
					}

					if (numeroInteiro < menorNumero) {
						menorNumero = numeroInteiro;
					}
				}

				System.out.println("O maior número digitado é: " + maiorNumero);
				System.out.println("O menor número digitado é: " + menorNumero);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode o programa novamente.");
		}

		sc.close();
	}

}
