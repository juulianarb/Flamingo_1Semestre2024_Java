/**
 * 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
 *  Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2).
 *   Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
 *   senão escrever a mensagem 'Efetuar compra'.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Informe a quantidade atual de estoque do produto:");
				int quantidadeAtual = sc.nextInt();

				System.out.println("Informe a quantidade máxima de estoque do produto:");
				int quantidadeMaxima = sc.nextInt();

				System.out.println("Informe a quantidade mínima de estoque do produto:");
				int quantidadeMinima = sc.nextInt();

				float quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

				if (quantidadeAtual >= quantidadeMedia) {
					System.out.println("Não efetuar compra");
				} else {
					System.out.println("Efetuar compra");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode novamente o programa.");
		}

		sc.close();

	}

}
