/**
 * 8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
 * e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e
 * terminar no dia seguinte.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

		
		System.out.println("Informe a hora do início, sem os minutos, de um jogo de xadrez:");
		int horasInicio = sc.nextInt();
		
		System.out.println("Informe a hora do fim, sem os minutos, de um jogo de xadrez:");
		int horasFim = sc.nextInt();
		
		int duracaoTotal = horasInicio + horasFim;
		
		if (duracaoTotal >= 24) {
			System.out.println("O jogo de xadrez, atingiu 24 horas e termina no dia seguinte");
		} else {
			System.out.println("A duração da partida de xadrez é de: " + duracaoTotal + " horas");
		}
		
		System.out.println("Deseja reiniciar o programa?");
		resposta = sc.next();
			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode novamente o programa.");
		}
		
		sc.close();
		
		

	}

}
