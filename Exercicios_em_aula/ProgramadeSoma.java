package exercicios;

import java.util.Scanner;

public class ProgramadeSoma {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número para somar:");
		float valor = sc.nextFloat();
		
		System.out.println("Digite o segundo número para somar:");
	    float valor2 = sc.nextFloat();
		
		float resultado = valor + valor2;
		
		System.out.println("A soma dos valores é: "+resultado);
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}
}
