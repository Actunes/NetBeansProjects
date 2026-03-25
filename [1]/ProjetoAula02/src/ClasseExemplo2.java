/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ClasseExemplo2 {

    public static void main(String args[]) {
        int dia = 4;
        String extenso = "";

        switch (dia) {
            case 1:
                extenso = "Domingo";
                break;
            case 2:
                extenso = "Segunda-Feira";
                break;
            case 3:
                extenso = "Terça-Feira";
                break;
            case 4:
                extenso = "Quarta-Feira";
                break;
            case 5:
                extenso = "Quinta-Feira";
                break;
            case 6:
                extenso = "Sexta-Feira";
                break;
            case 7:
                extenso = "Sabado";
                break;
            default: extenso = "Valor Incorreto";
        }
        
        System.out.println(extenso);
    }

}
