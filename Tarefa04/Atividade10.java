/**
 * 10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
 * 
 * Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato.
 * 
 * Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada candidato, além de efetuar também
 * a leitura da quantidade de votos nulos e votos em branco.
 * 
 * Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco;
 * 
 * o percentual correspondente de votos válidos em relação à quantidade de eleitores;
 * 
 * o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
 *  
 * o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores;
 * 
 * o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores;
 * 
 * o percentual correspondente de votos nulos em relação à quantidade de eleitores;
 *  
 * e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número total de votos válidos do candidato A: ");
		int candidatoA = sc.nextInt();
		
		System.out.println("Digite o número total de votos válidos do candidato B: ");
		int candidatoB = sc.nextInt();
		
		System.out.println("Digite o número total de votos válidos do candidato C: ");
		int candidatoC = sc.nextInt();
		
		System.out.println("Digite o número de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite o número de votos brancos: ");
		int votosBrancos = sc.nextInt();
		
		int totalDeEleitores = candidatoA + candidatoB + candidatoC + votosNulos + votosBrancos;
		
		float percentualVotosValidos = ((float) (candidatoA+ candidatoB + candidatoC) / totalDeEleitores) * 100;
		
		float conversorVotosValidos = percentualVotosValidos;
		int conversorIntValidos = (int) conversorVotosValidos;
		
		float percentualCandidatoA = ((float) candidatoA / totalDeEleitores) * 100;
		
		float conversorCandidatoA = percentualCandidatoA;
		int conversorIntCandidatoA = (int) conversorCandidatoA;
		
		float percentualCandidatoB = ((float) candidatoB / totalDeEleitores) * 100;
		
		float conversorCandidatoB = percentualCandidatoB;
		int conversorIntCandidatoB = (int) conversorCandidatoB;
		
		float percentualCandidatoC = ((float) candidatoC / totalDeEleitores) * 100;
		
		float conversorCandidatoC = percentualCandidatoC;
		int conversorIntCandidatoC = (int) conversorCandidatoC;
		
		float percentualNulos = ((float) votosNulos / totalDeEleitores) * 100;
		
		float conversorNulos = percentualNulos;
		int conversorIntNulos = (int) conversorNulos;
		
		float percentualBrancos = ((float) votosBrancos / totalDeEleitores) * 100;
		
		float conversorBrancos = percentualBrancos;
		int conversorIntBrancos = (int) conversorBrancos;
	    
		
		System.out.println("O número total de eleitores, considerando votos nulos e brancos, é de: " + totalDeEleitores + " eleitores.");
		System.out.println("O percentual de votos válidos com relação a quantidade de eleitores, é de: " + conversorIntValidos + "%");
		System.out.println("O percentual de votos válidos do candidato A em relação à quantidade de eleitores, é de: " + conversorIntCandidatoA + "%");
		System.out.println("O percentual de votos válidos do candidato B em relação à quantidade de eleitores, é de: " + conversorIntCandidatoB  + "%");
		System.out.println("O percentual de votos válidos do candidato C em relação à quantidade de eleitores, é de: " + conversorIntCandidatoC + "%");
		System.out.println("O percentual de votos nulos em relação à quantidade de eleitores, é de: " + conversorIntNulos + "%");
		System.out.println("o percentual de votos brancos em relação à quantidade de eleitores, é de: " + conversorIntBrancos + "%");
		
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, a proposta do programa é apenas com números inteiros... rode o programa novamente.");
		}

	}

}
