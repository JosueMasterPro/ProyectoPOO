
package Juego;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CorrerLVL2 extends Thread {
    Main Main=new Main();
    public level2 nivel;

    public CorrerLVL2(level2 nivel) {
        this.nivel = nivel;
    }
int Opcion=1;
    @Override
    public void run() {
        int buenas;
        
        do {

            nivel.generarValores();
            while (true) {

                if(Opcion==1){
                  
                    Opcion=2;
                }
                
                try {
                    sleep(150);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Nivel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            
        } while (buenas < 10);
        
    }
}
