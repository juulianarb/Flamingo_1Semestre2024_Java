/**
 * 8) Crie em uma Classe externa com a abstração de uma cadeira gamer com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade08_AbstracaoClasseExternaCadeiraGamer {

	String marca;
	String cor;
	int pesoDoProduto;
	String estilo;
	String encosto;
	String apoioDeBraco;

	public Atividade08_AbstracaoClasseExternaCadeiraGamer(String marcaC, String corC, int pesoDoProdutoC,
			String estiloC, String encostoC, String apoioDeBracoC) {

		marca = marcaC;
		cor = corC;
		pesoDoProduto = pesoDoProdutoC;
		estilo = estiloC;
		encosto = encostoC;
		apoioDeBraco = apoioDeBracoC;

	}

}

class InformacoesCadeiraGamer {

	public static void main(String[] args) {

		Atividade08_AbstracaoClasseExternaCadeiraGamer cadeiraGamer = new Atividade08_AbstracaoClasseExternaCadeiraGamer(
				"TGT Target", "Preto e Vermelho", 15, "sólido", "Reclinável", "Fixo");

		System.out.println("Cadeira Gamer: \n");
		System.out.println(" Marca: " + cadeiraGamer.marca + "\n Cor: " + cadeiraGamer.cor + "\n Peso do produto: "
				+ cadeiraGamer.pesoDoProduto + "\n Estilo: " + cadeiraGamer.estilo + "\n Encosto: "
				+ cadeiraGamer.encosto + "\n Apoio de braço: " + cadeiraGamer.apoioDeBraco);
	}
}
