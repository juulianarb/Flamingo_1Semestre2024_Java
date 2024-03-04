/* 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 *  Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número total de eleitores do município:");
		int totalEleitores = sc.nextInt();
		
		System.out.println("Digite o número de votos brancos:");
		int votosBrancos = sc.nextInt();
		
		System.out.println("Digite o número de votos nulos:");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite o número de votos válídos:");
		int votosValidos = sc.nextInt();
		
		int percentualBrancos = totalEleitores * votosBrancos / 100;
		int percentualNulos = totalEleitores * votosNulos / 100;
		int percentualValidos = totalEleitores * votosValidos / 100;
		
		System.out.println("O percentual de votos brancos com relação ao total de " + totalEleitores + " eleitores, é: "+ percentualBrancos + "%");
		System.out.println("O percentual de votos nulos com relação ao total de " + totalEleitores + " eleitores, é: "+ percentualNulos + "%");
		System.out.println("O percentual de votos válidos com relação ao total de " + totalEleitores + " eleitores, é: "+ percentualValidos + "%");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números inteiros... rode novamente o programa.");
		}
	}
}
