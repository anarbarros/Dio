/* Neste desafio, faça um programa que calcule o valor de H com N termos. 

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. */



import static java.lang.Math.round;
import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (double  i = 1.0; i <= n; i++) {
      h = h + 1/i;
           
      }
      System.out.println(round(h));
       
   }
}
