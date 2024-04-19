/**
 * 8) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, 
 * iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
 *  O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9*C +160) /5,
 *   sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package tarefa_para_casa7;

public class Atividade08 {

	public static void main(String[] args) {
		
		for (int grausCelsius = 10; grausCelsius <= 100; grausCelsius += 10) {
            int formulaFahrenheit = (9 * grausCelsius + 160) / 5;
            System.out.println(grausCelsius + "º Celsius equivalem a " + formulaFahrenheit + "º Fahrenheit");
        }

	}

}
