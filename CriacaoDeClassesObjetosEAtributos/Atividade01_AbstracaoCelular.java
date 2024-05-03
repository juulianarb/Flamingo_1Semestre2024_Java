/**
 * ﻿1) Crie dentro de uma Classe a abstração de um celular com todos os seus atributos e exiba os seus atributos.
 */

package criacaoDeClassesObjetosEAtributos;

public class Atividade01_AbstracaoCelular {
	
	String marca = "Xiaomi";
	String nomeDoModelo = "Redmi 12 4G LTE";
	String sistemaOperacional = "Android";
	String fabricante = "Xiaomi";
	int ano = 2023;
	int memoriaRAM = 8;
	int armazenamento = 256;
	String tipoDeProduto = "Smartphone";
	int peso = 198;
	String cor = "Preto";
	

	public static void main(String[] args) {
		
		Atividade01_AbstracaoCelular celular1 = new Atividade01_AbstracaoCelular();
		System.out.println("Celular 01: ");
		System.out.println(" Marca: " + celular1.marca + "\n Nome do modelo: " + celular1.nomeDoModelo + "\n Sistema operacional: " + celular1.sistemaOperacional
				+ "\n Fabricante: " + celular1.fabricante + "\n Ano: " + celular1.ano + "\n Memória RAM: " + celular1.memoriaRAM + " GB \n Armazenamento: " + celular1.armazenamento
				+ "GB \n Tipo de produto: " + celular1.tipoDeProduto + "\n Peso: " + celular1.peso + "g \n Cor: " + celular1.cor);

	}

}
