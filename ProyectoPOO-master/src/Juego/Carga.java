
package Juego;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Carga extends Thread{
    
     private int Aux=0;
    public PantallaCarga Pantalla;
    @Override
    
    public void run(){
        try {while(true){
            Aux++;
            Pantalla.Barra(Aux);
            
            switch(Aux){
                case 1:
                    Pantalla.IngresarTxt("Cargando.....");
                    break;
                case 20:
                    Pantalla.IngresarTxt("Leyendo Disco");
                    break;
                case 40:
                    Pantalla.IngresarTxt("Terminando de Cargar.....");
                    break;
                case 50:
                    Main Form1=new Main();
                    Form1.setVisible(true);
                    Form1.setLocationRelativeTo(Pantalla);
                    Pantalla.setVisible(false);
                    Pantalla.dispose();
                    break;
            }
            Thread.sleep(150);
        }
           
        } catch (InterruptedException ex) {
           Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

/*public class Carga extends Thread{
    
     private int Aux=0;
    public PantallaCarga Pantalla;
    
    @Override
    
    public void run(){
        try {while(true){
            Aux++;
            //Pantalla.Barra(Aux);
            Barra.setValue(Aux);
            switch(Aux){
                case 1:
                    //Pantalla.IngresarTxt("Cargando.....");
                    Label1.setText("Cargando....");
                    break;
                case 20:
                    //Pantalla.IngresarTxt("Leyendo Disco");
                    Label1.setText("Leyendo Disco...");
                    break;
                case 40:
                    //Pantalla.IngresarTxt("Terminando de Cargar.....");
                    Label1.setText("Terminando los ajustes...");
                    //FondoPrueba Form1=new FondoPrueba();
                    //Form1.setVisible(true);
                    //Form1.setLocationRelativeTo(Pantalla);
                    
                    break;
                case 50:
                    PantallaCarga.this.dispose();
                    break;
            }
            Thread.sleep(150);
        }
           
        } catch (InterruptedException ex) {
           Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}*/
    