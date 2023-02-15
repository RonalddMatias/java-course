package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// soma de todas as notas
		// soma de quantas notas foram lidas
		double num = 0;
		double nota = 0;
		int quant = 0;

		while(num != -1) {
			System.out.print("Digite uma nota: ");
			num = sc.nextDouble();
			
			if(num >= 0 && num <= 10) {
				nota += num;
				quant++;
			} else {
				System.out.println("Nota inválida");
			}
			
			}
			
		double media = nota / quant;
		
		System.out.printf("A média das notas foi: %.2f", media);

		sc.close();

	}

}
