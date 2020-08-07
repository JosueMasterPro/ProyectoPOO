
package Juego;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JuegoMain extends Thread {
    public Juego Juego;
    public static int x , y;
    int MaxNumber=50;
    Random Aleatorio=new Random();
    int A1=Aleatorio.nextInt(MaxNumber);
    int A2=Aleatorio.nextInt(MaxNumber);
    int A3=Aleatorio.nextInt(3)+1;
    int Puntos=0;
    
    
     void Aleatorio(){
        A1=Aleatorio.nextInt(MaxNumber);
        A2=Aleatorio.nextInt(MaxNumber);
        Juego.EnterText(2,String.valueOf(A1)+" + " + String.valueOf(A2));
        A3=Aleatorio.nextInt(3)+1;
        Juego.EnterText(4,String.valueOf(A3));
    }
    /*
    --Si usamos la funcion EnterText, es:
    1 para jLabel1;
    2 para jLabel2;
    3 para LablePuntaje;
    4 para LabelRespuesta
    --Si usamos la funcion GetText
    1 Para GotaLabel
    3 para LabelPuntaje
    4 para LabelRespuesta
    */
    @Override
    public void run(){
                Juego.EnterText(2,String.valueOf(A1)+" + " + String.valueOf(A2));
                int Gotax=Juego.Gotalabel();
                int Gota1x=Juego.Gotalabel1();
                int Gota2x=Juego.Gotalabel2();
                int Gota3x=Juego.Gotalabel3();
                int y=1;
                Juego.EnterText(3,String.valueOf(Puntos));
                Juego.EnterText(4,String.valueOf(A3));
                while(true){
                    int Resultado;
                    Resultado=A1+A2;
                    Juego.botones(A3,Resultado);
                    y=y+4;
                    if(y>=450){
                       y=1; 
                       Aleatorio();
                    }
                    
                    if(Integer.valueOf(Juego.getText(4))==Resultado){
                        Puntos++;
                        Juego.EnterText(3,String.valueOf(Puntos));
                        Juego.EnterText(4,"0");
                        y=1;
                        Aleatorio();
                   }
                   if(Juego.Funcion()==true){
                       if(Integer.valueOf(Juego.getText(3))==Resultado){
                            Puntos++;
                       }
                   } 
                    Juego.Location(1,Gotax, y);//GotaLabel.setLocatio(Gotax,y)
                    Juego.Location(2,Gota1x, y);//GotaLabel1.setLocatio(Gota1x,y)
                    Juego.Location(3,Gota2x, y);//GotaLabel2.setLocatio(Gota2x,y)
                    Juego.Location(4,Gota3x, y);//GotaLabel3.setLocatio(Gota3x,y)
                    try {
                        sleep(150);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    
    
}
