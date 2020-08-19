/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Juego;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Jennifer & Berenice
 */
public class Nivel4 extends javax.swing.JFrame {
  boolean realizado = false;
    int posicionPlayer = 0;   
    Gota respuesta1;
    Gota respuesta2;
    Gota respuesta3;
    Gota respuesta4;
    PlayerNivel2 pregunta;
    PlayerNivel2 personaje;
    /* Creates new form Nivel4 */
    public Nivel4() {
        initComponents();
        
        this.personaje = new PlayerNivel2(this.jLabel2);
        this.respuesta1 = new Gota(this.jLabel3);
        this.respuesta2 = new Gota(this.jLabel4);
        this.respuesta3 = new Gota(this.jLabel5);
        this.respuesta4 = new Gota(this.jLabel6);
         ImageIcon personajes=new ImageIcon(getClass().getResource("/Texetura/leopersonaje5.png"));
        ImageIcon icono=new ImageIcon(personajes.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(),Image.SCALE_DEFAULT));
         jLabel2.setIcon(icono);
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
            this.pregunta.setText(valor1 + " + " + valor2);
        }
        if(Operacion == 2){
            valor1 = numeroAleatorio(50);
            valor2 = numeroAleatorio(50);
            if(valor1<=valor2){
                respuesta = valor2 - valor1;
                this.pregunta.setText(valor2 + " - " + valor1);
            }
            else{
                respuesta = valor1 - valor2;
                this.pregunta.setText(valor1 + " - " + valor2);
            }
        }
        if(Operacion == 3){
             valor1 = numeroAleatorio(10);
             valor2 = numeroAleatorio(10);
            respuesta = valor1 * valor2;
            this.pregunta.setText(valor1 + " * " + valor2);
        }
        if(Operacion == 4){
            valor1 = numeroAleatorio(12)+1;
            valor2 = numeroAleatorio(12)+1;
            int P=0;
            P=valor1*valor2;
            respuesta = P / valor2;
            this.pregunta.setText(P + " / " + valor2);
        }
        int gotaAleatoria = numeroAleatorio(4)+1;
        this.posicionPlayer = 0;
        
        switch(gotaAleatoria) {
            case 1:
                respuesta1.setRespuesta(respuesta,true);
                respuesta2.setRespuesta(respuesta+5,false);
                respuesta3.setRespuesta(respuesta+4,false);
                respuesta4.setRespuesta(respuesta+10,false);
                break;
            case 2:
                respuesta2.setRespuesta(respuesta,true);

                respuesta1.setRespuesta(respuesta+5,false);                
                respuesta3.setRespuesta(respuesta+4,false);
                respuesta4.setRespuesta(respuesta+10,false);
                break;
            case 3:
                respuesta3.setRespuesta(respuesta,true);

                respuesta1.setRespuesta(respuesta+5,false);
                respuesta2.setRespuesta(respuesta+4,false);
                respuesta4.setRespuesta(respuesta+10,false);
                break;
            case 4:
                respuesta4.setRespuesta(respuesta,true);
                respuesta1.setRespuesta(respuesta+5,false);
                respuesta2.setRespuesta(respuesta+4,false);
                respuesta3.setRespuesta(respuesta+10,false);
                break;
        }
       this.personaje.mover(this.posicionPlayer);
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("0");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 40, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 60, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("00+00");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("0");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/LEOPERSONAJE5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 80, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/Sketch003.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(70, 70));
        jLabel1.setMinimumSize(new java.awt.Dimension(70, 70));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables


}
