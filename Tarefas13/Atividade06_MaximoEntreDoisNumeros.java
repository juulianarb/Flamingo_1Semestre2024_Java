/**
 * 6) Calcular o máximo entre dois números: Implemente uma função que receba dois números como parâmetros e retorne o maior deles.
 */

package tarefa_para_casa12;


public class Atividade06_MaximoEntreDoisNumeros {
	
	static int calcularOMaximo(int num1, int num2) {
		
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("O maior número entre os valores informados é: " + calcularOMaximo(20, 25));
	
	}

}
