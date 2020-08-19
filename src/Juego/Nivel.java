/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;


public class Nivel extends javax.swing.JFrame {

    int puntos = 0;
    int posicionCubeta = 2; // del 0 al 3
    boolean realizado = false;

    // Interfaz Grafica
    Gota gota1;
    Gota gota2;
    Gota gota3;
    Gota gota4;
    Cubeta cubeta;

    ImageIcon Vida=new ImageIcon(getClass().getResource("/Texetura/CORAZONVIDAS3.png"));
    ImageIcon Corazon;
    
     AudioClip Nivel1,Falla,Correcto;
    
    public Nivel() {
        initComponents();
        
        Nivel1=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Nivel1.wav"));
        Falla=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/FALLA.wav"));
        Correcto=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Correcto.wav"));
        Nivel1.loop();
        
        
        this.Corazon = new ImageIcon(Vida.getImage().getScaledInstance(Vida1.getWidth(), Vida1.getHeight(), Image.SCALE_DEFAULT));    
        
        this.gota1 = new Gota(this.jLabelGota1);
        this.gota2 = new Gota(this.jLabelGota2);
        this.gota3 = new Gota(this.jLabelGota3);
        this.gota4 = new Gota(this.jLabelGota4);
        this.cubeta = new Cubeta(this.jLabelBucket);
        ImageIcon Fondo=new ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"));
        ImageIcon icono=new ImageIcon(Fondo.getImage().getScaledInstance(Vida1.getWidth(), Vida1.getHeight(), Image.SCALE_DEFAULT));
        Vida1.setIcon(icono);
        Vida2.setIcon(icono);
        Vida3.setIcon(icono);
        
        ImageIcon Imagen=new ImageIcon(getClass().getResource("/Texetura/drop.png"));
        ImageIcon icon=new ImageIcon(Imagen.getImage().getScaledInstance(jLabelGota1.getWidth(), jLabelGota1.getHeight(), Image.SCALE_DEFAULT));
        jLabelGota1.setIcon(icon);
        jLabelGota2.setIcon(icon);
        jLabelGota3.setIcon(icon);
        jLabelGota4.setIcon(icon);
   
    }
    /**
     * Mueve las gotas N cantidad de pixeles hacia abajo
     * @param pixeles - cantidad de pixeles a bajar
     */
    public void moverGotasEnY(int pixeles) {

        gota1.desplazarEnY(pixeles);
        gota2.desplazarEnY(pixeles);
        gota3.desplazarEnY(pixeles);
        gota4.desplazarEnY(pixeles);
    }
    
    /*
    *   Genera un numero aleatorio
    */
    private int numeroAleatorio(int numeroMaximo) {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(numeroMaximo);
        
        return numeroAleatorio;
    }

    /*
    *   Genera la suma para la cubeta y setea los valores a las gotas
    */
    int respuesta=0;
    public int Posicion(){
        return posicionCubeta;
    }
    int valor1 = 0;
    int valor2 = 0;
    public void generarValores() {
        int Operacion=numeroAleatorio(4)+1;
              
        
        if(Operacion == 1){
            valor1 = numeroAleatorio(20);
            valor2 = numeroAleatorio(20);
            respuesta = valor1 + valor2;
            this.cubeta.setText(valor1 + " + " + valor2);
        }
        if(Operacion == 2){
            valor1 = numeroAleatorio(20);
            valor2 = numeroAleatorio(20);
            if(valor1<=valor2){
                respuesta = valor2 - valor1;
                this.cubeta.setText(valor2 + " - " + valor1);
            }
            else{
                respuesta = valor1 - valor2;
                this.cubeta.setText(valor1 + " - " + valor2);
            }
        }
        if(Operacion == 3){
             valor1 = numeroAleatorio(10);
             valor2 = numeroAleatorio(10);
            respuesta = valor1 * valor2;
            this.cubeta.setText(valor1 + " * " + valor2);
        }
        if(Operacion == 4){
            valor1 = numeroAleatorio(12)+1;
            valor2 = numeroAleatorio(12)+1;
            int P=0;
            P=valor1*valor2;
            respuesta = P / valor2;
            this.cubeta.setText(P + " / " + valor2);
        }
        int gotaAleatoria = numeroAleatorio(4)+1;
        this.posicionCubeta = 2;
        
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
    
    /*
    *   Verifica la posicion de la cubeta para saber si la respuesta es correcta,
    *   tambien agrega los puntos y actualiza el jLabelPuntos
    */
    int x=6;
    int corazones=0;
    public void vidas(int corazones){
        if(corazones==1){
            Vida3.setIcon(Corazon);
            }
        else if(corazones==2){
            Vida3.setVisible(false);
            }
        else if(corazones==3){
            Vida2.setIcon(Corazon);
            }
        else if(corazones==4){
            Vida2.setVisible(false);
            }
        else if(corazones==5){
            Vida1.setIcon(Corazon);
            }
        else if(corazones==6){
            Vida1.setVisible(false);
            }
    }
    public void PararMusica(){
        Nivel1.stop();
    }
    
    
    public void verificarRespuesta() {
        
        switch(this.posicionCubeta) {
            case 0:
                if (gota1.getEsLaRespuesta()) {
                    puntos++;
                    Correcto.play();
                }
                else{
                    x--;
                    corazones++;
                    vidas(corazones);
                    Falla.play();
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+respuesta);
                     
                }
                break;
            case 1:
                if (gota2.getEsLaRespuesta()) {
                    puntos++;
                    Correcto.play();
                }
                else{
                    x--;
                    Falla.play();
                    corazones++;
                    vidas(corazones);
                    JOptionPane.showMessageDialog(this, "La Respuesta era: "+respuesta);
                }
                break;
            case 2:
                if (gota3.getEsLaRespuesta()) {
                    puntos++;
                    Correcto.play();
                    
                }
                else{
                    x--;
                    corazones++;
                    Falla.play();
                    vidas(corazones);
                    JOptionPane.showMessageDialog(this, "La Respuesta era: "+respuesta);
                }
                break;
            case 3:
                if (gota4.getEsLaRespuesta()) {
                    puntos++;
                    Correcto.play();
                    
                }
                else{
                    x--;
                    Falla.play();
                    corazones++;
                    vidas(corazones);
                    JOptionPane.showMessageDialog(this, "La Respuesta era: "+respuesta);
                }
                break;
        }
        this.jLabelPuntos.setText("Puntos: " + puntos);
        if(x==0){
                    x=6;
                    puntos=0;
                    corazones=0;
                    Vida1.setVisible(true);
                    Vida2.setVisible(true);
                    Vida3.setVisible(true);
                
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vida1 = new javax.swing.JLabel();
        Vida2 = new javax.swing.JLabel();
        Vida3 = new javax.swing.JLabel();
        LABLEVIDA = new javax.swing.JLabel();
        jLabelGota1 = new javax.swing.JLabel();
        jLabelGota2 = new javax.swing.JLabel();
        jLabelGota3 = new javax.swing.JLabel();
        jLabelGota4 = new javax.swing.JLabel();
        jLabelBucket = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rainy Math");
        setMinimumSize(new java.awt.Dimension(700, 700));
        setResizable(false);
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

        Vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        getContentPane().add(Vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 40));

        Vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        getContentPane().add(Vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 50, 40));

        Vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        getContentPane().add(Vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 40));

        LABLEVIDA.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        LABLEVIDA.setText("Vidas:");
        getContentPane().add(LABLEVIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        jLabelGota1.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota1.setText("0");
        jLabelGota1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelGota1.setFocusable(false);
        jLabelGota1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 50, 80, 130));

        jLabelGota2.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota2.setText("0");
        jLabelGota2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, 130));

        jLabelGota3.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota3.setText("0");
        jLabelGota3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 50, 80, 130));

        jLabelGota4.setFont(new java.awt.Font("Dialog", 0, 55)); // NOI18N
        jLabelGota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGota4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        jLabelGota4.setText("0");
        jLabelGota4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelGota4.setFocusable(false);
        jLabelGota4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelGota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 80, 130));

        jLabelBucket.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabelBucket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/LEOPERSONAJE8.png"))); // NOI18N
        jLabelBucket.setText("00 + 00");
        jLabelBucket.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelBucket, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 150, -1));

        jLabelPuntos.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabelPuntos.setText("Puntos: 0");
        getContentPane().add(jLabelPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 160, 40));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/level1.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Evento que agarra la fechas del teclado y mueve la cubeta
    */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int nuevaPosicionCubeta = this.posicionCubeta;

        // Flecha Derecha
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            nuevaPosicionCubeta = this.posicionCubeta + 1;
        }

        // Flecha Izquierda
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            nuevaPosicionCubeta = this.posicionCubeta - 1;
        }

        // Si se pasa 3
        if (nuevaPosicionCubeta > 3) {
            nuevaPosicionCubeta = 3;
        }

        // Si se pasa 0
        if (nuevaPosicionCubeta < 0) {
            nuevaPosicionCubeta = 0;
        }

        this.posicionCubeta = nuevaPosicionCubeta;

        this.cubeta.mover(this.posicionCubeta);
    }//GEN-LAST:event_formKeyPressed

    /*
    * Este seria el main del juego, comienza el juego a través de un thread
    * el cual nos permite tener loops infinitos sin trabar el programa. 
    */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (realizado == false) {
            MainNivel nivel = new MainNivel(this);
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
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABLEVIDA;
    private javax.swing.JLabel Vida1;
    private javax.swing.JLabel Vida2;
    private javax.swing.JLabel Vida3;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelBucket;
    private javax.swing.JLabel jLabelGota1;
    private javax.swing.JLabel jLabelGota2;
    private javax.swing.JLabel jLabelGota3;
    private javax.swing.JLabel jLabelGota4;
    private javax.swing.JLabel jLabelPuntos;
    // End of variables declaration//GEN-END:variables
}
