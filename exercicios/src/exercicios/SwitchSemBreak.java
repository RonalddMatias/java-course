package exercicios;

public class SwitchSemBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String faixa = "roxa";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Bato de frente com Karv Maga.");
		case "marrom":
			System.out.println("sei o tekki");
		case "roxa":
			System.out.println("sei o hean");
		case "verde":
			System.out.println("sei o dew");
		case "laranja":
			System.out.println("sei dar um mata leão");
		case "vemelha":
			System.out.println("sei dar um mortal para trás");
		case "amarela":
			System.out.println("sei pula");
		default:
			System.out.println("nao sei de nada"); // padrao caso a str seja vazia
		}
	}

}
