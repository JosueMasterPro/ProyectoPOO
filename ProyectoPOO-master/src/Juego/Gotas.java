/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Label;
import java.awt.Point;


public class Gotas extends Label {
    public boolean intersects(Point objeto, int objectWidth, int objetHeight) {
        // Rojo
        Point location = this.getLocation();
        int posXMaximo = location.x + this.getWidth();
        int posYMaximo = location.y + this.getWidth();
        int posObjetoXMaximo = objeto.x + objectWidth;
        int posObjetoYMaximo = objeto.y + objetHeight;

        Point posMinimo = this.getLocation();
        Point posMaxima = new Point(posXMaximo, posYMaximo);

        
        // Amarillo
        Point posObjetoMinimo = objeto;
        Point posObjetoMaximo = new Point(posObjetoXMaximo, posObjetoYMaximo);
        
        
        boolean chocaEnX = (
            posMinimo.x  <= posObjetoMinimo.x && posMinimo.x  <= posObjetoMaximo.x &&
            posMaxima.x  <= posObjetoMinimo.x && posMaxima.x  <= posObjetoMaximo.x
        );
        
        boolean chocaEnY = (
            posMinimo.y  <= posObjetoMinimo.y && posMinimo.y  <= posObjetoMaximo.y &&
            posMaxima.y  <= posObjetoMinimo.y && posMaxima.y  <= posObjetoMaximo.y
        );
        
        if (chocaEnX && chocaEnY) {
            return true;
        }
        
        return false;
        
    }
}
