// Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade7_triangulo {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triângulo, para calcular sua área:");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do triângulo, para calcular sua área:");
		float altura = sc.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("A área do triângulo é: "+area + " mt²");
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}
}
