/**
 * 5) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
 *  OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o valor do lado A, para saber se formam um triângulo:");
				int ladoA = sc.nextInt();

				System.out.println("Digite o valor do lado B, para saber se formam um triângulo:");
				int ladoB = sc.nextInt();

				System.out.println("Digite o valor do lado C, para saber se formam um triângulo:");
				int ladoC = sc.nextInt();

				if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
					System.out.println("Os valores digitados formam um triângulo.");
				} else {
					System.out.println("Os valores digitados não formam um triângulo.");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode o programa novamente.");
		}
		sc.close();

	}

}
