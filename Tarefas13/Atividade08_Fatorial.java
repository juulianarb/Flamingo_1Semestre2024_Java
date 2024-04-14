/**
 * 8) Calcular o fatorial de um número: Crie uma função que receba um número inteiro como parâmetro e retorne o fatorial desse número.

 */

package tarefa_para_casa12;

import java.util.Scanner;

public class Atividade08_Fatorial {

	static int calcularFatorial(int numero) {

		if (numero < 0) {
			System.out.println("Não se calcula fatorial com números negativos");
		}

		if (numero == 0) {
			return 1;
		}

		int inicioFatorial = 1;

		for (int contador = 1; contador <= numero; contador++) {
			inicioFatorial = inicioFatorial * contador;
		}

		return inicioFatorial;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro para calcular a fatorial: ");
				int numeroSolicitado = sc.nextInt();

				System.out.println("O resultado da fatorial do número " + numeroSolicitado + ", é de: "
						+ calcularFatorial(numeroSolicitado));

				System.out.println("Deseja realizar um novo calculo?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
