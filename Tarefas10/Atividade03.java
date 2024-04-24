/**
 * 3) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
 */

package tarefa_para_casa9;

public class Atividade03 {

	public static void main(String[] args) {

		int somaDosCem = 0;

		for (int i = 1; i <= 100; i++) {
			somaDosCem += i;
		}

		System.out.println("A soma dos 100 primeiros numeros inteiros é de: " + somaDosCem);

	}

}
