/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Telas.TelaMapa;
import br.PII_1_2024.jogo.TelaFundoJogo;
import java.awt.BorderLayout;

/**
 *
 * @author anton
 */
public class TelaParabens extends javax.swing.JFrame {

    /**
     * Creates new form TelaParabéns
     * @param tempoCompletado
     */
    public TelaParabens(int tempoCompletado) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/telaParabens.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(fundo);
        this.pack();
        textoParabens.setText(tempoCompletado + " segundos!!!");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        textoParabens = new javax.swing.JLabel();
        continuarButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setOpaque(false);

        textoParabens.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        textoParabens.setForeground(new java.awt.Color(232, 232, 232));

        continuarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/continuarButton.png"))); // NOI18N
        continuarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoParabens, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addComponent(continuarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addGap(204, 204, 204))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(textoParabens, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(continuarButton)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarButtonMouseClicked
        new TelaMapa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarButtonMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel continuarButton;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel textoParabens;
    // End of variables declaration//GEN-END:variables
}
