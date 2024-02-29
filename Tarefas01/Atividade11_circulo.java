//Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²

package tarefa_para_casa1;

import java.util.Scanner;

public class Atividade11_circulo {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio, para calcular a área do círculo:");
		float raio = sc.nextFloat();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: "+area);
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops... Digite apenas números.");
		} finally {
			System.out.println("Rode o programa novamente, jovem gafanhoto.");
		}
	}

}
