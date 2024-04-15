/**
 * 10) Calcular Média Ponderada: Escreva uma função que calcule a média ponderada de três valores, onde os pesos são passados como argumentos.

 */

package tarefa_para_casa11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade10_CalcularMediaPonderada {

	static float calculoMediaPonderada(float peso1, float peso2, float peso3, float num1, float num2, float num3) {
		
		float somaDosPesos =  peso1 + peso2 + peso3;
		
		return num1 * peso1 + num2 * peso2 + num3 * peso3 / somaDosPesos;
		
		
		

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

		System.out.println("Digite o primeiro valor para calcular a média ponderada:");
		float primeiroNumero = sc.nextFloat();
		
		System.out.println("Digite o valor do peso 1 para calcular a média ponderada:");
		float valorPeso1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor para calcular a média ponderada:");
		float segundoNumero = sc.nextFloat();
		
		System.out.println("Digite o valor do peso 2 para calcular a média ponderada:");
		float valorPeso2 = sc.nextFloat();

		System.out.println("Digite o terceiro valor para calcular a média ponderada:");
		float terceiroNumero = sc.nextFloat();
		
		System.out.println("Digite o valor do peso 3 para calcular a média ponderada:");
		float valorPeso3 = sc.nextFloat();
		
		float resultadoMedia = calculoMediaPonderada(valorPeso1, valorPeso2, valorPeso3, primeiroNumero, segundoNumero, terceiroNumero);
				

		System.out.print("A média ponderada dos valores informados é de: ");
		System.out.println(new DecimalFormat(".##").format(resultadoMedia));
		
		System.out.println("Deseja calcular mais uma média?");
		resposta = sc.next();
		
			}
			
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números...Rode novamente o programa.");
		}

		sc.close();

	}

}
