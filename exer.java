package exercicio;
import java.util.Scanner;

public class exer {
	

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);	
	
	 
	 System.out.println("Escolha o dia da semana");
	 int diaSemana = entrada.nextInt();
	 
		 switch (diaSemana){
	        case 1:
	            System.out.println("Segunda");
	           break;
	        case 2:
	          System.out.println("TERÇA");
	          break;
	        case 3:
	            System.out.println("QUARTA");
	            break;
	        case 4:
	            System.out.println("QUINTA");
	            break;
	        case 5:
	            System.out.println("SEXTA");
	        break;
	        default:
	        	System.out.println("O número desajado está incorreto");
	        
	        	


	}
	}

}
