
package Juego;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Jennifer & Berenice
 */

//public class movimiento2 {
//     
//    
//    public movimiento2(JLabel label2) {
//        this.label = label2;
//    
//    }
// 
//    JLabel label;
//    int intentos = 6;
//    public int contador = 0;
//    public void main(String[] args){
//    int velocidad = 2;
//    Timer timer;
//    TimerTask tiempo;
//     int vel= velocidad*1000;
//  
//     
//    
//    
//        int y = 260;
//        Point posicion1 = new Point(530, y);
//        Point posicion2 = new Point(480, y);
//        Point posicion3 = new Point(430, y);
//        Point posicion4 = new Point(380, y);
//        Point posicion5 = new Point(330, y);
//        Point posicion6 = new Point(280, y);
//        Point posicion7 = new Point(230, y);
//        Point posicion8 = new Point(180, y);
//        Point posicion9 = new Point(130, y);
//        Point posicion10 = new Point(100, y);
//  
//    
//    level2 personaje = new level2();
//    personaje.setVisible(true);
//    
//    tiempo = new TimerTask(){
//    
//        @Override
//        public void run(){
//            Icon icono;
//            
//       switch(contador){
//           case 0:
//               contador =1;
//               //this.label2.setLocation(posicion1);
//               
//               icono = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
//               personaje.jLabel2.setIcon(icono);
//               break;
//           case 1:
//               contador =2;
//               icono = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
//               personaje.jLabel2.setIcon(icono);
//           break;
//           case 2:
//                contador =0;
//               icono = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
//               personaje.jLabel2.setIcon(icono);
//               break;
////           case 3:
////                contador =4;
////               icono = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
////               personaje.jLabel2.setIcon(icono);
////               break;
//           
//       }
//        }
//    };
//    timer = new Timer();
//    
//    timer.scheduleAtFixedRate(tiempo,vel,vel);
//    }
//    
//}


 import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author jorgelp
 */
public class movimiento2 extends level2 {


    static int contador = 0;
    int velocidad=2;
    Timer timer;
    TimerTask tiempo;
    int velocidad2= velocidad*1000;
    public  void cambiar(){
                //Icon Imagenes;
                   level2 personaje = new level2();
                     personaje.setVisible(true);
               
                  Icon icono;

                switch(contador){
                    case 0:
                    contador =1;
                    //this.label2.setLocation(posicion1);
               
                    icono = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                    personaje.cambiarImagen((ImageIcon) icono);
                    break;
                     case 1:
                    contador =2;
                     icono = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
                     personaje.cambiarImagen((ImageIcon) icono);
                    break;
                    case 2:
                         contador =0;
                        icono = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                        personaje.cambiarImagen((ImageIcon) icono);
                        break;
//           case 3:
//                contador =4;
//               icono = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
//               personaje.jLabel2.setIcon(icono);
//               break;
           
     }


    timer= new Timer();
    timer.scheduleAtFixedRate(tiempo,velocidad2,velocidad2);

    }
   

   }