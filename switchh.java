package exercicio;

import java.util.Scanner;

public class switchh {

    public statsdic void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = entrada.nextInt();
        
        switch(numero) {
        case 1, 2 ,3 :
        	System.out.println("Correct");
        
        break;
        case 4:
        	System.out.println("wrong");
        break;
        case 5:
        	System.out.println("Maybe");
        break;
        default:
        	System.out.println("Undefied");
        
        
        }
        
    }
    
}
