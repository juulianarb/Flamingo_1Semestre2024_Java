/**
 * 2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento, para calcular o volume de uma caixa retângular:");
		float comprimento = sc.nextFloat();
		
		System.out.println("Digite a largura, para calcular o volume de uma caixa retângular:");
		float largura = sc.nextFloat();
		
		System.out.println("Digite a altura, para calcular o volume de uma caixa retângular:");
		float altura = sc.nextFloat();
		
		float volume = comprimento * largura * altura;
		
		System.out.println("O volume de uma caixa retângular é de: "+ volume + " m³");
		
		sc.close();

		} catch (Exception e) {
			System.out.println("Oops digite apenas números... rode novamente o programa.");
		}
	}

}
