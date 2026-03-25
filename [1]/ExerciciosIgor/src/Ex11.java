public class Ex11 {

    public static void main(String[] args) {
        
        int vetorA[] = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        
        int vetorB[] = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }
        
        for (int element : vetorB) {
            System.out.print(element + " ");
        }
    }
}