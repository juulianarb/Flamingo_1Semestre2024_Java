/**
 * 15) Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições,
 *  um dos seguintes requisitos deve ser satisfeito:

- Ter no mínimo 65 anos de idade.

- Ter trabalhado no mínimo 30 anos.

- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código),
 o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado 
 e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 */

package tarefa_para_casa6;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o número do código do empregado:");
			int codigoEmpregado = sc.nextInt();

			System.out.println("Informe o ano de seu nascimento:");
			int anoNascimento = sc.nextInt();

			System.out.println("Informe o ano que ingressou na empresa:");
			int anoIngressoEmpresa = sc.nextInt();

			int idade = 2024 - anoNascimento;
			int tempoDeTrabalho = 2024 - anoIngressoEmpresa;

			if (idade >= 65 || tempoDeTrabalho >= 30 || (idade >= 60 && tempoDeTrabalho >= 25)) {
				System.out.println("O funcionário de código: " + codigoEmpregado);
				System.out.println("Idade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoDeTrabalho);
				System.out.println("Requerer aposentadoria");
			} else {
				System.out.println("O funcionário de código: " + codigoEmpregado);
				System.out.println("Idade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoDeTrabalho);
				System.out.println("Não requerer aposentadoria");
			}

			System.out.println("Deseja consultar mais um funcionário?");
			resposta = sc.next();

		}
		
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros...Rode novamente o programa.");
		}

		sc.close();

	}

}
