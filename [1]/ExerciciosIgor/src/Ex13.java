
/*
 *
 * @author igor
 * * O valor de B[0] deve receber o valor do maior elemento (conteúdo) de A.
Resposta: 96

 */

public class Ex13 {

    public static void main(String[] args) {
        
        int vetorA[] = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        
        int maiorValor = vetorA[0];
        
        for (int i = 1; i < vetorA.length; i++) {
            if (vetorA[i] > maiorValor) {
                maiorValor = vetorA[i];
            }
        }
        
        int vetorB[] = new int[1];
        
        vetorB[0] = maiorValor;
        
        System.out.println("Valor de B[0]: " + vetorB[0]);
    }
}