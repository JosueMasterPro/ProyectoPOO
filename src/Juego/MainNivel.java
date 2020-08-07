/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainNivel extends Thread {
    Main Main=new Main();
    public Nivel nivel;

    public MainNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public void run() {
        int buenas;
        int velocidad = 5;

        do {

            nivel.generarValores();
            while (true) {

                nivel.moverGotasEnY(velocidad);

                int posicionEnY = nivel.gota1.getPosicionEnY();

                if (posicionEnY > 426) {
                    nivel.verificarRespuesta();
                    velocidad+=0.75;
                    break;
                }

                try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            buenas = nivel.puntos;
        } while (buenas != 10);
        nivel.dispose();
        Main.setVisible(true);
    }
}
