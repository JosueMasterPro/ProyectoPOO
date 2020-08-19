/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class PlayerNivel2 {
    int INTENTOS_MAXIMOS = 6;
    public JLabel label;
    int intentos = 6;
     
    public PlayerNivel2(JLabel label) {
        this.label = label;
    }
    
    public void  ponerPlayerCaminando() {
        ImageIcon personajes = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
        ImageIcon icono=new ImageIcon(personajes.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
        this.label.setIcon(icono);
    }
    
    public void ponerPlayerDetenido() {
        ImageIcon personajes = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
        ImageIcon icono = new ImageIcon(personajes.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
        this.label.setIcon(icono);
    }
    
    
    public void mover(int posicion) {
        int y = 260;
        int inicioX = 530;
        int finX = 100;
        int espacioEntreMovimientosEnX = Math.round((inicioX - finX) / INTENTOS_MAXIMOS);
                
                
        // int posicion
                
        Point posicion1 = new Point(530, y);
        Point posicion2 = new Point(480, y);
        Point posicion3 = new Point(430, y);
        Point posicion4 = new Point(380, y);
        Point posicion5 = new Point(330, y);
        Point posicion6 = new Point(280, y);
        Point posicion7 = new Point(230, y);
        Point posicion8 = new Point(180, y);
        Point posicion9 = new Point(130, y);
        Point posicion10 = new Point(100, y);
        
        // Ya mandaste a llamar el jLabel del personaje usando esta clase?
        // hacelo
        // Answer:
        
        switch(posicion) {
            case 0:
                this.label.setLocation(posicion1);
                break;
            case 1:
                this.label.setLocation(posicion2);
                ImageIcon personajes = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                
                ImageIcon icono=new ImageIcon(personajes.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(icono);
                break;
            case 2:
                this.label.setLocation(posicion3);
                ImageIcon personaje = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
                
                ImageIcon icon=new ImageIcon(personaje.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(icon);
                break;
            case 3:
                this.label.setLocation(posicion4);
                ImageIcon personaj = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                
                ImageIcon ico=new ImageIcon(personaj.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(ico);
                break;
            case 4:
                this.label.setLocation(posicion5);
                ImageIcon leo = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
                
                ImageIcon iconos=new ImageIcon(leo.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconos);
                break;
            case 5:
                this.label.setLocation(posicion6);
                ImageIcon leopersonaje = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                
                ImageIcon iconoleo=new ImageIcon(leopersonaje.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconoleo);
                break;
            case 6:
                this.label.setLocation(posicion7);
                this.label.setLocation(posicion6);
                ImageIcon leopersonajes = new ImageIcon(getClass().getResource("/Texetura/detenido.png"));
                
                ImageIcon iconoleop=new ImageIcon(leopersonajes.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconoleop);
                break;
            case 7:
                this.label.setLocation(posicion8);
                this.label.setLocation(posicion6);
                ImageIcon imagenleo = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                
                ImageIcon iconoleopersonaje=new ImageIcon(imagenleo.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconoleopersonaje);
                break; 
            case 8:
                this.label.setLocation(posicion9);
                this.label.setLocation(posicion6);
                ImageIcon leopersonajess = new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
                
                ImageIcon iconoleoper=new ImageIcon(leopersonajess.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconoleoper);
                break;
            case 9:
                this.label.setLocation(posicion10);
                this.label.setLocation(posicion6);
                ImageIcon leofinal = new ImageIcon(getClass().getResource("/Texetura/leopersonaje9.png"));
                
                ImageIcon iconofinal=new ImageIcon(leofinal.getImage().getScaledInstance(this.label.getWidth(), this.label.getHeight(),Image.SCALE_DEFAULT));
                this.label.setIcon(iconofinal);
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
