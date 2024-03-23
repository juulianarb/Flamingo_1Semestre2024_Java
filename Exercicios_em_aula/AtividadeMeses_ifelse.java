/* Proposta do exercício: Escrever um código que leia números inteiros de 1 a 12, correspondente aos meses do ano, utilizando if, else if e else*/


package exercicios;

import java.util.Scanner;

public class AtividadeMeses_ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite um número de 1 a 12, correspondente aos meses do ano:");
			int mesesDoAno = sc.nextInt();
			
			if (mesesDoAno == 1) {
				System.out.println("Janeiro");
			} else if (mesesDoAno == 2) {
				System.out.println("Fevereiro");
			} else if (mesesDoAno == 3) {
				System.out.println("Março");
			} else if (mesesDoAno == 4) {
				System.out.println("Abril");
			} else if (mesesDoAno == 5) {
				System.out.println("Maio");
			} else if (mesesDoAno == 6) {
				System.out.println("Junho");
			} else if (mesesDoAno == 7) {
				System.out.println("Julho");
			} else if(mesesDoAno == 8) {
				System.out.println("Agosto");
			} else if (mesesDoAno == 9) {
				System.out.println("Setembro");
			} else if (mesesDoAno == 10) {
				System.out.println("Outubro");
			} else if (mesesDoAno == 11) {
				System.out.println("Novembro");
			} else if (mesesDoAno == 12) {
				System.out.println("Dezembro");
				} else {
					System.out.println("Este número não corresponde aos meses do ano, digite um número de 1 á 12:");
				}
			} catch (Exception e) {
				System.out.println("O objetivo do programa é apenas com números inteiros. Rode novamente o programa");
			}
		
		sc.close();
	}

}
