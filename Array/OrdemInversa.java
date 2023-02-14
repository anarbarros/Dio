package Array;

public class OrdemInversa {
	/*
	 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
	 */
	public static void main(String[] args) {

		int[] vetor = { 6, 4, 15, -9, 4, -7 };
		
		int contador = 0;
		while(contador < (vetor.length)) {
			System.out.print(vetor[contador] + " ");
			contador++;
		}
		System.out.println(" ");
		for(int i = (vetor.length -1); i >= 0 ; i--) {
			System.out.print(vetor[i] + " ");
		}

	}

}
