/**
 * 1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade distributiva. 
 * Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D.
 *  Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		try {
        Scanner sc = new Scanner(System.in);


		System.out.println("Digite um número inteiro, para ser o valor de A:");

		int valorA = sc.nextInt();

		

		System.out.println("Digite um número inteiro, para ser o valor de B:");

		int valorB = sc.nextInt();

		

		System.out.println("Digite um número inteiro, para ser o valor de C:");

		int valorC = sc.nextInt();

		

		System.out.println("Digite um número inteiro, para ser o valor de D:");

		int valorD = sc.nextInt();

		

		int somaAeB = valorA + valorB;

		int somaAeC = valorA + valorC;

		int somaAeD = valorA + valorD;

		int somaBeC = valorB + valorC;

		int somaBeD = valorB + valorD;

		int somaCeD = valorC + valorD;

		

		int multiplicacaoAeB = valorA * valorB;

		int multiplicacaoAeC = valorA * valorC;

		int multiplicacaoAeD = valorA * valorD;

		int multiplicacaoBeC = valorB * valorC;

		int multiplicacaoBeD = valorB * valorD;

		int multiplicacaoCeD = valorC * valorD;

		

		System.out.println("A soma de A e B é: " + somaAeB +"\nA soma de A e C é: " + somaAeC + "\nA soma de A e D é: "+ somaAeD +

		"\nA soma de B e C é: " + somaBeC + "\nA soma de B e D é: "+ somaBeD + "\nA soma de C e D é: "+ somaCeD +

		"\nA multiplicação de A e B é: " + multiplicacaoAeB + "\nA multiplicação de A e C é: "+ multiplicacaoAeC + "\nA multiplicação de A e D é: "+ multiplicacaoAeD +

		"\nA multiplicação de B e C é: "+ multiplicacaoBeC + "\nA multiplicação de B e D é: " + multiplicacaoBeD + "\nA multiplicação de C e D é: "+ multiplicacaoCeD);

		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, a proposta do programa é somente com números inteiros... rode novamente o programa.");
		}

	}	

	}

