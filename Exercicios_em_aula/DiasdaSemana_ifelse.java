/* Proposta do exercício: Escrever um código que leia números inteiros de 1 a 7, correspondente aos dias da semana, utilizando if, else if e else*/

package exercicios;

import java.util.Scanner
;
public class DiasdaSemana_ifelse {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7, correspondente aos dias da semana:");
		int diasDaSemana = sc.nextInt();
		
		if (diasDaSemana == 1) {
			System.out.println("Domingo");
		} else if (diasDaSemana == 2) {
			System.out.println("Segunda-feira");
		} else if (diasDaSemana == 3) {
			System.out.println("Terça-feira");
		} else if (diasDaSemana == 4) {
			System.out.println("Quarta-feira");
		} else if (diasDaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diasDaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diasDaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Este número não corresponde aos dias da semana, digite um número de 1 a 7");
		}
		sc.close();
		} catch (Exception e) {
			System.out.println("O objetivo do programa é apenas com números inteiros. Rode novamente o programa");
		}

	}

}
