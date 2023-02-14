package EstruturaDeRepeticao;

import java.util.Scanner;

public class MaiorEMedia {

	/*
	 * Faça um programa que leia 5 números e informe o maior número e a média desses
	 * números.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int contador = 0;
		int soma = 0;
		int maior = 0;

		do {
			System.out.println("Digite um numero");
			numero = scan.nextInt();
			
			if(numero > maior) maior = numero;
			
			soma = numero + soma;
			contador++;

		} while (contador < 5);

		System.out.println("A soma de numeros e: " + soma);
		System.out.println("O maior numero e: " + maior);
		System.out.println("A media dos numeros e: " + (soma/5));
	}

}
