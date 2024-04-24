/**
 * 2) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
 */

package tarefa_para_casa9;

public class Atividade02 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i + " : ");
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (j*i));
			}
			
			System.out.println("----||------||------||----");
		}

	}

}
