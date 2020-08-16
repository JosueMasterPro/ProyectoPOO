/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;


import java.awt.Point;
import java.util.Random;
import javax.swing.JLabel;


public class Gota {
    private JLabel label;
    private int numero = 0;
    private Point posicionInicial = new Point(0, 0);
    private Point posicionActual = new  Point(0, 0);
    private boolean esLaRespuesta = false;

    
    public Gota(JLabel label) {
        
        Point position = label.getLocation();
        int x = position.x;
        int y = position.y;
                
        this.label = label;
        this.posicionInicial = new Point(x, y);
        this.posicionActual = new Point(x, y);
    }

    /*
    * Pone las Gotas en su posicion original
    */
    private void resetPosition() {
        int x = this.posicionInicial.x;
        int y = this.posicionInicial.y;

        this.posicionActual = new Point(x, y);
        
        this.render();
    }
    
    private void render() {
        String numeroTexto = Integer.toString(this.numero);

        this.label.setText(numeroTexto);
        this.label.setLocation(this.posicionActual);
    }
    
    /*
    * Aumenta la posicion de las gotas en Y
    */
    public void desplazarEnY(int desplazamientoEnY) {
        int x = this.posicionActual.x;
        int y = this.posicionActual.y + desplazamientoEnY;

        this.posicionActual = new Point(x, y);
        
        this.render();
    }
    
    public int getPosicionEnY() {
        int posY =  this.posicionActual.y;
        
        return posY;
    }
    public int getPosicionEnX() {
        int posX =  this.posicionActual.x;
        
        return posX;
    }

    /*
    * Pone la variable esLaRespuesta en true y guarda la respuesta
    */
    public void setRespuesta(int numero,boolean V) {
        this.numero = numero;
        this.esLaRespuesta = V;  
        this.resetPosition();
    }  
    /*
    * Dice si la gota tiene la respuesta
    */
    public boolean getEsLaRespuesta() {
        return this.esLaRespuesta;
    }
}
