/**
 * 3) Verificar se um número é positivo, negativo ou zero: Implemente um método que receba um número como parâmetro
 *  e retorne uma mensagem indicando se o número é positivo, negativo ou zero.
 */

package tarefa_para_casa12;

public class Atividade03_NumeroPositivo {
	
	static void verificarNumero(int numero) {
		
		if (numero > 0) {
			System.out.println("O número " + numero + ", é positivo");
		} else if (numero < 0) {
			System.out.println("O numero " + numero + ", é negativo");
		} else {
			System.out.println("O número " + numero + ", é zero");
		}
	}

	public static void main(String[] args) {
		
		verificarNumero(0);

	}

}
