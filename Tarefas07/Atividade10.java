/**
 * 10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres 
 * (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). 
 * Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
 *  e o produto das idades do homem mais novo com a mulher mais velha.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe a idade do primeiro homem:");
			int idadePrimeiroHomem = sc.nextInt();

			System.out.println("Informe a idade do segundo homem:");
			int idadeSegundoHomem = sc.nextInt();

			System.out.println("Informe a idade da primeira mulher");
			int idadePrimeiraMulher = sc.nextInt();

			System.out.println("Informe a idade da segunda mulher:");
			int idadeSegundaMulher = sc.nextInt();

			if (idadePrimeiroHomem > idadeSegundoHomem && idadePrimeiraMulher > idadeSegundaMulher) {
				int somaDasIdades = idadePrimeiroHomem + idadeSegundaMulher;
				System.out
						.println("A soma das idades do homem mais velho e da mulher mais nova é de: " + somaDasIdades);
				int produtoIdades = idadeSegundoHomem * idadePrimeiraMulher;
				System.out.println(
						"O produto das idades do homem mais novo e da mulher mais velha é de: " + produtoIdades);

			} else if (idadeSegundoHomem > idadePrimeiroHomem && idadeSegundaMulher > idadePrimeiraMulher) {
				int somaDasIdades = idadeSegundoHomem + idadePrimeiraMulher;
				System.out
						.println("A soma das idades do homem mais velho e da mulher mais nova é de: " + somaDasIdades);
				int produtoIdades = idadePrimeiroHomem * idadeSegundaMulher;
				System.out.println(
						"O produto das idades do homem mais novo e da mulher mais velha é de: " + produtoIdades);

			} else if (idadePrimeiroHomem > idadeSegundoHomem && idadeSegundaMulher > idadePrimeiraMulher) {
				int somaDasIdades = idadePrimeiroHomem + idadePrimeiraMulher;
				System.out
						.println("A soma das idades do homem mais velho e da mulher mais nova é de: " + somaDasIdades);
				int produtoIdades = idadeSegundoHomem * idadeSegundaMulher;
				System.out.println(
						"O produto das idades do homem mais novo e da mulher mais velha é de: " + produtoIdades);

			} else if (idadeSegundoHomem > idadePrimeiroHomem && idadePrimeiraMulher > idadeSegundaMulher) {
				int somaDasIdades = idadeSegundoHomem + idadeSegundaMulher;
				System.out
						.println("A soma das idades do homem mais velho e da mulher mais nova é de: " + somaDasIdades);
				int produtoIdades = idadePrimeiroHomem * idadePrimeiraMulher;
				System.out.println(
						"O produto das idades do homem mais novo e da mulher mais velha é de: " + produtoIdades);

			} else {
				System.out.println("A proposta do programa é com idades diferentes.");
			}

			System.out.println("Deseja reiniciar o programa?");
			resposta = sc.next();

		}
		
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
