package classe;

public class Produto {
	
	//Atributos da minha class
	String name;
	double price;
	double discount;
	
	double precoComDesconto() {
		double desconto = price * (1 - discount);
		return desconto;
	}
	
}
