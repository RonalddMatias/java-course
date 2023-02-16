package exercicios;

public class Continue {
	public static void main(String[] args) {
	// o continue não para o laço, ele apenas pula para a proxima repetição.
	
	for(int i = 0; i< 10; i++) {
		if(i % 2 == 1) {
			continue;
		}
		System.out.println(i);
	}
}
}