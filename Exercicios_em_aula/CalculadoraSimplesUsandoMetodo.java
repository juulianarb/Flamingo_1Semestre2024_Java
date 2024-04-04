package exercicios;

import java.util.Scanner;

public class CalculadoraSimplesUsandoMetodo {

	static int soma(int numero1, int numero2) {
		return numero1 + numero2;

	}

	static int subtracao(int numero1, int numero2) {
		return numero1 - numero2;
	}

	static int multiplicacao(int numero1, int numero2) {
		return numero1 * numero2;
	}

	static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "Sim";

		while (resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("s")) {

			System.out.println(
					"Digite um número de 1 a 4 para realizar as operações matemáticas: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - divisão");
			int escolha = sc.nextInt();

			System.out.println("Digite o primeiro número:");
			int valor1 = sc.nextInt();
			System.out.println("Digite o segundo número:");
			int valor2 = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("O resultado da soma dos números " + valor1 + " e " + valor2 + " , é de: "
						+ soma(valor1, valor2));
				break;
			case 2:
				System.out.println("O resultado da subtração dos números " + valor1 + " " + valor2 + " ,é de: "
						+ subtracao(valor1, valor2));
				break;
			case 3:
				System.out.println("O resultado da multiplicação dos números " + valor1 + " " + valor2 + " , é de: "
						+ multiplicacao(valor1, valor2));
				break;
			case 4:
				System.out.println("O resultado da divisão dos números " + valor1 + " " + valor2 + " , é de: "
						+ divisao(valor1, valor2));
				break;
			default:
				System.out.println("Não a número correspondente, escolha um número de 1 a 4");
			}

			System.out.println("Deseja realizar uma nova operação?");
			resposta = sc.next();

		}
		sc.close();

	}

}
