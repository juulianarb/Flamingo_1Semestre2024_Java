// Escreva um algoritmo para ler as dimensões de um trapézio (base maior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2

package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade10_trapezio {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior, para calcular a área do trapézio:");
		float baseMaior = sc.nextFloat();
		
		System.out.println("Digite o valor da base menor, para calcular a área do trapézio:");
		float baseMenor = sc.nextFloat();
		
		System.out.println("Digite o valor da altura, para calcular a área do trapézio:");
		float altura = sc.nextFloat();
		
		float area = (baseMaior + baseMenor) * altura / 2;
		
		System.out.println("A área do trapézio é: "+area);
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}

}
