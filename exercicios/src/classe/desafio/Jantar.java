package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("pão", 0.50);
		Comida c2 = new Comida("Arroz", 0.150);
		
		Pessoa p = new Pessoa("fabio", 75.3);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}
