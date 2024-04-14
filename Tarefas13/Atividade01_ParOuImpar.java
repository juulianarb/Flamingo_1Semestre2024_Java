/**
 * 1) Verificar se um número é par ou ímpar: Crie um método que receba um número inteiro como parâmetro e 
 * retorne verdadeiro se o número for par e falso se for ímpar.
 */

package tarefa_para_casa12;

import java.util.Scanner;

public class Atividade01_ParOuImpar {

	static boolean parOuImpar(int numInteiro) {

		if (numInteiro % 2 == 0) {
			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número para saber se é par ou impar: ");
				int numeroSolicitado = sc.nextInt();

				if (parOuImpar(numeroSolicitado)) {
					System.out.println(numeroSolicitado + " é um número par.");
				} else {
					System.out.println(numeroSolicitado + " é um número ímpar.");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
