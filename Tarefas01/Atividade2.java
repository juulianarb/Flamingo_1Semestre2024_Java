// 2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.

package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber seu antecessor:");
		int valor = sc.nextInt();
		
		int resultado = valor - 1;
		
		System.out.println("O número antecessor do valor informado é: "+resultado);
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}
}
