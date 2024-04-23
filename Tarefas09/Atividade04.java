/**
 * 4) Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de trigo que se pode obter num tabuleiro
 *  de xadrez, obedecendo à seguinte regra: colocar um grão de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. 
 *  Ou seja, no primeiro quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos), 
 *  no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8 grãos (tendo-se então 15 grãos) 
 *  até atingir o sexagésimo quarto (64o) quadro. Utilize variáveis do tipo real como acumuladores.
 */

package tarefa_para_casa8;

public class Atividade04 {

	public static void main(String[] args) {
		
		float somatorioDegraos = 0;
        float graosNoPrimeiroQuadro = 1;

        for (int i = 1; i <= 64; i++) {
            somatorioDegraos += graosNoPrimeiroQuadro;
            graosNoPrimeiroQuadro *= 2;
        }

        System.out.println("O total de grãos de trigo no tabuleiro de xadrez é: " + somatorioDegraos);
    }

	}

