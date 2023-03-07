
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        String valor;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        valor = br.readLine();
        
        for (int i = 2; i <= Integer.parseInt(valor); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
