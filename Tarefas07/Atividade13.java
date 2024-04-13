/**
 * 13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. 
 * Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto),
 *  sabendo-se que:
 *  
- Se quantidade <= 5 o desconto será de 2%

- Se quantidade > 5 e quantidade <=10 o desconto será de 3%

- Se quantidade > 10 o desconto será de 5%
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o nome do produto: ");
			String nomeProduto = sc.next();

			System.out.println("Informe a quantidade adquirida do produto:");
			int quantidadeDoProduto = sc.nextInt();

			System.out.println("Digite o preço unitário do produto:");
			float precoUnitario = sc.nextFloat();

			float total = quantidadeDoProduto * precoUnitario;

			if (quantidadeDoProduto <= 5) {
				float totalAPagar = total - 0.02f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 2%, é de "
						+ totalAPagar + " reais");
			} else if (quantidadeDoProduto > 5 && quantidadeDoProduto <= 10) {
				float totalAPagar = total - 0.03f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 3%, é de "
						+ totalAPagar + " reais");
			} else if (quantidadeDoProduto > 10) {
				float totalAPagar = total - 0.05f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 5%, é de "
						+ totalAPagar + " reais");
			}

			System.out.println("Deseja comprar mais um produto?");
			resposta = sc.next();

		}

		sc.close();

	}

}
