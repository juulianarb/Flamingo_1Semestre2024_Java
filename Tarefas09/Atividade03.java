/**
 * 3) Apresentar todos os números divisíveis por 4 que sejam menores que 200.
 *  Para verificar se o número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a instrução se, 
 *  perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o próximo passo.
 *   A variável que controlará o contador deve ser iniciada com o valor 1.
 */

package tarefa_para_casa8;

public class Atividade03 {

	public static void main(String[] args) {
		
		System.out.print("Numeros divisíveis por 4 na faixa de 1 a 200: ");
	
		for (int i = 1; i <= 200; i++) {
			
			if (i % 4 == 0) {
				System.out.print(" " + i);
			}
		}

	}

}
