// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		
  if ((A < (B + C)) && (B < (A + C)) && (C < (A + B))) {
    
    System.out.println("Perimetro = " + String.format("%.1f", (A + B + C)));
  }
  else {
    System.out.println("Area = " + String.format("%.1f", (((A + B) * C) / 2)));
    
  }
		
		
	}
	
}
