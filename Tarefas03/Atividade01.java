/* 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
 *  Considerar ano com 365 dias e mês com 30 dias. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade01 {

	public static void main (String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos completos atual:");
		int idadeAnos = sc.nextInt();
		
		System.out.println("Informe sua idade em meses, em que passou o seu ultimo aniversário:");
		int idadeMeses = sc.nextInt();
		
		System.out.println("Informe a quantidade de dias em que passou seu ultimo mêsversário:");
		int idadeDias = sc.nextInt();
		
		int quantidadeDiasVividos = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		System.out.println("A sua idade em dias é de: "+ quantidadeDiasVividos + " dias");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números inteiros... rode novamente o programa.");
		}
	}
}
