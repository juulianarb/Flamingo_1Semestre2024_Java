/**
 * 12) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado.
 *  Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
 */

package tarefa_para_casa7;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";

		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		while (resposta.equals(resposta)|| resposta.equals("Sim")|| resposta.equals("s")|| resposta.equals("ss")) {
			
			System.out.println(
					"Informe o primeiro número inteiro positivo para descobrir o maior e o menor valor(Se for negativo o programa irá parar automaticamente):");
			int primeironumeroPositivo = sc.nextInt();
			
			System.out.println(
					"Informe o segundo número inteiro positivo para descobrir o maior e o menor valor(Se for negativo o programa irá parar automaticamente):");
			int segundoNumeroPositivo = sc.nextInt();

			if (primeironumeroPositivo < 0) {
				break;
			} else if (primeironumeroPositivo == 0 && segundoNumeroPositivo == 0) {
				System.out.println("Os números são iguais");
				break;
			} else if (segundoNumeroPositivo < 0) {
				break;
			} else if (primeironumeroPositivo == segundoNumeroPositivo) {
				System.out.println("Os números são iguais");
				break;
			}
			

			if (segundoNumeroPositivo > maiorNumero) {
				maiorNumero = segundoNumeroPositivo;
			}

			if (segundoNumeroPositivo < menorNumero) {
				menorNumero = segundoNumeroPositivo;
			}
			
			
			if (primeironumeroPositivo > maiorNumero) {
				maiorNumero = primeironumeroPositivo;
			}

			if (primeironumeroPositivo < menorNumero) {
				menorNumero = primeironumeroPositivo;
			}

			if (maiorNumero != Integer.MIN_VALUE) {
				System.out.println("O maior valor informado é: " + maiorNumero);
			} else {
				System.out.println("Nenhum valor positivo foi informado.");
			}

			if (menorNumero != Integer.MAX_VALUE) {
				System.out.println("O menor valor informado é: " + menorNumero);
			} else {
				System.out.println("Nenhum valor positivo foi informado.");
			}

			System.out.println("Deseja reiniciar o programa?");
			resposta = sc.next();
		}

		sc.close();
	}

}
