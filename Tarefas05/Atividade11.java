/**
 * 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. 
 * Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */

package tarefa_para_casa4;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";

		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s")) {

		
		System.out.println("Informe o número da conta com números inteiros:");
		int numeroConta = sc.nextInt();
		
		System.out.println("Informe o saldo da conta:");
		float saldo = sc.nextFloat();
		
		System.out.println("Informe o débito:");
		float debito = sc.nextFloat();
		
		System.out.println("Informe o crédito:");
		float credito = sc.nextFloat();
		
		float saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("Conta: " + numeroConta + "\n Saldo positivo!");
		} else {
			System.out.println("Conta: " + numeroConta + "\n Saldo negativo.");
		}
		
		System.out.println("Deseja reiniciar o programa?");
		resposta = sc.next();
		
			}
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números... Rode novamente o programa.");
		}
		
		sc.close();

	}

}
