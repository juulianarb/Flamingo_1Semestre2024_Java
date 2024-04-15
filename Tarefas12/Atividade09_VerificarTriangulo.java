/**
 * 9) Verificar Triângulo: Implemente um método que receba três números inteiros como argumentos 
 * e retorne verdadeiro se eles podem ser os comprimentos dos lados de um triângulo, e falso caso contrário.
 */

package tarefa_para_casa11;

import java.util.Scanner;

public class Atividade09_VerificarTriangulo {

	static boolean verificarSeFormaUmTriangulo(int ladoA, int ladoB, int ladoC) {
		if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
			return false;
		}

		if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado1 = sc.nextInt();

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado2 = sc.nextInt();

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado3 = sc.nextInt();

				if (verificarSeFormaUmTriangulo(lado1, lado2, lado3)) {
					System.out.println("Os comprimentos informados podem formar um triângulo.");
				} else {
					System.out.println("Os comprimentos informados NÃO podem formar um triângulo.");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out
					.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
