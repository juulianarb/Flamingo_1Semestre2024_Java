/**
 * 1) Apresentar os quadrados dos números inteiros de 15 a 200.
 */

package tarefa_para_casa8;

public class Atividade01 {

	public static void main(String[] args) {
		
		for (int i = 15; i <= 200; i++) {
			int quadradoDoNumero = i * i;
			System.out.println("O quadrado de " + i + " é de: " + quadradoDoNumero);
		}

	}

}
