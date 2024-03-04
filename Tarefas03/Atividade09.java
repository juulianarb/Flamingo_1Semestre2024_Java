/* 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO). */

package tarefa_para_casa2;

import java.util.Scanner;

public class Atividade09 {
	
	public static void main(String[] args) {
	try {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor da prestação:");
	float valor = sc.nextFloat();
	
	System.out.println("Digite a taxa da prestação:");
	float taxa = sc.nextFloat();
	
	System.out.println("Digite o tempo da prestação:");
	int tempo = sc.nextInt();
	
	float prestacao = valor + (valor * taxa / 100) * tempo;
	
	System.out.println("O valor final da prestação de " + valor + "R$, mais a taxa de "  + taxa + "% ,pelo tempo de " + tempo + " meses, é:" + prestacao + "R$");
			
	sc.close();
	
	} catch (Exception e) {
		System.out.println("Oops, digite apenas números... rode novamente o programa.");
	}
	
	}
}
