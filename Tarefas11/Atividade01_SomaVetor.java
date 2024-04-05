/**
 *1) Soma dos Elementos: Escreva um programa que calcule a soma de todos os elementos de um vetor de inteiros 
 */

package tarefa_para_casa10;

public class Atividade01_SomaVetor {

	public static void main(String[] args) {
		            
		int vetorSoma[] = {2,5,9,4,6};
		
		int soma = 0;
		
		for (int contador = 0; contador < vetorSoma.length; contador++) {
			
			soma += vetorSoma[contador];
			
		}
		System.out.println("A soma dos elementos dentro do vetor é de: " + soma);

	}

}
