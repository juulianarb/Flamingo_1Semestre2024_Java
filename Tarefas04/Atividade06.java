/**
 * 6) Elaborar um programa que efetue a leitura de três valores (A, B e C)
 *  e apresente como resultado final à soma dos quadrados dos três valores lidos.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número, para ser o valor de A:");
		float valorA = sc.nextFloat();
		
		System.out.println("Digite um número, para ser o valor de B:");
		float valorB = sc.nextFloat();
		
		System.out.println("Digite um número, para ser o valor de C:");
		float valorC = sc.nextFloat();
		
		float resultado = (valorA * valorA) + (valorB * valorB) + (valorC * valorC);
		
		System.out.println("O resultado da soma dos quadrados dos valores A, B e C é de: " + resultado);
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, a proposta do programa é somente com números... rode novamente o programa.");
		}

	}

}
