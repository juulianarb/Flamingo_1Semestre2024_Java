/**
 * 2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Informe o primeiro número inteiro:");
				int numero1 = sc.nextInt();

				System.out.println("Informe o segundo número inteiro:");
				int numero2 = sc.nextInt();

				System.out.println("Informe o terceiro número inteiro:");
				int numero3 = sc.nextInt();

				int maiorNumero = numero1;

				if (numero2 > maiorNumero) {
					maiorNumero = numero2;
				}

				if (numero3 > maiorNumero) {
					maiorNumero = numero3;
				}

				System.out.println("O maior número entre os números informados é: " + maiorNumero);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode o programa novamente.");
		}

		sc.close();
	}

}
