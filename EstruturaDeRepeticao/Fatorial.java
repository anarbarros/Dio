package EstruturaDeRepeticao;

import java.util.Scanner;

public class Fatorial {
	/*
	Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int multiplicacao = 1;
		int fatorial;
		
		System.out.println("Digite um numero");
		fatorial = scan.nextInt();
		
		for(int i = fatorial; i >1 ; i--) {
			
			 multiplicacao = multiplicacao * i;
			System.out.println("O fatorial do numeor " + fatorial + "e: " + multiplicacao);
		}
	}

}
