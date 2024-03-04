/* 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 *  Calcular e escrever o valor do novo salário. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário atual do funcionário, para calcular o reajuste:");
		float salarioAtual = sc.nextFloat();
		
		System.out.println("Digite o percentual do reajuste:");
		float percentual = sc.nextFloat();
		
		float salarioNovo = salarioAtual + (salarioAtual * (percentual / 100));
		
		System.out.println("O salário do funcionário passou de " + salarioAtual + "R$" + " para: " + salarioNovo + "R$");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números... rode novamente o programa.");
		}
	}

}
