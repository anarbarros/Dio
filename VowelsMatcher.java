/* Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena, 
contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class VowelsMatcher {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String vowel;
        String sentence;
        int count = 0;
 
      //escreva o seu código
      while (scanner.hasNextLine()){
        count = 0;
        vowel = scanner.nextLine();
        sentence = scanner.nextLine();
        
        for (int i = 0; i < vowel.length(); i++){
          for (int x = 0; x < sentence.length(); x++){
            if (sentence.charAt(x) == vowel.charAt(i)){
              count++;
            }
          }
        }
        System.out.println(count);
        
      }
      
      
    }
}
