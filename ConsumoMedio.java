/* Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int x = leitor.nextInt();
        double y = leitor.nextDouble();

        double media = x / y   ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", + media     ));   
    }
	
}
