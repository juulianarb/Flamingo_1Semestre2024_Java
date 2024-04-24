/**
 * 5) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20.
 *  Para verificar se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se,
 *   perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.
 */

package tarefa_para_casa9;

public class Atividade05 {

	public static void main(String[] args) {

		System.out.println("Números impares na faixa de 1 a 20:");

		for (int i = 0; i <= 20; i++) {

			if (i % 2 == 1) {
				System.out.print(" " + i);
			}
		}

	}

}
