/**
 * 2) Calcular o quadrado de um número: Desenvolva um método que receba um número como argumento e retorne o quadrado desse número.
 */

package tarefa_para_casa12;

import java.util.Scanner;

public class Atividade02_QuadradoDeUmNumero {

	static int quadradoDeUmNumero(int numeroInteiro) {
		return numeroInteiro * numeroInteiro;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro, para saber o valor do quadrado:");
				int numero = sc.nextInt();

				System.out.println("O quadrado do número " + numero + ", é: " + quadradoDeUmNumero(numero));

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
