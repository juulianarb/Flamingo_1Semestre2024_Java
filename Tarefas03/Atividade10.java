/* 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A 
 * passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
 *  Apresentar os valores trocados. */ 

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
	    String valorA = sc.nextLine();

	    System.out.println("Digite o valor de B: ");
	    String valorB = sc.nextLine();

	    
	    String tempA = valorA;
	    valorA = valorB;
	    valorB = tempA;

	    System.out.println("Valor de A após a troca: " + valorA);
	    System.out.println("Valor de B após a troca: " + valorB);
		
		sc.close();
	}
}
