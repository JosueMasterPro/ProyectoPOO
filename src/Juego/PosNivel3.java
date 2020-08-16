/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Point;
import javax.swing.JLabel;


public class PosNivel3 {

    JLabel label;
    
    
    public PosNivel3(JLabel label) {
        this.label = label;
    }
    
    public void mover(int posicion) {
        int x = 10;    
        Point posicion1 = new Point(x, 40);
        Point posicion2 = new Point(x, 190);
        Point posicion3 = new Point(x, 360);
        Point posicion4 = new Point(x, 530);
        
        switch(posicion) {
            case 0:
                this.label.setLocation(posicion1);
                break;
            case 1:
                this.label.setLocation(posicion2);
                break;
            case 2:
                this.label.setLocation(posicion3);
                break;
            case 3:
                this.label.setLocation(posicion4);
                break;
            default:
                this.label.setLocation(posicion1);
                break;
        }
    }
    
    public void setText(String text) {
        label.setText(text);
    }
       
}
