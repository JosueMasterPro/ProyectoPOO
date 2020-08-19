/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Jennifer & Berenice
 */
public class level2 extends javax.swing.JFrame {
    
    
    boolean realizado = false;
    int posicionPlayer = 0;   
    Gota respuesta1;
    Gota respuesta2;
    Gota respuesta3;
    Gota respuesta4;
    PlayerNivel2 pregunta;
    PlayerNivel2 personaje;
    PlayerNivel2 funcion;
    int puntos = 0;
    boolean Verdad=false;
    
    /**
     * Creates new form level2
     */
    public level2() {
        initComponents();
        this.personaje = new PlayerNivel2(this.jLabel2);
        this.respuesta1 = new Gota(this.jLabel8);
        this.respuesta2 = new Gota(this.jLabel9);
        this.respuesta3 = new Gota(this.jLabel10);
        this.respuesta4 = new Gota(this.jLabel11);
        this.pregunta = new PlayerNivel2(this.jLabel3);
        
        
          ImageIcon imagen=new ImageIcon(getClass().getResource("/Texetura/sketch002.png"));
        ImageIcon icon=new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(icon);
        
        ImageIcon personajes=new ImageIcon(getClass().getResource("/Texetura/leopersonaje8.png"));
        ImageIcon icono=new ImageIcon(personajes.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(),Image.SCALE_DEFAULT));
         jLabel2.setIcon(icono);
         
          ImageIcon Imagen=new ImageIcon(getClass().getResource("/Texetura/drop.png"));
        ImageIcon iconos=new ImageIcon(Imagen.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(iconos);
        jLabel5.setIcon(iconos);
        jLabel6.setIcon(iconos);
        jLabel7.setIcon(iconos);
         
         
         
    }
    
    public void cambiarImagen(ImageIcon icon){
        jLabel2.setIcon(icon);
    }
      private int numeroAleatorio(int numeroMaximo) {
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(numeroMaximo);
        
        return numeroAleatorio;
    }
        int valor1 = 0;
        int valor2 = 0;
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
//    public class ponerPlayerCaminando{
//     ImageIcon Imagen=new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
//     ImageIcon iconos=new ImageIcon(Imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
//     this.label.setIcon(iconos);
//    }
    
   
//    public class ponerPlayerCaminando {
//        ImageIcon Imagen=new ImageIcon(getClass().getResource("/Texetura/caminando.png"));
//        ImageIcon iconos=new ImageIcon(Imagen.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
//        jLabel2.setIcon(iconos); 
//    }
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel3.setText("00+00");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(700, 700, 700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("MOVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 100, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText(" 0");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, 80));
        jLabel8.getAccessibleContext().setAccessibleName("jLabel8");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setText(" 0");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, 80));
        jLabel9.getAccessibleContext().setAccessibleName("jLabel9");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("0");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 70, 80));
        jLabel10.getAccessibleContext().setAccessibleName("jLabel10");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("  0");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 80));
        jLabel11.getAccessibleContext().setAccessibleName("jLabel11");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        jLabel7.setText("0");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 90, 90));
        jLabel7.getAccessibleContext().setAccessibleName("jLabel7");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        jLabel6.setText("0");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 90));
        jLabel6.getAccessibleContext().setAccessibleName("jLabel6");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        jLabel5.setText("  0");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 90, 90));
        jLabel5.getAccessibleContext().setAccessibleName("jLabel5");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/CORAZON VIDAS.png"))); // NOI18N
        jLabel4.setText("0");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, 90));
        jLabel4.getAccessibleContext().setAccessibleName("jLabel4");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/LEOPERSONAJE8_1.png"))); // NOI18N
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 130, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/Sketch002.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
      
    
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jLabel2KeyPressed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        if (respuesta4.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta); 
                }
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         if (respuesta1.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta); 
                }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
         if (respuesta2.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta); 
                }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         if (respuesta3.getEsLaRespuesta()) {
                    puntos++;
                }
                else{
                    JOptionPane.showMessageDialog(this, "La Respuesta era:"+ respuesta); 
                }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        if (realizado == false) {
            CorrerLVL2 Correr=new CorrerLVL2(this);
            realizado = true;
            Correr.start();
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
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new level2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
