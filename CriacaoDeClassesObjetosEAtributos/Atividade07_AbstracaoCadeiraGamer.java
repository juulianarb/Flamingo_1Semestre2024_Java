/**
 * 7) Crie dentro de uma Classe a abstração de um cadeira gamer com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade07_AbstracaoCadeiraGamer {

	String marca = "TGT Target";
	String cor = "Preto e Vermelho";
	int pesoDoProduto =	15;
	String estilo = "sólido";
	String encosto = "Reclinável";
	String apoioDeBraco = "Fixo";
	
	public static void main(String[] args) {
		Atividade07_AbstracaoCadeiraGamer cadeiraGamer = new Atividade07_AbstracaoCadeiraGamer();
		System.out.println("Cadeira Gamer: \n");
		System.out.println(" Marca: " + cadeiraGamer.marca + "\n Cor: " + cadeiraGamer.cor + "\n Peso do produto: " + cadeiraGamer.pesoDoProduto + 
				"\n Estilo: " + cadeiraGamer.estilo + "\n Encosto: " + cadeiraGamer.encosto + "\n Apoio de braço: " + cadeiraGamer.apoioDeBraco);

	}

}
