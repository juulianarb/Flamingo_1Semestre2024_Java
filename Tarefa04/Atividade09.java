/**
 * 9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído.
 *  Apresentar o valor do novo salário (variável NS).
 */

package tarefa_para_casa3;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mensal atual, para calcular o novo salário:");
		float salarioMensal = sc.nextFloat();
		
		System.out.println("Digite o valor do percentual de reajuste, para calcular o novo salário:");
		float percentualReajuste = sc.nextFloat();
		
		float novoSalario = salarioMensal + (salarioMensal * (percentualReajuste / 100));
		
		System.out.println("Com o reajuste, o salário do funcionário passou de: " + salarioMensal + "R$" + ", para o salário de: " + novoSalario + "R$");
		
		sc.close();

	}

}
