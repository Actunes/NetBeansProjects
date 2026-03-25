/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author igor
 */
public enum Mes {

    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;

    public int getNumero() {
        switch (this) {
            case JANEIRO:
                return 1;
            case FEVEREIRO:
                return 2;
            case MARCO:
                return 3;
            case ABRIL:
                return 4;
            case MAIO:
                return 5;
            case JUNHO:
                return 6;
            case JULHO:
                return 7;
            case AGOSTO:
                return 8;
            case SETEMBRO:
                return 9;
            case OUTUBRO:
                return 10;
            case NOVEMBRO:
                return 11;
            case DEZEMBRO:
                return 12;
            default:
                return 0;

        }
    }
}


