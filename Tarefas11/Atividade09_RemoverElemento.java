// 10) União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.

package tarefa_para_casa10;

import java.util.Arrays;

public class Atividade09_RemoverElemento {

	public static void main(String[] args) {

		int vetor[] = { 3, 7, 5, 4, 2, 9, 8 };

		int elementoParaSerRemovido = 3; 
		
		int contador = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elementoParaSerRemovido) {
				contador++;
			}
		}
		
		int[] novoVetor = new int[vetor.length - contador];
		
		int contador2 = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != elementoParaSerRemovido) {
				novoVetor[contador2] = vetor[i];
				contador2++;
			}
		}

		System.out.println("Vetor original: " + Arrays.toString(vetor));
		
		System.out.println("O elemento removido é o número: " + elementoParaSerRemovido);
		
		System.out.println("Novo vetor: " + Arrays.toString(novoVetor));
	}

}
