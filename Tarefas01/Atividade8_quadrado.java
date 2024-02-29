// Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade8_quadrado {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de lado do quadrado, para calcular sua área:");
		float lado = sc.nextFloat();
		
		float area = lado * lado;
		
		System.out.println("A área do quadrado é: "+area + " mt²");
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
		
	}
}
