package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
	
		Data d2 = new Data("27","02","2004");
		
		Data d3 = new Data();
		d3.dia = "03";
		d3.mes = "02";
		d3.ano = "2006";
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}

}
 