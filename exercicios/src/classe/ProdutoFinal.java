package classe;

import java.util.Locale;

public class ProdutoFinal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto();
		p1.name = "Pulseira do Flamengo";
		p1.price = 100.00;
		p1.discount = 0.15;
		
		Produto p2 = new Produto();
		p2.name = "Rélogio";
		p2.price = 50.00;
		p2.discount = 0.20;
		
		double precoFinal1 = p1.price * (1- p1.discount);
		double precoFinal2 = p2.price * (1 - p2.discount);
		
		double mediaFinal = (precoFinal1 + precoFinal2) / 2;
		System.out.printf(" A média dos produtos comprados foi: %.2f", mediaFinal);
		

	}

}
