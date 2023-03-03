package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		// verificar se o valor nao via ser nulo
		// adicionando o peso do alimento à pessoa
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá meu nome é " + nome + " e tenho " + peso + " kilos.";
	}
}
