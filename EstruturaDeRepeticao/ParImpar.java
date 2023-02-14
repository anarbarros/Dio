package EstruturaDeRepeticao;

import java.util.Scanner;

public class ParImpar {
	/*
	Faça um programa que peça N números inteiros,
	calcule e mostre a quantidade de números pares
	e a quantidade de números impares.
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int  quantidadeNumero; 
		int par = 0 , impar=0 ;
		int contador = 0;
		
		System.out.println("Quantidade de numeros");
		quantidadeNumero = scan.nextInt();
		
		
		do {
			System.out.println("Numero:");
			int numero = scan.nextInt();
			
			if(numero % 2 == 0) par++;
			else impar++;
			
			contador++;
			
			
		}while(contador <quantidadeNumero);
		
		System.out.println("Quantidade de pares: " + par  +  " Quantidades de impares: " + impar);
	}

}
