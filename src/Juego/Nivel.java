/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Font;


public class Nivel extends javax.swing.JFrame {  

    public Nivel() {
        initComponents();
        // setFont();
    }
    
    private void setFont() {
        // this.gota1.setFont(new Font("Machine Gunk", Font.BOLD, 20));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gota1 = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(706, 740));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gota1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        gota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/drop.png"))); // NOI18N
        gota1.setText("20");
        gota1.setToolTipText("");
        gota1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gota1.setFocusable(false);
        gota1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(gota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabelBackground.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/level1.jpg"))); // NOI18N
        jLabelBackground.setText("background");
        jLabelBackground.setMaximumSize(new java.awt.Dimension(700, 700));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(700, 700));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
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
    private javax.swing.JLabel gota1;
    private javax.swing.JLabel jLabelBackground;
    // End of variables declaration//GEN-END:variables
}