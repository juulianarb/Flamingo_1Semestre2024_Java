// 4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores.

package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número para multiplicar:");
		int valor = sc.nextInt();
		
		System.out.println("Digite o segundo número para multiplicar:");
		int valor2 = sc.nextInt();
		
		int resultado = valor * valor2;
		
		System.out.println("A multiplicação dos valores é: "+resultado);
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}
}
