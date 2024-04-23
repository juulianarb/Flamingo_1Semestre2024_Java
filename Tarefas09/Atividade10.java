/**
 * 10) Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético DIV.
A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve apresentar como resultado (quociente)
quantas vezes o divisor cabe no dividendo.
 */

package tarefa_para_casa8;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o número do dividendo: ");
	        int solicitandoDividendo = sc.nextInt();

	        System.out.print("Digite o número do divisor: ");
	        int solicitandoDivisor = sc.nextInt();

	        int resultadoQuociente = 0;
	        
	        int resto = solicitandoDividendo;

	        while (resto >= solicitandoDivisor) {
	            resto = resto - solicitandoDivisor;
	            resultadoQuociente++;
	        }

	        System.out.println("Resultado da divisão: " + resultadoQuociente);
	        
	        sc.close();
	    }
	
	}

