/**
 * 3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o primeiro número, para somar os dois maiores:");
				int primeiroNumero = sc.nextInt();

				System.out.println("Digite o segundo número, para somar os dois maiores:");
				int segundoNumero = sc.nextInt();

				System.out.println("Digite o terceiro número, para somar os dois maiores:");
				int terceiroNumero = sc.nextInt();

				int somaDosMaioresNumeros = somaDosMaiores(primeiroNumero, segundoNumero, terceiroNumero);

				System.out.println("A soma dos dois maiores números informados é de: " + somaDosMaioresNumeros);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode o programa novamente");
		}
		sc.close();
	}

	public static int somaDosMaiores(int num1, int num2, int num3) {

		if (num1 >= num2 && num1 >= num3 && num2 > num3) {
			return num1 + num2;
		} else if (num2 >= num1 && num2 >= num3 && num3 > num1) {
			return num2 + num3;
		} else if (num1 >= num2 && num1 >= num3 && num3 > num2) {
			return num1 + num3;
		} else {
			return num1 + num2;
		}
	}

}
