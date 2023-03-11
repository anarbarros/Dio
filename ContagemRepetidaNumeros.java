/* Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, 
deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor. */


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;



public class ContagemRepetidaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores = scanner.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();
    
        for (int i = 0; i < valores; i++) {
            var numero = scanner.nextInt();
    
            if(numeros.containsKey(numero)) {
                var qtde = numeros.get(numero);
                numeros.put(numero, ++qtde);
            } else {
                numeros.put(numero, 1);
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}
