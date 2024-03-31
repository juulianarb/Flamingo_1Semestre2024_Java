/**
 * 10. Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, 
 * o programa deverá indicar uma de duas mensagens: "O valor está na faixa permitida", 
 * caso o usuário forneça o valor nesta faixa, ou a mensagem "O valor está fora da faixa permitida", 
 * caso o usuário forneça valores menores que 1 ou maiores que 9.
 * 
 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro, que esteja entre 1 e 9:");
		int numero = sc.nextInt();
		
		if (numero > 9) {
			System.out.println("O valor está fora da faixa permitida.");
		} else if (numero <= 0) {
			System.out.println("O valor está fora da faixa permitida.");
		} else {
			System.out.println("O valor está na faixa permitida.");
		}
		sc.close();
	}

}
