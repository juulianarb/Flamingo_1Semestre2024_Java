/**
 * 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o número de maçãs compradas, para saber o custo total da compra:");
				int macasCompradas = sc.nextInt();

				if (macasCompradas < 12) {

					double totalMacas = macasCompradas * 1.30f;
					System.out.printf("O custo total da compra de maçãs é de : R$%.2f\n " , totalMacas);
				} else {

					double totalMacas = macasCompradas * 1.00f;
					System.out.printf(
							"Você teve um desconto por comprar mais de 12! O custo total da compra de maçãs é de: R$%.2f\n"
									, totalMacas);
				}

				System.out.println("Deseja efetuar uma nova compra?");
				resposta = sc.next();
			}
			
		} catch (Exception e) {

			System.out.println("A proposta do programa é somente com números inteiros... Rode novamente o programa.");
		}

		sc.close();

	}

}
