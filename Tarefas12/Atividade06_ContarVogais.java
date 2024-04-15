/**
 * 6) Contar Vogais: Escreva uma função que conte o número de vogais em uma string
.
 */

package tarefa_para_casa11;

public class Atividade06_ContarVogais {
	
	static int contadorDeVogais(String umaStringQualquer) {
		int contador = 0;
		
		for (int i = 0; i < umaStringQualquer.length(); i++) {
			 char caractere = Character.toLowerCase(umaStringQualquer.charAt(i));
			 if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
				contador++;
			}
		}
		
		return contador;
	}

	public static void main(String[] args) {

		String palavra = "Jailson me da um 10";
		
		int contarVogais = contadorDeVogais(palavra);
		
		System.out.println("O número de vogais é de: " + contarVogais);
	}

}
