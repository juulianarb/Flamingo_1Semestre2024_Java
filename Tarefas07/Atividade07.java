/**
 * 7) Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Informe o primeiro número inteiro:");
				int primeiroNumero = sc.nextInt();

				System.out.println("Informe o segundo número inteiro:");
				int segundoNumero = sc.nextInt();

				if (primeiroNumero == segundoNumero) {
					System.out.println("Os números " + primeiroNumero + " e " + segundoNumero + " são números iguais");
				} else if (primeiroNumero > segundoNumero) {
					System.out.println("O primeiro número é maior");
				} else {
					System.out.println("O segundo número é maior");
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
