/**
 * 2) Crie dentro de uma Classe a abstração de um computador com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade02_AbstracaoComputador {

	String marca = "Genérico";
	String nomeDoModelo = "WS06";
	String cor = "Preto";
	int tamanhoDoDiscoRigido = 0;
	String modeloDaCPU = "AMD Ryzen 5 4600G";
	int memoriaRAM = 16;
	String sistemaOperacional = "Windows 10 Pro";
	String placaDeVideo = "R5 Vegas 7";
	float preco = 2.200f;
	int armazenamento = 32;
	int tela = 0;
	String processador = "AMD";
	int peso = 0;
	String fabricante = "Wolf System";

	public static void main(String[] args) {
		Atividade02_AbstracaoComputador computador1 = new Atividade02_AbstracaoComputador();
		System.out.println("Computador 01: \n");
		System.out.println(" Marca: " + computador1.marca + "\n Nome do modelo: " + computador1.nomeDoModelo
				+ "\n Cor: " + computador1.cor + "\n Modelo da CPU: " + computador1.modeloDaCPU + "\n Memória RAM: "
				+ computador1.memoriaRAM + "GB \n Sistema operacional: " + computador1.sistemaOperacional
				+ "\n Placa de video: " + computador1.placaDeVideo + "\n Preço: " + computador1.preco
				+ "\n Armazenamento: " + computador1.armazenamento + "\n Processador: " + computador1.processador
				+ "\n Fabricante: " + computador1.fabricante);

	}

}
