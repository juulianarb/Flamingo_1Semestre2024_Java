/** 
 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Digite o primeiro número inteiro, para realizar o cálculo:");
				int primeiroValor = sc.nextInt();

				System.out.println("Digite o segundo número inteiro, para realizar o cálculo:");
				int segundoValor = sc.nextInt();

				int diferencaValores = Math.abs(primeiroValor - segundoValor);

				System.out.println("O resultado da diferença do maior valor para o menor é de: " + diferencaValores);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}
			
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode novamente");
		}
		sc.close();
	}

}
