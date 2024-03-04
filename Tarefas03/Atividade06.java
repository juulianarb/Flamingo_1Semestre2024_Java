/* 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
 *  A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade06 {
	
	public static void main(String[] args) {
		try {
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em fahrenheit, para converter em celsius:");
		float fahrenheit = sc.nextFloat();
		
		float celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("A temperatura " + fahrenheit + "ºF " + ",convertida para celsius é de: "+ celsius + "ºC");
		
		sc.close();
		
		} catch (Exception e) {
			System.out.println("Oops, digite apenas números... rode novamente o programa.");
		}
	}
		
	}