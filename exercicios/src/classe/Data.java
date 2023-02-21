package classe;

public class Data {
	String dia;
	String mes;
	String ano;
	
	// Constutor com parâmetros para ser instânciado
	Data(String diaInicial, String mesInicial, String anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	//Construtor padrão com os atributos já instânciados
	Data(){
		dia = "01";
		mes = "01";
		ano = "1970";
	}

	
	String obterDataFormatada() {
		
		return String.format("%s/%s/%s", dia, mes, ano);
				
	}
	
	// um método utilizando outro
	// quando no método ter apenas o print, é necessário que o tipo seja "void";
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());
	}
}
