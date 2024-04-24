/**
 * 11) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.
 */

package tarefa_para_casa9;

public class Atividade11 {

	public static void main(String[] args) {

		int fatorial = 1;

		System.out.println("Fatorial de números ímpares situados na faixa numérica de 1 a 10: \n");

		for (int i = 1; i < 10; i++) {

			if (i % 2 != 0) {
				fatorial = calculoDeFatorial(i);
				System.out.println("Fatorial de " + i + " = " + fatorial);
			}
		}

	}

	public static int calculoDeFatorial(int numero) {

		int fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		if (numero == 0) {
			return 1;
		} else if (numero < 0) {
			System.out.println("Não tem fatorial com números negativos");
		}
		return fatorial;
	}

}
