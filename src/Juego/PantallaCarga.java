
package Juego;

import java.applet.AudioClip;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PantallaCarga extends javax.swing.JFrame {
    private boolean Realizado=false;
    public PantallaCarga() {
        initComponents();
        PantallaCarga.this.getRootPane().setOpaque(false);
        PantallaCarga.this.getContentPane().setBackground(new Color(0,0,0,0));
        PantallaCarga.this.setBackground(new Color(0,0,0,0));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }
    
    void IngresarTxt(String x){
        Label1.setText(x);
    }
    void Barra(int x){
        Barra.setValue(x);
        repaint();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(238, 23, 30));
        getContentPane().add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 320, 30));
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 340, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/giphy.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(Realizado==false){
            Carga Ejecutar=new Carga();
            Realizado=true;
            Barra.setMaximum(50);
            Barra.setMinimum(0);
            Barra.setStringPainted(true);
            Ejecutar.start();
            Ejecutar.Pantalla=this;
        }
    }//GEN-LAST:event_formWindowActivated

    
    
    
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
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCarga().setVisible(true);
            }
        });
    }



    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
