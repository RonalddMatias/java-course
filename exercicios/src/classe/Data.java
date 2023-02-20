package classe;

public class Data {
	String dia;
	String mes;
	String ano;
	
	String obterDataFormatada() {
		
		return String.format("%s/%s/%s", dia, mes, ano);
				
	}
	
	// um método utilizando outro
	// quando no método ter apenas o print, é necessário que o tipo seja "void";
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	}
}
