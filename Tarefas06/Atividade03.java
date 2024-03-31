/**
 * 3. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
 * se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
 * Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		String resposta = "sim";

		Scanner sc = new Scanner(System.in);

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Informe o valor da 1º nota do aluno(a):");
				float primeiraNota = sc.nextFloat();

				System.out.println("Informe o valor da 2º nota do aluno(a):");
				float segundaNota = sc.nextFloat();

				System.out.println("Informe o valor da 3º nota do aluno(a):");
				float terceiraNota = sc.nextFloat();

				System.out.println("Informe o valor da 4º nota do aluno(a):");
				float quartaNota = sc.nextFloat();

				float mediaAluno = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

				if (mediaAluno >= 5) {
					System.out.println("O aluno(a) foi aprovado!\n A média do aluno(a) foi de: " + mediaAluno);
				} else {
					System.out.println(
							"O aluno(a) não foi aprovado, pois sua média foi abaixo de 5.\n A média do aluno(a) foi de: "
									+ mediaAluno);
				}

				System.out.println("Deseja calcular a média do aluno(a) novamente?");
				resposta = sc.next();

			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números... Rode novamente");
		}

		sc.close();

	}

}
