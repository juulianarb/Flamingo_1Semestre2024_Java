/**
 * 1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		try {

			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro:");

				int valor = sc.nextInt();

				if (valor > 10) {

					System.out.println("É maior que 10!");

				} else {

					System.out.println("Não é maior que 10");

				}

				System.out.println("Deseja rodar o programa novamente?");

				resposta = sc.next();

			}

		} catch (Exception e) {

			System.out.println("A proposta do programa é somente com números inteiros...");

		}

		sc.close();

	}

}
