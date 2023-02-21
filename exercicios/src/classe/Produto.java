package classe;

public class Produto {
	
	//Atributos da minha class
	String name;
	double price;
	double discount;
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		name = nomeInicial;
		price = precoInicial;
		discount = descontoInicial;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		double desconto = price * (1 - discount);
		return desconto;
		
	}
	
}
