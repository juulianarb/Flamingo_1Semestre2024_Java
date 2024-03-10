/**
 * 7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número, para ser o valor de A:");
		float valorA = sc.nextFloat();
		
		System.out.println("Digite um número, para ser o valor de B:");
		float valorB = sc.nextFloat();
		
		System.out.println("Digite um número, para ser o valor de C:");
		float valorC = sc.nextFloat();
		
		float soma = valorA + valorB + valorC;
		
		float quadradoDaSoma = soma * soma;
		
		System.out.println("O resultado do quadrado da soma dos três valores A, B e C é de: "+ quadradoDaSoma);
		sc.close();
		} catch (Exception e) {
			System.out.println("a proposta do programa é somente com números... rode novamente o programa.");
		}

	}

}
