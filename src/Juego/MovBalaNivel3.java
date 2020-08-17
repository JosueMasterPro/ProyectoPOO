
package Juego;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MovBalaNivel3 extends Thread {

    Main Main=new Main();
    public PrincipalNivel3 nivel;

    public MovBalaNivel3(PrincipalNivel3 nivel) {
        this.nivel = nivel;
    } 
    @Override
    public void run() {
        int x = 0;

        do {
            
            while(true){
                x=x+20;
                nivel.MoverBala(x);
                if(x>800){
                    nivel.verificarRespuesta();
                    nivel.generarValores();
                    break;
                }
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MovBalaNivel3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } while (x < 800);
}
}
