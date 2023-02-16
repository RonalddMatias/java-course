package exercicios;

public class Break {
	public static void main(String[] args) {
		// O break "quebra" o laço.
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
	}
}
