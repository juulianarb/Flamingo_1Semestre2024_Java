/**
 * 4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {

			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite a nota da avaliação do aluno(a) no 1º ano:");
				float nota1Ano = sc.nextFloat();

				System.out.println("Digite a nota da avaliação do aluno(a) no 2º ano:");
				float nota2Ano = sc.nextFloat();

				float mediaCalculada = nota1Ano + nota2Ano / 2;

				if (mediaCalculada >= 6) {
					System.out.println("O aluno foi aprovado! A média dele(a) foi de: " + mediaCalculada);
				} else {
					System.out.println("O aluno não foi aprovado. A média dele(a) foi de: " + mediaCalculada);
				}

				System.out.println("Deseja calcular novamente?");
				resposta = sc.next();

			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números... Rode novamente o programa.");
		}

		sc.close();
	}

}
