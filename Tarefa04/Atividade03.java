/**
 * 3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro, para ser o valor de A:");
		int valorA  = sc.nextInt();
		
		System.out.println("Digite um número inteiro, para ser o valor de B:");
		int valorB  = sc.nextInt();
		
		int resultado = (valorA - valorB) * (valorA - valorB);
		
		System.out.println("O resultado do quadrado da diferença entre o valor A e B é de: "+ resultado);
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, a proposta do programa é somente com números inteiros... rode novamente o programa.");
		}
	}

}
