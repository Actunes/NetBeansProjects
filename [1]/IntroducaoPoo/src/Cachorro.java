/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igor
 */
public class Cachorro {

    String nome;
    String raca;
    int peso;

    public void latir(int vezesLatir) {

        String tipoDoLatido = this.TipoLatido(this.peso);

        if (vezesLatir <= 0) {
            System.out.println("Valor negativo ou nulo informado");
        } else {
            for (int i = 0; i <= vezesLatir; i++) {
                System.out.printf(tipoDoLatido + " " + i + "\n");
            }
        }

    }

    public void dormir() {
        System.out.println("zzzzz");
    }

    public void comer() {
        System.out.println("nhac");
    }

    private String TipoLatido(int pesoCachorro) {

        String tipoLatido = "";

        if (pesoCachorro > 25) {
            tipoLatido = "woof";
        }
        if (pesoCachorro >= 10 && pesoCachorro <= 25) {
            tipoLatido = "au";
        }
        if (pesoCachorro < 10) {
            tipoLatido = "iau";
        }

        return tipoLatido;

    }
}
