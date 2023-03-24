import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int fatorial = n;
        
        for (int i = fatorial - 1; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);
      
        

		
	}
}
