package exercicios;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o melhor time do mundo? ");
		String	campeao = sc.nextLine();
		
		switch (campeao.toLowerCase()) {
		case "flamengo":
			System.out.println("Certa resposta!\nO FLA é o melhor time do mundo.");
			break;
		case "palmeiras":
			System.out.println("O palmeira NÃO TEM MUNDIAL!");
			break;
		case "vasco":
			System.out.println("Vasco até a série B já jogou!");
			break;
		case "fluminense":
			System.out.println("Fluminense é pato do FLAMENGO!");
			break;
		default:
			System.out.println("Esse time não está no meu Banco de Dados.");
		}
		
		sc.close();

	}

}
