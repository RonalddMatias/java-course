package exercicios;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if(num > 0 && num <= 10) {
			System.out.printf("o numero %d está entre 0-10\n", num);
			if(num % 2 == 0) {
				System.out.printf("O número %d é par.", num);
			} else {
				System.out.printf("O número %d é impar.", num);
			}
		} else {
			System.out.printf("O número %d não está entre 0-10", num);
		}
		
		sc.close();
		

	}

}
