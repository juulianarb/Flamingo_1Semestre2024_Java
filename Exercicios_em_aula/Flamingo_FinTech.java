package exercicios;

import java.util.Scanner;

public class Flamingo_FinTech {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Flamingo Fintech");
		System.out.println();
		System.out.println("Seja bem vindo á Flamingo Fintech");
		System.out.println();
		System.out.println();
		System.out.println("Para acessar a Flamingo Fintech. insira seu usuário e senha válidos:");
		System.out.println("Digite seu usuário:");

		String usuario = sc.next().toLowerCase();

		System.out.println("Digite sua senha");

		String senha = sc.next();

		if (usuario.equals("Juliana") && (senha.equals("ju123"))) {
			System.out.println("Usuário logado com suceso");
			System.out.println("Seja bem vindo" + "" + ": " + usuario);

		} else {
			System.out.println("Usuário/senha inválidos, Digite o usuário e senha corretamente.");
		}

		sc.close();

	}

}
