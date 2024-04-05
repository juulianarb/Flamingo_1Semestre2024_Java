/**
 * 2) Maior e Menor Valor: Crie um programa que encontre o maior e o menor valor em um vetor de números inteiros.
 */

package tarefa_para_casa10;

public class Atividade02_MaiorMenorValor {

	public static void main(String[] args) {
		
		int maiorValor = 0;
		int menorValor = Integer.MAX_VALUE;

		int vetorDeInteiros[] = {5,9,7,3,2,4,18,65,87,48,52};
		
		for (int contador = 0; contador < vetorDeInteiros.length; contador++) {
			
			if (vetorDeInteiros[contador] > maiorValor ) {
				maiorValor = vetorDeInteiros[contador];
			}
			
			if (vetorDeInteiros[contador] < menorValor) {
				menorValor = vetorDeInteiros[contador];
			}
			
		}
		System.out.println("O maior número no vetor de inteiros é: " + maiorValor);
		System.out.println("O menor número no vetor de inteiros é: " + menorValor);
	}

}
