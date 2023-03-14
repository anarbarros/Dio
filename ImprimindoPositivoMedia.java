/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.*/


import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DIO {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;

    List<Float> listaDeValores = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            listaDeValores.add(leitor.nextFloat());
        }

        for (float valor: listaDeValores){
            if(valor > 0){
                cont ++;
                media += valor;
            }
        }

        media = media/cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	
}
