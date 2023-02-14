package Array;

import java.util.Random;

public class Multidimencional {
	/*
	Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
	*/
	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] matriz = new int [4][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int column = 0; column < matriz[i].length; column++) {
				matriz[i][column] = random.nextInt(9);
			}
		}
		
			for (int[] linha : matriz) {
				for (int coluna : linha) {
					System.out.print(coluna + " ");
				}
				System.out.println();
			}
	}

}
