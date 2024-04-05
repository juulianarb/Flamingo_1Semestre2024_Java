/**
 * 10) União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.
 */

package tarefa_para_casa10;

import java.util.Arrays;

public class Atividade10_UniaoDeVetores {

	public static void main(String[] args) {
		
		int[] vetorN1 = {1, 2, 3, 4};
        int[] vetorN2 = {5, 6, 7, 8};

        int tamanhoDosDoisVetores = vetorN1.length + vetorN2.length;
        int[] vetorN3 = new int[tamanhoDosDoisVetores];

        for (int i = 0; i < vetorN1.length; i++) {
            vetorN3[i] = vetorN1[i];
        }

        for (int i = 0; i < vetorN2.length; i++) {
            vetorN3[vetorN1.length + i] = vetorN2[i];
        }

        System.out.println("Os valores do vetor 1: " + Arrays.toString(vetorN1));
        System.out.println("Os valores do vetor 2: " + Arrays.toString(vetorN2));
        System.out.println("A união dos valores do vetor 1 e 2 para o vetor 3: " + Arrays.toString(vetorN3));
    }

	}

