/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, 
quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. 
Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo. */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {

//declare suas variaveis corretamente
       String linha;
        int numero;

        int impar = 0;
        int par  = 0 ;
        int pos = 0;
        int negativo = 0 ;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//continue a solução
        for ( int i = 0; i < 5 ; i++) {
            linha = br.readLine();
            numero = Integer.parseInt(linha);
            
            
          if(i % 2 == 0){
            par++;
          } else if(i % 2 != 0){
            impar++;
          }
          
          
          if (numero > 0){
            pos++;
          }
          if(numero < 0){
            negativo++;
          }
          
        	
        }
//insira suas variaveis corretamente
        System.out.println("" + par + " par(es)");
        System.out.println("" + impar+ " impar(es)");
        System.out.println("" + pos + " positivo(s)");
        System.out.println("" + negativo + " negativo(s)");
    }
	
}
