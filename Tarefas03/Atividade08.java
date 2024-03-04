/* 8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
 * Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem.
 * Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância,
 * basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12.
 * Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), 
 * a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.*/

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto na viagem, para calcular a distância:");
		int tempo = sc.nextInt();
		
		System.out.println("Digite a velocidade média durante a viagem:");
		int velocidade = sc.nextInt();
		
		int distancia = tempo * velocidade;
		
		float litros_gastos = distancia / 12;
		
		System.out.println("Velocidade média durante a viagem: "+ velocidade + ", Tempo gasto na viagem: "+ tempo + " horas" + ", Distância percorrida: "+ distancia + "Km" + ", Quantidade de litros usados: "+ litros_gastos);
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números inteiros... rode novamente o programa.");
		}
	}
}
