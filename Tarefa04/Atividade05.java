/**
 * 5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
 *  O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário,
 *   para que seja apresentado o valor em moeda americana
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade05 {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da cotação do dólar atual, para converter em dolar:");
		float cotacaoDolar = sc.nextFloat();
		
		System.out.println("Digite a quantidade de reais disponíveis, para converter o valor em moeda americana:");
		float quantidadeReais = sc.nextFloat();
		
		float conversaoEmDolar = cotacaoDolar * quantidadeReais;
		
		System.out.println("O valor de R$ " + quantidadeReais + " reais" + ", com cotação de US$ " + cotacaoDolar + ", equivale a: " + conversaoEmDolar + " Dólares");
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops, a proposta do programa é somente com números... rode novamente o programa.");
		}

	}

}
