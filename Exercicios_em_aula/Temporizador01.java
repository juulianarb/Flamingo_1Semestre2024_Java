package exercicios;

import java.util.Scanner;

public class Temporizador01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os minutos do temporizador:");
		int minutos = sc.nextInt();
		
		System.out.println("Digite os segundos do temporizador:");
		int segundos = sc.nextInt();
		
		for (int guardarminutos = minutos; guardarminutos > 0; guardarminutos--) {

			for (int guardarsegundos = segundos; guardarsegundos > 0; guardarsegundos--) {

				System.out.println(guardarminutos + " : " + guardarsegundos);
			}

		}
		
		
		sc.close();

	}

}
