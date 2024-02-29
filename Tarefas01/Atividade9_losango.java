//Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade9_losango {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior, para calcular a área do losango:");
		float diagonalMaior = sc.nextFloat();
		
		System.out.println("Digite o valor da diagonal menor, para calcular a área do losango:");
		float diagonalMenor = sc.nextFloat();
		
		float area = diagonalMaior * diagonalMenor / 2;
		
		System.out.println("A área do losango é: "+area + " mt²");
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}

}
