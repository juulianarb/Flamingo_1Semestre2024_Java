/**
 * ﻿5) Crie dentro de uma Classe a abstração de uma bicicleta com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade05_AbstracaoBicicleta {
	
	String tipoDeBicicleta = "Bicicleta de uso múltiplo";
	String marca = "ULTRA BIKE";
	int numeroDeVelocidades = 18;
	String cor = "Preto";
	int tamanhoDaRoda = 26;
	String estilo = "Urbano";
	String suspensao = "Rígida";
	String material = "Aço Carbono";
	String tipoDeFreios = "V-Brake";
	String certificacao = "INMETRO";

	public static void main(String[] args) {
		Atividade05_AbstracaoBicicleta bicicleta01 = new Atividade05_AbstracaoBicicleta();
		System.out.println("Bicicleta 01: \n");
		System.out.println(" Tipo de Bicicleta: " + bicicleta01.tipoDeBicicleta + "\n Marca: " + bicicleta01.marca + "\n Numero de velocidades: " + 
		bicicleta01.numeroDeVelocidades + "\n Cor: " + bicicleta01.cor + "\n Tamanho da roda: " + bicicleta01.tamanhoDaRoda + "\n Estilo: " + bicicleta01.estilo + 
		"\n Estilo: " + bicicleta01.estilo + "\n Suspensão: " + bicicleta01.suspensao + "\n Material: " + bicicleta01.material + "\n Tipo de freio: " + bicicleta01.tipoDeFreios + 
		"\n Certificação: " + bicicleta01.certificacao);

	}

}
