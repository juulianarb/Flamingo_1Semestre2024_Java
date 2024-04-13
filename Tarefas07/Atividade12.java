/**
 * 12) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente
 *  no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. 
 *  Caso o Código seja correto, deve ser lido outro valor que é a senha. 
 *  Se esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
 *   Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				int codigo = 1234;
				int senha = 9999;

				System.out.println("Digite o código de usuário:");
				int codigoUsuario = sc.nextInt();

				if (codigoUsuario != codigo) {
					System.out.println("Usuário inválido!");
				} else {
					System.out.println("Digite a senha:");
					int senhaUsuario = sc.nextInt();

					if (senhaUsuario != senha) {
						System.out.println("Senha incorreta");
					} else {
						System.out.println("Acesso permitido");
					}
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
