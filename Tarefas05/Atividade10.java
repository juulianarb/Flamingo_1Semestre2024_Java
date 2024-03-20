/**
 * 10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 *  Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor,
 *   calcular e escrever o seu salário total.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário fixo do funcionário:");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Digite o valor das vendas efetuadas:");
		float valorVendas = sc.nextFloat();
		
		float comissao;
		
	    if (valorVendas <= 1500) {
	        comissao = valorVendas * 0.03f;
	    } else {
	        comissao = 1500 * 0.03f + (valorVendas - 1500) * 0.05f;
	    }
	    
	    float totalVendas = salarioFixo + comissao;
	    

	    System.out.printf("O salário total do vendedor é: R$%.2f", totalVendas);
	    
		sc.close();

	}

}
