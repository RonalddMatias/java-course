package classe;

public class Produto {
	
	//Atributos da minha class
	String name;
	double price;
	static double discount = 0.25;
	
	Produto(String nomeInicial, double precoInicial){
		name = nomeInicial;
		price = precoInicial;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		double desconto = price * (1 - discount);
		return desconto;
		
	}
	
}
