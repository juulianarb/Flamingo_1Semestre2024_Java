/**
 * 3) Verificar Palíndromo: Desenvolva um método que receba uma string como entrada e retorne verdadeiro se ela for um palíndromo 
 * (ou seja, se ela pode ser lida da mesma forma de trás para frente), e falso caso contrário.
 */

package tarefa_para_casa11;

public class Atividade03_VerificarPalindromo {

	static boolean verificarPalindromo(String letras) {
		letras = letras.replaceAll("\\s", "").toLowerCase(); // removendo caracteres indesejados :)

		int esquerda = 0;
		int direita = letras.length() - 1; // Vai contar a posição de cada caractere -1

		while (esquerda < direita) {
			if (letras.charAt(esquerda) != letras.charAt(direita)) { // Charat retorna o caractere em uma localização específica em uma String
				return false;
			}

			esquerda++;
			direita--;
			
		} 
		
		return true;
	}

	public static void main(String[] args) {

		String palavra = "Roma é amor";
		
		if (verificarPalindromo(palavra)) {
            System.out.println("A frase " + palavra + ", é um palíndromo");
        } else {
            System.out.println("A frase " + palavra +  "Não é um palíndromo");
        }
	}

}
