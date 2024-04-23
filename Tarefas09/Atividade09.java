/**
 * 9) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. 
 * Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
 * 
 */

package tarefa_para_casa8;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		System.out.println("Informe um número inteiro positivo (ou um número negativo para sair):");
	

		while (true) {
			int numeroInteiro = sc.nextInt();

			if (numeroInteiro < 0) {
				break;

			}

			if (numeroInteiro > maiorNumero) {
				maiorNumero = numeroInteiro;
			}

			if (numeroInteiro < menorNumero) {
				menorNumero = numeroInteiro;
			}
		}
		
			System.out.println("Maior valor informado: " + maiorNumero);
			System.out.println("Menor valor informado: " + menorNumero);
			
			sc.close();
		}
	}

