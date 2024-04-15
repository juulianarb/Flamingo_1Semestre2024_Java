/**
 * 5) Inverter String: Implemente um método que inverta uma string passada como argumento.

 */

package tarefa_para_casa11;

public class Atividade05_InverterString {
	
	static String invercaoDeString(String umaStringQualquer) {
		
		char[] caracteresdaString = umaStringQualquer.toCharArray();
        int esquerda = 0;
        int direita = caracteresdaString.length - 1;

        while (esquerda < direita) {
            char temporario = caracteresdaString[esquerda];
            caracteresdaString[esquerda] = caracteresdaString[direita];
            caracteresdaString[direita] = temporario;
            esquerda++;
            direita--;
        }

        return new String(caracteresdaString);
		
		
	}

	public static void main(String[] args) {
		
		 String fraseOriginal = "Só coxinha entrando!";
		 
	     String fraseInvertida = invercaoDeString(fraseOriginal);
	     
	     System.out.println("Frase original: " + fraseOriginal);
	        
	     System.out.println("Frase invertida: " + fraseInvertida);

	}

}
