/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class manipulaString {

    public static void main(String args[]) {
        String x = new String("fj11");

        String y = new String("fj11");

        if (x == y) {
            System.out.println("Mesmo objeto");
        } else {
            System.out.println("Diferentes objetos");
        }

        if (x.equals(y)) {
            System.out.println("Mesmo objeto");
        } else {
            System.out.println("Diferentes objetos");
        }

    }

}
