/**
 * 1) Ler um valor e escrever se é positivo, negativo ou zero.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";
		
		try {
		while (resposta.equals(resposta)|| resposta.equals("Sim")|| resposta.equals("s")) {
		
		System.out.println("Digite um número: ");
		float numero = sc.nextFloat();
		
		if (numero > 0) {
			System.out.println("O número " + numero + " é positivo.");
		} else if (numero == 0) {
			System.out.println("O número informado é zero.");
		} else {
			System.out.println("O número " + numero + " é negativo");
		}
		System.out.println("Deseja reiniciar o programa?");
		resposta = sc.next();
		
		}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números...Rode o programa novamente.");
		}
		
		sc.close();

	}

}
