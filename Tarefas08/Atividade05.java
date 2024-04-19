/**
 * 5) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15.
 *  Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. 
 *  Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
 */

package tarefa_para_casa7;

public class Atividade05 {

	public static void main(String[] args) {

		int base = 3;
		int resultado = 0;

		for (int i = 0; i <= 15; i++) {
			
			if (i == 0) {
				resultado = 1;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i + " é igual a : " + resultado);
			} else if (i == 1) {
				resultado = base;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i + " é igual a : " + resultado);
			} else {
				resultado *= base;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i + " é igual a : " + resultado);
			}
			}
		}
	}

