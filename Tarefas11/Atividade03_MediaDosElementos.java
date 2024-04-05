/**
 * 3) Média dos Elementos: Desenvolva um programa que calcule a média dos elementos em um vetor de números reais.
 */

package tarefa_para_casa10;

public class Atividade03_MediaDosElementos {

	public static void main(String[] args) {
		
		int soma = 0;
		
		int vetor[] = {50,-5,10,23,-15,-9};
		
		for (int contador = 0; contador < vetor.length; contador++) {
			
			soma += vetor[contador];
		}
		
		 int media = soma / 6;
		
		System.out.println("A média dos elementos do vetor é: " + media);
	}

}
