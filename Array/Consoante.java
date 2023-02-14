package Array;

import java.util.Scanner;

public class Consoante {
	/*
	 * Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes
	 * foram lidas. Imprima as consoantes.
	 */

	public static void main(String[] args) {

		// char[] vetor = {'m', 'o' , 'r' , 'g' , 'a' ,'n' , 'a' };
		Scanner scan = new Scanner(System.in);

		String[] consoantes = new String[6];

		int quantidadeConsoantes = 0;
		int contador = 0;
		do {
			System.out.println("Digite a letra");
			String letra = scan.next();

			if ( !(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
				consoantes[contador] = letra;
				quantidadeConsoantes++;
			}
			contador++;

		} while (contador < consoantes.length);
		
		for (String consoante : consoantes) {
			if(consoante != null) {
			System.out.print(consoante + " ");}
			
		}
		System.out.println("Sao " + quantidadeConsoantes + " consoantes");
	}

}
