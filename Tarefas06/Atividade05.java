/**
 * 5. Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, apresentando as duas raízes, 
 * se para os valores informados for possível efetuar o referido cálculo.
 *  Lembre-se de que a variável A deve ser diferente de zero.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Digite o valor de A, para resolver a equação de 2º grau:");
				int valorA = sc.nextInt();

				System.out.println("Digite o valor de B, para resolver a equação de 2º grau:");
				int valorB = sc.nextInt();

				System.out.println("Digite o valor de C, para resolver a equação de 2º grau:");
				int valorC = sc.nextInt();

				if (valorA == 0) {
					System.out.println("O valor de A não pode ser 0, para realizar a equação de 2º grau");

					System.out.println("Deseja calcular a função de 2º grau novamente?");
					resposta = sc.next();
				} else {

					int delta = (valorB * valorB) + (-4 * valorA * valorC);

					double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
					double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);

					System.out.println("O resultado da primeira raiz (x1) da equação de 2º grau, é: " + x1);
					System.out.println("O resultado da segunda raiz (x2) da equação de 2º grau, é: " + x2);

					System.out.println("Deseja calcular a média do aluno(a) novamente?");
					resposta = sc.next();

				}

			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa");
		}
		sc.close();

	}

}
