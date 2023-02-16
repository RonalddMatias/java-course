package exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite algum ano para saber se ele é bissexto: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.printf("%d é bissexto", ano);
		} else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
			System.out.printf("%d é ano bissexto", ano);
		} else {
			System.out.printf("%d não é um ano bissexto.", ano);
		}
		
		sc.close();
	}

}
