/**
 * 8) Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.
 */

package tarefa_para_casa11;

import java.util.Scanner;

public class Atividade08_CalcularPotencia {

	public static int calculoDePotencia(int base, int expoente) {

		if (expoente == 0) {
			return 1;

		} else {
			int resultado = 1;

			for (int i = 0; i < expoente; i++) {
				resultado *= base;

			}
			return resultado;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o valor da base com números inteiros: ");
				int base = sc.nextInt();

				System.out.println("Digite o valor do expoente com números inteiros: ");
				int expoente = sc.nextInt();

				int resultado = calculoDePotencia(base, expoente);
				System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

				System.out.println("Deseja realizar mais um calculo de potência?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números...Rode novamente o programa.");
		}

		sc.close();

	}

}
