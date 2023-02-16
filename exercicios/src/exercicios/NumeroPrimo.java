package exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt(); 
		
		int ehPrimo = 0;
		for(int i = 1; i <= numero;i++) {

			if (numero % i == 0) { // Verificando quantos números terá divisão exata
				ehPrimo += 1; 
			}
		}
		
		if(ehPrimo > 2) {
			System.out.printf("%d não é primo.", numero);
		} else {
			System.out.printf("%d é primo.",numero);
		}
		
		sc.close();

	}

}
