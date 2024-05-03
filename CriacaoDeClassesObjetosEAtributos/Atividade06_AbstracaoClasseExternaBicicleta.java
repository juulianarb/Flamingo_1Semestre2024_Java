/**
 * 6) Crie em uma Classe externa com a abstração de um bicicleta com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade06_AbstracaoClasseExternaBicicleta {

	String tipoDeBicicleta;
	String marca;
	int numeroDeVelocidades;
	String cor;
	int tamanhoDaRoda;
	String estilo;
	String suspensao;
	String material;
	String tipoDeFreios;
	String certificacao;

	public Atividade06_AbstracaoClasseExternaBicicleta(String tipoDeBicicletaC, String marcaC, int numeroDeVelocidadesC,
			String corC, int tamanhoDaRodaC, String estiloC, String suspensaoC, String materialC, String tipoDeFreiosC,
			String certificacaoC) /* C de construtor */ {

		tipoDeBicicleta = tipoDeBicicletaC;
		marca = marcaC;
		numeroDeVelocidades = numeroDeVelocidadesC;
		cor = corC;
		tamanhoDaRoda = tamanhoDaRodaC;
		estilo = estiloC;
		suspensao = suspensaoC;
		material = materialC;
		tipoDeFreios = tipoDeFreiosC;
		certificacao = certificacaoC;
	}
}

class InformacoesBicicleta {

	public static void main(String[] args) {
		Atividade06_AbstracaoClasseExternaBicicleta bicicleta01 = new Atividade06_AbstracaoClasseExternaBicicleta(
				"Bicicleta de uso múltiplo", "ULTRA BIKE", 18, "Preto", 26, "Urbano", "Rígida", "Aço Carbono",
				"V-Brake", "INMETRO");
		System.out.println("Bicicleta 01: \n");
		System.out.println(" Tipo de Bicicleta: " + bicicleta01.tipoDeBicicleta + "\n Marca: " + bicicleta01.marca
				+ "\n Numero de velocidades: " + bicicleta01.numeroDeVelocidades + "\n Cor: " + bicicleta01.cor
				+ "\n Tamanho da roda: " + bicicleta01.tamanhoDaRoda + "\n Estilo: " + bicicleta01.estilo
				+ "\n Estilo: " + bicicleta01.estilo + "\n Suspensão: " + bicicleta01.suspensao + "\n Material: "
				+ bicicleta01.material + "\n Tipo de freio: " + bicicleta01.tipoDeFreios + "\n Certificação: "
				+ bicicleta01.certificacao);

	}
}