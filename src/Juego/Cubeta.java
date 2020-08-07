/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Point;
import javax.swing.JLabel;

public class Cubeta {
    JLabel label;
    
    
    public Cubeta(JLabel label) {
        this.label = label;
    }
    
    public void mover(int posicion) {
        int y = 480;
                
        Point posicion1 = new Point(14, y);
        Point posicion2 = new Point(189, y);
        Point posicion3 = new Point(363, y);
        Point posicion4 = new Point(538, y);
        
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
