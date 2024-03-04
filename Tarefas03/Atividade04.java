/* 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
 *   (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 *   escrever um algoritmo para ler o custo de fábrica de um carro, 
 *   calcular e escrever o custo final ao consumidor. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade04 {
	
	public static void main (String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do veículo, para saber o valor final com os impostos:");
		float custoFabrica = sc.nextFloat();
		
		double percentualDistribuidor = 0.28;
		double impostos = 0.45;
		
		double valorFinal =  custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);
		
		System.out.println("O valor final do veículo para o consumidor é de: "+ valorFinal + "R$");
		
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números... rode novamente o programa.");
		}
	}

}
