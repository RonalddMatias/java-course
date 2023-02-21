package classe;

public class AreaCir {
	double raio; // pertence a instância;
	static final double PI = 3.14; // pertence a classe;
	
	AreaCir(double raioIncial){
		raio = raioIncial;
	}
	
	double area() {
		return raio * raio * PI;
	}
	
	static double area(double raio) {
		return raio * raio * PI;
	}
}
