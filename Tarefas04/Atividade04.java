/**
 * 4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
 *  O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
 *   para que seja apresentado o valor em moeda brasileira.
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade04 {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da cotação do dólar atual, para converter em real:");
		float cotacaoDolar = sc.nextFloat();
		
		System.out.println("Digite a quantidade de dólares disponíveis, para converter em real:");
		float quantidadeDolares = sc.nextFloat();
		
		float conversaoEmReal = cotacaoDolar * quantidadeDolares;
		
		System.out.println("O valor de US$ " + quantidadeDolares + ", com cotação de US$ " + cotacaoDolar + ", equivale a: " + conversaoEmReal + " reais");
		sc.close();
		} catch (Exception e) {
			System.out.println("Ooops, a proposta do programa é somente com números... rode novamente o programa.");
		}
		
	}

}
