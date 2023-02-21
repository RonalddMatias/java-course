package classe;

public class AreaCirTeste {

	public static void main(String[] args) {
		AreaCir a1 = new AreaCir(10);
		// a1.pi = 0;
		
		
		
		AreaCir a2 = new AreaCir(5);
		// a2.pi = 5;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCir.PI);
		
		//
		System.out.println(AreaCir.area(700.00));
	}

}
