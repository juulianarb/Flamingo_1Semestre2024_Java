/**
 * 3) Crie em uma Classe externa com a abstração de um celular com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade03_AbstracaoClasseExternaCelular {

	String marca;
	String nomeDoModelo;
	String sistemaOperacional;
	String fabricante;
	int ano;
	int memoriaRAM;
	int armazenamento;
	String tipoDeProduto;
	int peso;
	String cor;

	public Atividade03_AbstracaoClasseExternaCelular(String marcaCelular, String nomeDoModeloCelular,
			String sistemaOperacionalCelular, String fabricanteCelular, int anoCelular, int memoriaRAMCelular,
			int armazenamentoCelular, String tipoDeProdutoCelular, int pesoCelular, String corCelular) {

		marca = marcaCelular;
		nomeDoModelo = nomeDoModeloCelular;
		sistemaOperacional = sistemaOperacionalCelular;
		fabricante = fabricanteCelular;
		ano = anoCelular;
		memoriaRAM = memoriaRAMCelular;
		armazenamento = armazenamentoCelular;
		tipoDeProduto = tipoDeProdutoCelular;
		peso = pesoCelular;
		cor = corCelular;

	}

	class InformacoesCelular {
		public static void main(String[] args) {

			Atividade03_AbstracaoClasseExternaCelular celular1 = new Atividade03_AbstracaoClasseExternaCelular("Xiaomi",
					"Redmi 12 4G LTE", "Android", "Xiaomi", 2023, 8, 256, "Smartphone", 198, "Preto");
			System.out.println("Celular 01: ");
			System.out.println(" Marca: " + celular1.marca + "\n Nome do modelo: " + celular1.nomeDoModelo
					+ "\n Sistema operacional: " + celular1.sistemaOperacional + "\n Fabricante: " + celular1.fabricante
					+ "\n Ano: " + celular1.ano + "\n Memória RAM: " + celular1.memoriaRAM + " GB \n Armazenamento: "
					+ celular1.armazenamento + "GB \n Tipo de produto: " + celular1.tipoDeProduto + "\n Peso: "
					+ celular1.peso + "g \n Cor: " + celular1.cor);

		}
	}
}
