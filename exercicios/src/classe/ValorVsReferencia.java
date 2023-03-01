package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data("01", "03","2022");
		Data d2 = d1; // atribuição por referência 
		
		d1.dia = "27";
		d2.ano = "2004";
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
