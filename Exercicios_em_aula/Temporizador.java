package exercicios;

public class Temporizador {

	public static void main(String[] args) {

		for (int minutos = 59; minutos > 0; minutos--) {

			for (int segundos = 59; segundos > 0; segundos--) {

				System.out.println(minutos + " : " + segundos);
			}

		}

	}

}
