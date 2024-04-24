/**
 * 9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência:
 *  1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. 
 *  Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo valor da seqüência.
 *   Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
 */

package tarefa_para_casa9;

public class Atividade09 {

	public static void main(String[] args) {

		int primeiroTermoFibonacci = 1;
		int segundoTermoFibonacci = 1;

		System.out.print("Série de Fibonacci até o décimo quinto termo: ");

		System.out.print(primeiroTermoFibonacci + " ");
		System.out.print(segundoTermoFibonacci + " ");

		for (int i = 2; i < 15; i++) {
			int termoSeguinte = primeiroTermoFibonacci + segundoTermoFibonacci;

			System.out.print(termoSeguinte + " ");
			primeiroTermoFibonacci = segundoTermoFibonacci;
			segundoTermoFibonacci = termoSeguinte;

		}

	}

}
