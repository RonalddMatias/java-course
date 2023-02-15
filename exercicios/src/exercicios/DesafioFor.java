package exercicios;

public class DesafioFor {

	public static void main(String[] args) {
		// Intuito do desafio era cirar um for, mas a estrutura de controle não poderia ser guiada por um numero.
		String valor = "#";
		
		for(String v = "#"; !v.equals("######"); v += "#") { // enquanto "v" não for "#####" a concatenação vai acontecer
			System.out.println(v);
		}
		
	}

}
