/**
 * 7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o primeiro valor inteiro:");
				int numero1 = sc.nextInt();

				System.out.println("Digite o segundo valor inteiro:");
				int numero2 = sc.nextInt();

				int maiorNumero, menorNumero;

				if (numero1 < numero2) {
					maiorNumero = numero2;
					menorNumero = numero1;
					System.out.println("Valores em ordem crescente: " + menorNumero + " " + maiorNumero);

				} else if (numero2 < numero1) {
					maiorNumero = numero1;
					menorNumero = numero2;
					System.out.println("Valores em ordem crescente: " + menorNumero + " " + maiorNumero);

				} else {
					System.out.println("Os números digitados são iguais");
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
