/**
 * 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o primeiro valor inteiro:");
				int valor1 = sc.nextInt();

				System.out.println("Digite o segundo valor inteiro:");
				int valor2 = sc.nextInt();

				if (valor1 > valor2) {
					System.out.println("O maior número entre " + valor1 + " e " + valor2 + ", é: " + valor1);
				} else if (valor2 > valor1) {
					System.out.println("O maior número entre " + valor1 + " e " + valor2 + ", é: " + valor2);
				} else {
					System.out.println("Não existe número maior, pois os números digitados são iguais");
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
