/**
 * 6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.

 */

package tarefa_para_casa5;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		int valorA = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro:");
		int valorB = sc.nextInt();
		
		System.out.println("Digite o terceiro número inteiro:");
		int valorC = sc.nextInt();
		
		
		 int guardaValor;
		 
	        if (valorA > valorB) {
	            guardaValor = valorA;
	            valorA = valorB;
	            valorB = guardaValor;
	        }
	        if (valorB > valorC) {
	            guardaValor = valorB;
	            valorB = valorC;
	            valorC = guardaValor;
	        }
	        if (valorA > valorB) {
	            guardaValor = valorA;
	            valorA = valorB;
	            valorB = guardaValor;
	        }
	        
	        System.out.println("Valores em ordem crescente: " + valorA + ", " + valorB + ", " + valorC);
		
		
		sc.close();

	}

}
