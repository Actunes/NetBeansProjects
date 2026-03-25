/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ClasseExemplo06 {
    public static void main (String Args[]){
        int x = 1;
        int y = 100;
        
        for (int i = x; i < y; i++){
            if (i % 19 == 0){
                System.out.println("Valor divisivel por 19: " + i);
                break;
            }
        }
    }
}