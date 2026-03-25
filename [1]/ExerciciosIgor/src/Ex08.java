import java.util.ArrayList;

public class Ex08 {

    public static void main(String[] args) {

        int vetor[] = {5, 10, 20, 25, 13, 9};

        // Usando ArrayList para armazenar os números pares e ímpares dinamicamente
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        // Loop para preencher os ArrayLists
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("--- Dados dos números pares ---");
        System.out.println("Quantidade de números pares: " + numerosPares.size());
        
        System.out.print("Números pares encontrados: ");
        for (int i = 0; i < numerosPares.size(); i++) {
            System.out.print(numerosPares.get(i));
            if (i < numerosPares.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("--- Dados dos números ímpares ---");
        System.out.println("Quantidade de números ímpares: " + numerosImpares.size());
        
        System.out.print("Números ímpares encontrados: ");
        for (int i = 0; i < numerosImpares.size(); i++) {
            System.out.print(numerosImpares.get(i));
            if (i < numerosImpares.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}