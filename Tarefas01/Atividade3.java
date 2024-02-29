// 3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.

package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número para subtrair:");
		float valor = sc.nextFloat();
		
		System.out.println("Digite o segundo número para subtrair:");
		float valor2 = sc.nextFloat();
		
		float resultado = valor - valor2;
		
		System.out.println("A subtração dos valores é: "+resultado);
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}
}
