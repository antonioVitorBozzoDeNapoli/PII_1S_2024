/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.tela.LoginTelaProfessor;
import br.PII_1_2024.tela.LoginTelaAluno;
import br.PII_1_2024.jogo.AudioCurto;
import br.PII_1_2024.jogo.AudioLoop;
import br.PII_1_2024.jogo.TelaFundoJogo;
import java.awt.BorderLayout;
import javax.swing.UIManager;

/**
 *
 * @author anton
 */
public class TelaDeInicio extends javax.swing.JFrame {
     private AudioCurto clipPlayer;
    /**
     * Creates new form TelaDeInicio
     */
    public TelaDeInicio() {
        initComponents();
        clipPlayer = new AudioCurto("src/main/resources/audio/botaoSound.mp3");
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } 
        catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/telaInicial.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(inicio);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        botaoProfessor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicio.setOpaque(false);

        botaoProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotaoProfessor.png"))); // NOI18N
        botaoProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoProfessorMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotaoAluno.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProfessorMouseClicked
        clipPlayer.playSound();
        new LoginTelaProfessor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoProfessorMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        clipPlayer.playSound();
        new LoginTelaAluno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AudioLoop player;
                player = new AudioLoop("src/main/resources/audio/musicaDeFundo.mp3");
                player.playLoop();
                new TelaDeInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoProfessor;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
