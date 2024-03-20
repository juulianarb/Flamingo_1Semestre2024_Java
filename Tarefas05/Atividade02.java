/**
 * 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		try {

			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro:");

				int valor = sc.nextInt();

				if (valor >= 0) {

					System.out.println("O valor " + valor + " é positivo");

				} else {

					System.out.println("O valor " + valor + " é negativo");

				}

				System.out.println("Deseja rodar o programa novamente?");

				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... rode novamente o programa");
		}

		sc.close();
	}
}
