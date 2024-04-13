/*
*início

ler x

ler y

z <- (x*y) + 5

se z <= 0 então

resposta <- ‘A’

senão

se z <= 100 então

resposta <- ‘B’

senão

resposta <- ‘C’

fim_se

fim_se

escrever z, resposta

fim
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro para ser o valor de x:");
		int x = sc.nextInt();
		
		System.out.println("Informe um número inteiro para ser o valor de y:");
		int y = sc.nextInt();
		
		int z = (x * y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if (z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		sc.close();
	}

}
