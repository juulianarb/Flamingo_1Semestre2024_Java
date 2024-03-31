/**
 * 11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
  apresentação, caso o valor não seja maior que três.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Informe um número inteiro:");
				int valorInteiro = sc.nextInt();

				if (valorInteiro > 3) {
					System.out.println(" ");
				} else {
					System.out.println("O valor " + valorInteiro + " não é maior do que 3!");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode o programa novamente.");
		}
		sc.close();

	}

}
