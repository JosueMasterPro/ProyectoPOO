/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
//Librerias para Musica
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.applet.AudioClip;




public class PrincipalNivel3 extends javax.swing.JFrame {

   
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Gota gota1;
    Gota gota2;
    Gota gota3;
    Gota gota4;
    Gota Bala;
    PosNivel3 cubeta;
    int puntos = 0;
    int posicionCubeta = 2; // del 0 al 3
    boolean realizado=false;
    //Constructor
    public PrincipalNivel3() {
        initComponents();
        AudioClip Musica1;
        Musica1=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Electrodynamix.wav"));
        Musica1.loop();
        
        this.gota1 = new Gota(this.jLabelGota1);
        this.gota2 = new Gota(this.jLabelGota2);
        this.gota3 = new Gota(this.jLabelGota3);
        this.gota4 = new Gota(this.jLabelGota4);
        this.Bala=new Gota(this.LabelDisparo);
        this.cubeta = new PosNivel3(this.jLabelBucket);
        LabelDisparo.setVisible(false);
        this.setSize(1000, 740);
        jLabelBackground.setSize(1000, 740);
        ImageIcon Fondo=new ImageIcon(getClass().getResource("/Texetura/level1.jpg"));
        ImageIcon icono=new ImageIcon(Fondo.getImage().getScaledInstance(jLabelBackground.getWidth(), jLabelBackground.getHeight(), Image.SCALE_DEFAULT));
        jLabelBackground.setIcon(icono);
        
        ImageIcon Imagen=new ImageIcon(getClass().getResource("/Texetura/drop.png"));
        ImageIcon icon=new ImageIcon(Imagen.getImage().getScaledInstance(jLabelGota1.getWidth(), jLabelGota1.getHeight(), Image.SCALE_DEFAULT));
        jLabelGota1.setIcon(icon);
        jLabelGota2.setIcon(icon);
        jLabelGota3.setIcon(icon);
        jLabelGota4.setIcon(icon);
    }    

    //Apartado para las clases
    public void Mensaje(){
        JOptionPane.showMessageDialog(this, "Disparale a la respuesta \ncorrecta, asi apagaras el fuego.\nUsa La C para Disparar");
    }
     private int numeroAleatorio(int numeroMaximo) {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(numeroMaximo);
        
        return numeroAleatorio;
    }
    
    int respuesta=0;
    public void generarValores() {
        int Operacion=numeroAleatorio(4)+1;
              
        int valor1 = 0;
        int valor2 = 0;
        if(Operacion == 1){
            valor1 = numeroAleatorio(50);
            valor2 = numeroAleatorio(50);
            respuesta = valor1 + valor2;
            this.cubeta.setText(valor1 + " + " + valor2);
            this.LabelDisparo.setText(valor1 + " + " + valor2);
        }
        if(Operacion == 2){
            valor1 = numeroAleatorio(50);
            valor2 = numeroAleatorio(50);
            if(valor1<=valor2){
                respuesta = valor2 - valor1;
                this.cubeta.setText(valor2 + " - " + valor1);
                this.LabelDisparo.setText(valor2 + " - " + valor1);
            }
            else{
                respuesta = valor1 - valor2;
                this.cubeta.setText(valor1 + " - " + valor2);
                this.LabelDisparo.setText(valor1 + " - " + valor2);
            }
        }
        if(Operacion == 3){
             valor1 = numeroAleatorio(10);
             valor2 = numeroAleatorio(10);
            respuesta = valor1 * valor2;
            this.cubeta.setText(valor1 + " * " + valor2);
            this.LabelDisparo.setText(valor1 + " * " + valor2);
        }
        if(Operacion == 4){
            valor1 = numeroAleatorio(12)+1;
            valor2 = numeroAleatorio(12)+1;
            int P=0;
            P=valor1*valor2;
            respuesta = P / valor2;
            this.cubeta.setText(P + " / " + valor2);
            this.LabelDisparo.setText(P + " / " + valor2);
        }
        int gotaAleatoria = numeroAleatorio(4)+1;
        
        switch(gotaAleatoria) {
             case 1:
                gota1.setRespuesta(respuesta,true);
                gota2.setRespuesta(respuesta+5,false);
                gota3.setRespuesta(respuesta+4,false);
                gota4.setRespuesta(respuesta+10,false);
                break;
            case 2:
                gota2.setRespuesta(respuesta,true);

                gota1.setRespuesta(respuesta+5,false);                
                gota3.setRespuesta(respuesta+4,false);
                gota4.setRespuesta(respuesta+10,false);
                break;
            case 3:
                gota3.setRespuesta(respuesta,true);

                gota1.setRespuesta(respuesta+5,false);
                gota2.setRespuesta(respuesta+4,false);
                gota4.setRespuesta(respuesta+10,false);
                break;
            case 4:
                gota4.setRespuesta(respuesta,true);
                gota1.setRespuesta(respuesta+5,false);
                gota2.setRespuesta(respuesta+4,false);
                gota3.setRespuesta(respuesta+10,false);
                break;
        }
        this.cubeta.mover(this.posicionCubeta);
        
    }
    
    int x=6;
    public void verificarRespuesta() {
        
        switch(this.posicionCubeta) {
            case 0:
                if (gota1.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta);
                     
                }
                break;
            case 1:
                if (gota2.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta);
                }
                break;
            case 2:
                if (gota3.getEsLaRespuesta()) {
                    puntos++;
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta);
                }
                break;
            case 3:
                if (gota4.getEsLaRespuesta()) {
                    puntos++;
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta);
                }
                break;
        }
        this.jLabelPuntos.setText("Puntos: " + puntos);
        if(x==0){
            int op = JOptionPane.showConfirmDialog(this, "¿Deseas Reintentarlo?", "Reinicio", YES_NO_OPTION);
                if(op==JOptionPane.YES_OPTION){
                    puntos=0;
                }
                else{
                    Main Main=new Main();    
                    this.dispose();
                    Main.setVisible(true);
                }
        }
    }
    public void MoverBala(int x){
        LabelDisparo.setLocation(x, jLabelBucket.getY());
        if(LabelDisparo.getX() > 800){
            LabelDisparo.setLocation(10,10);
            LabelDisparo.setVisible(false);
        }
    }    
    //fin de apartado para las clases
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBucket = new javax.swing.JLabel();
        LabelDisparo = new javax.swing.JLabel();
        jLabelGota4 = new javax.swing.JLabel();
        jLabelGota3 = new javax.swing.JLabel();
        jLabelGota1 = new javax.swing.JLabel();
        jLabelGota2 = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBucket.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabelBucket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/LEOPERSONAJE8.png"))); // NOI18N
        jLabelBucket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelBucket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 160));

        LabelDisparo.setBackground(new java.awt.Color(102, 102, 255));
        LabelDisparo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDisparo.setText("SADHKAJ");
        LabelDisparo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelDisparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 90, 70));

        jLabelGota4.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGota4.setText("0");
        jLabelGota4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelGota4.setFocusable(false);
        jLabelGota4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 80, 130));

        jLabelGota3.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota3.setText("0");
        jLabelGota3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 80, 130));

        jLabelGota1.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota1.setText("0");
        jLabelGota1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 80, 130));

        jLabelGota2.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota2.setText("0");
        jLabelGota2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelGota2.setFocusable(false);
        jLabelGota2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 80, 130));

        jLabelPuntos.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabelPuntos.setText("Puntos: 0");
        getContentPane().add(jLabelPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 160, 40));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/level1.jpg"))); // NOI18N
        jLabelBackground.setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_C) {
            MovBalaNivel3 nivel = new MovBalaNivel3(this);
            switch(posicionCubeta){
                case 0:LabelDisparo.setLocation(30,40);
                    break;
                case 1:LabelDisparo.setLocation(30,190);
                    break;
                case 2:LabelDisparo.setLocation(30,360);
                    break;
                case 3:LabelDisparo.setLocation(30,530);
                    break; 
            }
            LabelDisparo.setVisible(true);
            boolean Verdad=false;
            if (Verdad == false) {
            Verdad = true;
            nivel.start();
        }
        }
        if(evt.getKeyCode() == KeyEvent.VK_A){
            JOptionPane.showMessageDialog(this, jLabelBucket.getX()+" y "+jLabelBucket.getY());
        }
        int nuevaPosicionCubeta = this.posicionCubeta;
        // Flecha Derecha
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (nuevaPosicionCubeta > 3) {
                nuevaPosicionCubeta = 0;
            }
            else{
                nuevaPosicionCubeta = this.posicionCubeta + 1;
            }
        this.posicionCubeta = nuevaPosicionCubeta;
        this.cubeta.mover(this.posicionCubeta);
        }
        // Flecha Izquierda
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            if (nuevaPosicionCubeta < 0) {
                nuevaPosicionCubeta = 3;
            }
            else{
                nuevaPosicionCubeta = this.posicionCubeta - 1;
            }
        this.posicionCubeta = nuevaPosicionCubeta;
        this.cubeta.mover(this.posicionCubeta);
        }
    }//GEN-LAST:event_formKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (realizado == false) {
            MainNivel3 nivel = new MainNivel3(this);
            realizado = true;
            nivel.start();
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalNivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalNivel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDisparo;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBucket;
    private javax.swing.JLabel jLabelGota1;
    private javax.swing.JLabel jLabelGota2;
    private javax.swing.JLabel jLabelGota3;
    private javax.swing.JLabel jLabelGota4;
    private javax.swing.JLabel jLabelPuntos;
    // End of variables declaration//GEN-END:variables
}
