/**
 * 8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D).
 *  Ao final o programa deve apresentar o resultado do produto (variável P)
 *  do primeiro com o terceiro valor e o resultado da soma (variável S) do segundo com o quarto valor.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade08 {

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
		
		int produto = valorA + valorC;
		int soma = valorB + valorD;
		
		System.out.println("O resultado do produto(A e C) é de: " + produto + ", e o resultado da soma(B e D) é de: " + soma);
		sc.close();
		} catch (Exception e) {
			System.out.println("a proposta do programa é somente com números inteiros... rode novamente o programa.");
		}

	}

}
