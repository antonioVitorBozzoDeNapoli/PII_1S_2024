/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.jogo.AudioCurto;
import br.PII_1_2024.jogo.TelaFundoJogo;
import java.awt.BorderLayout;

/**
 *
 * @author anton
 */

public class HUBAluno extends javax.swing.JFrame {
    private AudioCurto clipPlayer;
    private boolean isLoopPlaying = false;
    
    /**
     * Creates new form TelaInicial
     */
    public HUBAluno() {
        initComponents();
        // player.stop();
        clipPlayer = new AudioCurto("src/main/resources/audio/botaoSound.mp3");
        setLocationRelativeTo(null);
        setResizable(false);        
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/telaJogador.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(telaFundoJogador);
        this.pack();
    }
    
    //@Override;
    //public void setVisible(boolean visible) {
    //    super.setVisible(visible);
    //    if (visible && !isLoopPlaying) {
     //       player.playLoop();
     //       isLoopPlaying = true;
     //   } else if (!visible && isLoopPlaying) { // Alteração aqui
    //        player.stop();
    //        isLoopPlaying = false;
    //    }
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaFundoJogador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaFundoJogador.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoJogar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoSair.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaFundoJogadorLayout = new javax.swing.GroupLayout(telaFundoJogador);
        telaFundoJogador.setLayout(telaFundoJogadorLayout);
        telaFundoJogadorLayout.setHorizontalGroup(
            telaFundoJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaFundoJogadorLayout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addGroup(telaFundoJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        telaFundoJogadorLayout.setVerticalGroup(
            telaFundoJogadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaFundoJogadorLayout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaFundoJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaFundoJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        clipPlayer.playSound();
        new TelaMapa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        clipPlayer.playSound();
        new LoginTelaAluno().setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel telaFundoJogador;
    // End of variables declaration//GEN-END:variables
}
