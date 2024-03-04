/* 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura */ 

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio, para saber o volume da lata de óleo:");
		float raio = sc.nextFloat();
		
		System.out.println("Digite a altura, para saber o volume da lata de óleo:");
		float altura = sc.nextFloat();
		
		double volume = Math.PI * Math.pow(raio, 2)* altura;
		
		System.out.println("O valor do volume da lata de óleo é de "+ volume);
		
		sc.close();
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números... rode novamente o programa.");
		}
	}
}
