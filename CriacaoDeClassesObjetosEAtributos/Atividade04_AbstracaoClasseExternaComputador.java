/**
 * 4) Crie em uma Classe externa com a abstração de um computador com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade04_AbstracaoClasseExternaComputador {

	String marca;
	String nomeDoModelo;
	String cor;
	int tamanhoDoDiscoRigido;
	String modeloDaCPU;
	int memoriaRAM;
	String sistemaOperacional;
	String placaDeVideo;
	float preco;
	int armazenamento;
	int tela;
	String processador;
	int peso;
	String fabricante;

	public Atividade04_AbstracaoClasseExternaComputador(String marcaComputador, String nomeDoModeloComputador,
			String corComputador, int tamanhoDoDiscoRigidoComputador, String modeloDaCPUComputador,
			int memoriaRAMComputador, String sistemaOperacionalComputador, String placaDeVideoComputador,
			float precoComputador, int armazenamentoComputador, int telaComputador, String processadorComputador,
			int pesoComputador, String fabricanteComputador) {

		marca = marcaComputador;
		nomeDoModelo = nomeDoModeloComputador;
		cor = corComputador;
		tamanhoDoDiscoRigido = tamanhoDoDiscoRigidoComputador;
		modeloDaCPU = modeloDaCPUComputador;
		memoriaRAM = memoriaRAMComputador;
		sistemaOperacional = sistemaOperacionalComputador;
		placaDeVideo = placaDeVideoComputador;
		preco = precoComputador;
		armazenamento = armazenamentoComputador;
		tela = telaComputador;
		processador = processadorComputador;
		peso = pesoComputador;
		fabricante = fabricanteComputador;

	}

	class InformacoesComputador {
		
		public static void main(String[] args) {
			Atividade04_AbstracaoClasseExternaComputador computador1 = new Atividade04_AbstracaoClasseExternaComputador(
					"Genérico", "WS06", "Preto", 0, "AMD Ryzen 5 4600G", 16, "Windows 10 Pro", "R5 Vegas 7", 2.200f, 32,
					0, "AMD", 0, "Wolf System");
			System.out.println("Computador 01: \n");
			System.out.println(" Marca: " + computador1.marca + "\n Nome do modelo: " + computador1.nomeDoModelo
					+ "\n Cor: " + computador1.cor + "\n Modelo da CPU: " + computador1.modeloDaCPU + "\n Memória RAM: "
					+ computador1.memoriaRAM + "GB \n Sistema operacional: " + computador1.sistemaOperacional
					+ "\n Placa de video: " + computador1.placaDeVideo + "\n Preço: " + computador1.preco
					+ "\n Armazenamento: " + computador1.armazenamento + "\n Processador: " + computador1.processador
					+ "\n Fabricante: " + computador1.fabricante);

		}

	}
}
