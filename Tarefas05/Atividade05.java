/**
 * 5) Ler o ano atual e o ano de nascimento de uma pessoa. 
 * Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
		while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Digite o ano atual:");
			int anoAtual = sc.nextInt();

			System.out.println("Digite o ano do seu nascimento:");
			int anoNascimento = sc.nextInt();

			int idade = anoAtual - anoNascimento;

			if (idade >= 16) {
				System.out.println("Você tem " + idade + " anos, pode votar este ano");
			} else {
				System.out.println("Você tem " + idade + " anos, não pode votar este ano");
			}

			System.out.println("Deseja saber se você pode votar novamente?");
			resposta = sc.next();

		}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números... Rode novamente o programa.");
		}
		sc.close();

	}

}
