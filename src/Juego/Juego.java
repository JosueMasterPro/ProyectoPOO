
package Juego;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {
    public static int x , y;
    int MaxNumber=50;
    Random Aleatorio=new Random();
    int A1=Aleatorio.nextInt(MaxNumber);
    int A2=Aleatorio.nextInt(MaxNumber);
    int A3=Aleatorio.nextInt(3)+1;
    int Puntos=0;
    boolean Realizado=false;
    
    int Resultado(int Resultado){
        return Resultado;
    }
    void botones(int A3,int Resultado){
        switch(A3){
                        case 1: 
                            GotaLabel.setText(String.valueOf(Resultado));
                            GotaLabel1.setText(String.valueOf(Resultado+10));
                            GotaLabel2.setText(String.valueOf(Resultado-10));
                            GotaLabel3.setText(String.valueOf(Resultado-5));
                            
                            break;
                        case 2: 
                            GotaLabel1.setText(String.valueOf(Resultado));
                            GotaLabel.setText(String.valueOf(Resultado+10));
                            GotaLabel2.setText(String.valueOf(Resultado-10));
                            GotaLabel3.setText(String.valueOf(Resultado-5));
                            break;
                        case 3: 
                            GotaLabel3.setText(String.valueOf(Resultado));
                            GotaLabel.setText(String.valueOf(Resultado+10));
                            GotaLabel2.setText(String.valueOf(Resultado-10));
                            GotaLabel3.setText(String.valueOf(Resultado-5));
                            break;
                        case 4: 
                            GotaLabel2.setText(String.valueOf(Resultado));
                            GotaLabel.setText(String.valueOf(Resultado+10));
                            GotaLabel3.setText(String.valueOf(Resultado-10));
                            GotaLabel1.setText(String.valueOf(Resultado-5));
                            break;
                    }
    }
    
   
    public Juego() {
        setTitle("Rainy Math");
        initComponents();
        ImageIcon Fondo=new ImageIcon(getClass().getResource("/Texetura/NUBES1.jpg"));
        ImageIcon icono=new ImageIcon(Fondo.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        
        ImageIcon Cubeta=new ImageIcon(getClass().getResource("/Texetura/Cubeta.png"));
        ImageIcon iconon=new ImageIcon(Cubeta.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(iconon);
        LabelRespuesta.setVisible(false);
        jLabel2.setLocation(250, 350);
       /* new Thread(){
            
            public void run(){
                jLabel2.setText(String.valueOf(A1)+" + " + String.valueOf(A2));
                int Gotax=GotaLabel.getX();
                int Gota1x=GotaLabel1.getX();
                int Gota2x=GotaLabel2.getX();
                int Gota3x=GotaLabel3.getX();
                int y=1;
                LabelPuntaje.setText(String.valueOf(Puntos));
                LabelRespuesta.setText(String.valueOf(A3));
                while(true){
                    int Resultado;
                    Resultado=A1+A2;
                    botones(A3,Resultado);
                    y=y+4;
                    if(y>=400){
                       y=1; 
                       Aleatorio();
                    }
                    
                    if(Integer.valueOf(LabelRespuesta.getText())==Resultado){
                        Puntos++;
                        LabelPuntaje.setText(String.valueOf(Puntos));
                        LabelRespuesta.setText("0");
                        y=1;
                        Aleatorio();
                   }
                   if(Funcion()==true){
                       if(Integer.valueOf(GotaLabel.getText())==Resultado){
                            Puntos++;
                       }
                   } 
                    GotaLabel.setLocation(Gotax, y);
                    GotaLabel1.setLocation(Gota1x, y);
                    GotaLabel2.setLocation(Gota2x, y);
                    GotaLabel3.setLocation(Gota3x, y);
                    try {
                        sleep(150);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
        }.start();*/
        
    }

    public void Respuesta(String x){
            LabelRespuesta.setText(x);
        }
    
    public boolean Funcion(){
        if(GotaLabel.getY()-5>=jLabel2.getY() ||
                GotaLabel.getY()<=jLabel2.getY() ||
                GotaLabel.getX()+20<=jLabel2.getX() ||
                GotaLabel.getX()>=jLabel2.getX()) {
            return true;
        }
        else{
            return false;
        }
        
    }
    //Funciones para la clase JuegoMain
    int Gotalabel(){
        return GotaLabel.getX();
    }
    int Gotalabel1(){
        return GotaLabel1.getX();
    }
    int Gotalabel2(){
        return GotaLabel2.getX();
    }
    int Gotalabel3(){
        return GotaLabel3.getX();
    }
    void EnterText(int x,String Texto){
        //Los valores estan escritos en la clase JuegoMain xD
        if(x==1){
            jLabel1.setText(Texto);
        }
        if(x==2){
        jLabel2.setText(Texto);
        }
        if(x==3){
             LabelPuntaje.setText(Texto);
        }
        if(x==4){
            LabelRespuesta.setText(Texto);
        }
    }
    String getText(int Valor){
       if(x==1){
        return GotaLabel.getText();   
       }
       /*if(x==2){
           return "";
       }
       if(x==3){
           return "";
       }*/
       else {
           return LabelRespuesta.getText();
       }
       
    }
    void Location(int Gota,int PosX,int PosY){
        if(Gota==1){
            GotaLabel.setLocation(PosX, PosY);
        }
        if(Gota==2){
        GotaLabel1.setLocation(PosX, PosY);
        }
        if(Gota==3){
        GotaLabel2.setLocation(PosX, PosY);    
        }
        if(Gota==4){
        GotaLabel3.setLocation(PosX, PosY);    
        }
    }
    
    //fin de funciones
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        GotaLabel = new javax.swing.JLabel();
        GotaLabel1 = new javax.swing.JLabel();
        GotaLabel2 = new javax.swing.JLabel();
        GotaLabel3 = new javax.swing.JLabel();
        LabelPuntaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelRespuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(709, 730));
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/Cubeta.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 160, 150));

        GotaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/GOTITA2.png"))); // NOI18N
        GotaLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GotaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 129, -1));

        GotaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/GOTITA2.png"))); // NOI18N
        GotaLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GotaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 129, -1));

        GotaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/GOTITA2.png"))); // NOI18N
        GotaLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GotaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 129, -1));

        GotaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/GOTITA2.png"))); // NOI18N
        GotaLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(GotaLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 129, -1));

        LabelPuntaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(LabelPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 80, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Texetura/level1.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));
        getContentPane().add(LabelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 144, 34, 26));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_A){
            if(jLabel2.getX()>=1){
            x=jLabel2.getX();
            x=x-5;
            jLabel2.setLocation(x, 500);
           }
        }
        if(evt.getKeyCode()==KeyEvent.VK_D){
            if(jLabel2.getX()<=519){
            x=jLabel2.getX();
            x=x+5;
            jLabel2.setLocation(x, 500);
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if(Realizado==false){
            JuegoMain Clase=new JuegoMain();
            Realizado=true;
            Clase.start();
            Clase.Juego=this;
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GotaLabel;
    private javax.swing.JLabel GotaLabel1;
    private javax.swing.JLabel GotaLabel2;
    private javax.swing.JLabel GotaLabel3;
    private javax.swing.JLabel LabelPuntaje;
    private javax.swing.JLabel LabelRespuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
