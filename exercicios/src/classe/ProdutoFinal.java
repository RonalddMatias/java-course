package classe;

import java.util.Locale;

public class ProdutoFinal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Com esse contrutor explicito, você pode instanciar a classe ja com um dos atributos definidos;
		Produto p1 = new Produto("Pulseira",100.00,0.15);
		//p1.name = "Pulseira do Flamengo";
		//p1.price = 100.00;
		//p1.discount = 0.15;
		
		Produto p2 = new Produto();
		p2.name = "Rélogio";
		p2.price = 50.00;
		p2.discount = 0.20;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		double mediaFinal = (precoFinal1 + precoFinal2) / 2;
		System.out.printf(" A média dos produtos comprados foi: %.2f", mediaFinal);


	}

}
