/** 
 * 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, 
 * o programa deverá apresentar o módulo de um número fornecido. 
 * Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Digite um número inteiro:");
				int valor = sc.nextInt();

				if (valor < 0) {
					valor = valor * (-1);
					System.out.println("O valor positivo do número fornecido é de: " + valor);
				} else {
					System.out.println("O valor positivo do número fornecido é de: " + valor);
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}
			
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode novamente");
		}

		sc.close();

	}

}
