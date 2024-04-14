/**
 * 9) Calcular a área de um retângulo: Desenvolva um método que receba a base e a altura de um retângulo como parâmetros 
 * e retorne a área desse retângulo.
 */

package tarefa_para_casa12;

public class Atividade09_Retangulo {
	
	static int calcularAreaRetangulo(int base, int altura) {
		return base * altura;
		
	}

	public static void main(String[] args) {
		
		System.out.println("A área do retângulo é: " + calcularAreaRetangulo(24, 16) + " mt²");
		

	}

}
