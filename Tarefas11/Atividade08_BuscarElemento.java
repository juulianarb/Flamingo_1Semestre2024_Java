/**
 * 8) Buscar Elemento: Escreva um programa que verifique se um determinado elemento está presente em um vetor.
 */

package tarefa_para_casa10;

import java.util.Arrays;

public class Atividade08_BuscarElemento {

	public static void main(String[] args) {

		int vetor[] = { 3, 7, 5, 4, 2, 9, 8 };

		for (int v : vetor) {
			System.out.print(v + " ");
		}

		System.out.println("");
		int p = Arrays.binarySearch(vetor, 4);

		System.out.println("Encontrei meu valor na posição " + p);

	}

}
