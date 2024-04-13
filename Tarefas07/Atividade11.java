/**
 * 11) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
       Morango : Até 5kg            Acima de 5kg
                 R$ 2,50 por kg    R$ 2,20 por kg
       Maçã:     R$ 1,80 por kg    R$ 1,50 por kg         


      Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10%
      sobre este total.
      Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser
      pago pelo cliente.
 */

package tarefa_para_casa6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite a quantidade (em kg) de morangos que deseja comprar: ");
				int quantidadeMorangos = sc.nextInt();

				System.out.println("Digite a quantidade (em kg) de maçãs que deseja comprar: ");
				int quantidadeMacas = sc.nextInt();

				float valorFinalMorangos = quantidadeMorangos * 2.50f;
				float valorFinalMacas = quantidadeMacas * 1.80f;

				if (quantidadeMorangos <= 5) {
					valorFinalMorangos = quantidadeMorangos * 2.50f;
					System.out.println("O valor total da compra dos morangos é : ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMorangos));
					System.out.println(" reais");

				} else if (quantidadeMorangos > 5) {
					valorFinalMorangos = quantidadeMorangos * 2.20f;
					System.out.println("O valor total da compra dos morangos é: ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMorangos));
					System.out.println(" reais");

				}

				if (quantidadeMorangos > 8 || valorFinalMorangos > 25) {
					valorFinalMorangos = valorFinalMorangos - (valorFinalMorangos * 0.1f);
					System.out.println("Oba, você ganhou um desconto de 10% ! O novo valor total da compra é de: ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMorangos));
					System.out.println(" reais");
				}

				if (quantidadeMacas <= 5) {
					valorFinalMacas = quantidadeMacas * 1.80f;
					System.out.println("O valor total da compra de maças é: ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMacas));
					System.out.println(" reais");

				} else if (quantidadeMacas > 5) {
					valorFinalMacas = quantidadeMacas * 1.50f;
					System.out.println("O valor total da compra de maças é: ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMacas));
					System.out.println(" reais");
				}

				if (quantidadeMacas > 8 || valorFinalMacas > 25) {
					valorFinalMacas = valorFinalMacas - (valorFinalMacas * 0.1f);
					System.out.println("Oba, você ganhou um desconto de 10% ! O novo valor total da compra é de: ");
					System.out.print(new DecimalFormat(".##").format(valorFinalMacas));
					System.out.println(" reais");
				}

				System.out.println("Deseja realizar uma nova compra?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
