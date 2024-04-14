/**
 * 4) Calcular a média de três números: Crie uma função que receba três números como parâmetros e retorne a média desses números.
 */

package tarefa_para_casa12;

import java.util.Scanner;

public class Atividade04_Media3Numeros {

	static int calculoMedia(int num1, int num2, int num3) {

		return (num1 + num2 + num3) / 3;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o primeiro número para calcular a média:");
				int primeiroNumero = sc.nextInt();

				System.out.println("Digite o segundo número para calcular a média:");
				int segundoNumero = sc.nextInt();

				System.out.println("Digite o terceiro número para calcular a média:");
				int terceiroNumero = sc.nextInt();

				System.out.println("A média dos números " + primeiroNumero + ", " + segundoNumero + ", "
						+ terceiroNumero + ", é de: " + calculoMedia(primeiroNumero, segundoNumero, terceiroNumero));

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
