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
        int pos;
        do {

            nivel.generarValores();
            while (true) {

                nivel.moverGotasEnY(velocidad);

                int posicionEnY = nivel.gota1.getPosicionEnY();
                pos=nivel.Posicion();
                if (posicionEnY > 426) {
                    nivel.verificarRespuesta();
                    switch(pos){
                        case 0:
                            if(nivel.gota1.getEsLaRespuesta()){
                                velocidad+=2;
                            }
                        break;
                        case 1:
                            if(nivel.gota2.getEsLaRespuesta()){
                                    velocidad+=2;
                                }
                        break;
                        case 2:
                            if(nivel.gota3.getEsLaRespuesta()){
                                velocidad+=2;
                            }
                            break;
                        case 3:
                            if(nivel.gota4.getEsLaRespuesta()){
                                velocidad+=2;
                                }
                    }
                    break;
                }

                try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            buenas = nivel.puntos;
        } while (buenas != 2);
        nivel.dispose();
        nivel.PararMusica();
        PrincipalNivel3 Nivel3 = new PrincipalNivel3();
        Nivel3.setVisible(true);
    }
}
