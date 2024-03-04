/* 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
 *  Considerar ano com 365 dias e mês com 30 dias. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade01 {

	public static void main (String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos:");
		int idadeAnos = sc.nextInt();
		
		System.out.println("Informe sua idade em meses:");
		int idadeMeses = sc.nextInt();
		
		System.out.println("Informe sua idade em dias:");
		int idadeDias = sc.nextInt();
		
		int dias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		System.out.println("A sua idade em dias é de: "+ dias + " dias");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números inteiros... rode novamente o programa.");
		}
	}
}
