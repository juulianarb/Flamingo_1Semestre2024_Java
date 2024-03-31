/**
 * 12. Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens: 
 * "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", 
 * para o sexo informado como feminino. Apresente também junto da mensagem de saudação o nome previamente informado.
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

				System.out.println("Informe o seu nome:");
				String nome = sc.next();

				System.out.println("Informe o seu sexo:");
				String sexo = sc.next();

				if (sexo.equals("F") || sexo.equals("Feminino") || sexo.equals("f") || sexo.equals("feminino")) {
					System.out.println("Ilma Sra. " + nome);
				} else if (sexo.equals("M") || sexo.equals("Masculino") || sexo.equals("m")
						|| sexo.equals("masculino")) {
					System.out.println("Ilmo Sr. " + nome);
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com letras... Rode o programa novamente.");
		}
		sc.close();

	}

}
