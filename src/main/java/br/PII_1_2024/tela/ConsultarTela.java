/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.bd.FaseDAO;
import br.PII_1_2024.bd.TurmaDAO;
import br.PII_1_2024.jogo.TelaFundoJogo;
import br.PII_1_2024.modelo.Fase;
import br.PII_1_2024.modelo.Turma;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class ConsultarTela extends javax.swing.JFrame {
    Turma turma;
    Fase fase;
    /**
     * Creates new form consultarTela
     */
    public ConsultarTela() {
        initComponents();
        buscarTurmas();
        buscarFases();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/TelaInicio.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(fundo);
        this.pack();
    }
    
    private void buscarTurmas (){
        try{
            var dao = new TurmaDAO();
            Turma [] turmas = dao.obterTurma();
            turmasComboBox.setModel(new DefaultComboBoxModel<>(turmas));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "turmas indisponíveis, tente"
                    + "novamente mais tarde.");
            e.printStackTrace();
        }
    }
    private void buscarFases (){
        try{
            var dao = new FaseDAO();
            Fase [] fases = dao.obterFase();
            fasesComboBox.setModel(new DefaultComboBoxModel<>(fases));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Fases indisponíveis, tente"
                    + "novamente mais tarde.");
            e.printStackTrace();
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

        fundo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fasesComboBox = new javax.swing.JComboBox<>();
        turmasComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setOpaque(false);

        jButton1.setText("consultar tempo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fasesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasesComboBoxActionPerformed(evt);
            }
        });

        turmasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turmasComboBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(turmasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(fasesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 336, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turmasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fasesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void turmasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turmasComboBoxActionPerformed
        turma = (Turma) turmasComboBox.getSelectedItem();
    }//GEN-LAST:event_turmasComboBoxActionPerformed

    private void fasesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasesComboBoxActionPerformed
        fase = (Fase) fasesComboBox.getSelectedItem();
    }//GEN-LAST:event_fasesComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaRanking rank = new TelaRanking(this.turma, this.fase);
        rank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new HUBProfessor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Fase> fasesComboBox;
    private javax.swing.JPanel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Turma> turmasComboBox;
    // End of variables declaration//GEN-END:variables
}