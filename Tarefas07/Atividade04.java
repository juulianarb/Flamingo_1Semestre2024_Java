/**
 * 4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.print("Digite o primero número inteiro: ");
				int numero1 = sc.nextInt();

				System.out.print("Digite o segundo número inteiro: ");
				int numero2 = sc.nextInt();

				System.out.print("Digite o terceiro número inteiro: ");
				int numero3 = sc.nextInt();

				int guardaValor;

				if (numero1 > numero2) {
					guardaValor = numero1;
					numero1 = numero2;
					numero2 = guardaValor;
				}

				if (numero2 > numero3) {
					guardaValor = numero2;
					numero2 = numero3;
					numero3 = guardaValor;
				}
				if (numero1 > numero2) {
					guardaValor = numero1;
					numero1 = numero2;
					numero2 = guardaValor;
				}

				System.out.println(
						"Os números informados em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode o programa novamente.");
		}

		sc.close();

	}

}
