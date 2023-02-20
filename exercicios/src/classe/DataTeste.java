package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = "31";
		d1.mes = "03";
		d1.ano = "2004";
		
		System.out.printf(d1.obterDataFormatada());
	}

}
