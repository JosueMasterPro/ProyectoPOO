
package Juego;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainNivel3 extends Thread {

    Main Main=new Main();
    public PrincipalNivel3 nivel;

    public MainNivel3(PrincipalNivel3 nivel) {
        this.nivel = nivel;
    }
int Opcion=1;
    @Override
    public void run() {
        int buenas;
        
        do {

            nivel.generarValores();
            while (true) {

                int posicionEnX = nivel.Bala.getPosicionEnX();
                if(Opcion==1){
                    nivel.Mensaje();
                    Opcion=2;
                }
                if (posicionEnX > 680) {
                   
                    break;
                }

                try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            buenas = nivel.puntos;
        } while (buenas < 10);
        nivel.dispose();
        Main.setVisible(true);
    }

    
}
