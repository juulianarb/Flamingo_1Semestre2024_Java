/**
 * 6) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório,
 *  a média aritmética e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
 *   valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
 *    como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da média.
 */

package tarefa_para_casa8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalSomatorio = 0;
		int quantidadeDeNumerosFornecidos = 0;

		System.out.println("Informe um número inteiro positivo (ou um número negativo para sair):");

		int numeroInteiro = sc.nextInt();

		while (numeroInteiro >= 0) {
			totalSomatorio += numeroInteiro;
			quantidadeDeNumerosFornecidos++;

			System.out.println("Digite um número positivo (ou um número negativo para sair):");
			numeroInteiro = sc.nextInt();
		}

		if (quantidadeDeNumerosFornecidos > 0) {
			double media = (double) totalSomatorio / quantidadeDeNumerosFornecidos;
			System.out.println("Total do somatório: " + totalSomatorio);
			System.out.print("Média aritmética: ");
			System.out.println(new DecimalFormat(".#").format(media));
			System.out.println("Total de valores lidos: " + quantidadeDeNumerosFornecidos);
		} else {
			System.out.println("Nenhum número foi fornecido.");
		}

		sc.close();
	}

}
