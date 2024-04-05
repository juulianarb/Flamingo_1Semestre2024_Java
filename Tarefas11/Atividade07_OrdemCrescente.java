/**
 * 7) Ordenação Crescente: Implemente um algoritmo que ordene os elementos de um vetor em ordem crescente.
 */

package tarefa_para_casa10;

import java.util.Arrays;

public class Atividade07_OrdemCrescente {

	public static void main(String[] args) {

		double VetorDesordenado[] = { 9, 63, 2, 4, -5.6, 8.75, 95, 32, -10.60 };
		Arrays.sort(VetorDesordenado);

		for (double valoresOrdenados : VetorDesordenado) {

			System.out.println(valoresOrdenados);
		}

	}

}
