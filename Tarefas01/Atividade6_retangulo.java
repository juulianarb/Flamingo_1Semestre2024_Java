/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h */
package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade6_retangulo {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da base do retângulo, para calcular sua área:");
		float base = sc.nextFloat();
		
		System.out.println("Digite o número da altura do retângulo, para calcular sua área");
		float altura = sc.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A área do retângulo é: " +area +" mt²");
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
    }
}