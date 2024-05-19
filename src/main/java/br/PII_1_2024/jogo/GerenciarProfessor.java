/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.jogo;

import br.PII_1_2024.db.ProfessorDAO;
import br.PII_1_2024.modelo.Professor;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class GerenciarProfessor extends javax.swing.JFrame {
   
    /**
     * Creates new form GerenciarProfessor
     */
    public GerenciarProfessor() {
        initComponents();
        buscarProfessores();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/TelaInicio.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(fundo);
        this.pack();
    }
    
    private void buscarProfessores (){
    try{
        var dao = new ProfessorDAO();
        Professor [] professores = dao.obterProfessor();
        professoresComboBox.setModel(new DefaultComboBoxModel<>(professores));
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "professores indisponíveis, tente"
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
        jPanel2 = new javax.swing.JPanel();
        codigoProfessorTextField = new javax.swing.JTextField();
        nomeProfessorTextField = new javax.swing.JTextField();
        senhaProfessorTextField = new javax.swing.JTextField();
        NovoProfessorButton = new javax.swing.JButton();
        RemoverButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        professoresComboBox = new javax.swing.JComboBox<>();
        atualizarSenhaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setOpaque(false);

        jPanel2.setOpaque(false);

        codigoProfessorTextField.setEditable(false);
        codigoProfessorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("codigo do professor"));
        codigoProfessorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProfessorTextFieldActionPerformed(evt);
            }
        });

        nomeProfessorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("professor"));

        senhaProfessorTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("senha"));

        NovoProfessorButton.setText("Novo Professor");
        NovoProfessorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoProfessorButtonActionPerformed(evt);
            }
        });

        RemoverButton.setText("Remover");
        RemoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        professoresComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professoresComboBoxActionPerformed(evt);
            }
        });

        atualizarSenhaButton.setText("Atualize seu cadastro");
        atualizarSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarSenhaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atualizarSenhaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(professoresComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoProfessorTextField)
                    .addComponent(nomeProfessorTextField)
                    .addComponent(senhaProfessorTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NovoProfessorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RemoverButton, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(LimparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(professoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codigoProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(nomeProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(senhaProfessorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovoProfessorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(LimparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(atualizarSenhaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
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

    private void codigoProfessorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProfessorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProfessorTextFieldActionPerformed

    private void NovoProfessorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoProfessorButtonActionPerformed
        String nomeProfessor = nomeProfessorTextField.getText();
        String senhaProfessor = senhaProfessorTextField.getText();
        if (nomeProfessor == null || nomeProfessor.length() == 0
                && senhaProfessor == null || senhaProfessor.length() == 0){
            JOptionPane.showMessageDialog (null, "Preencha o nome da turma");
        }
        else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro "
                        + "de novo professor?");
                if (escolha == JOptionPane.YES_OPTION){
                    Professor p = new Professor (nomeProfessor, senhaProfessor);
                    ProfessorDAO dao = new ProfessorDAO();
                    dao.inserirProfessor(p);
                    JOptionPane.showMessageDialog(null, "Professor cadastrado com "
                            + "sucesso");
                    nomeProfessorTextField.setText("");
                    senhaProfessorTextField.setText("");
                    buscarProfessores();
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_NovoProfessorButtonActionPerformed

    private void RemoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtonActionPerformed
        String codigoProfessor = codigoProfessorTextField.getText();
        String nomeProfessor = nomeProfessorTextField.getText();
        String senhaProfessor = senhaProfessorTextField.getText();
        if (nomeProfessor == null || nomeProfessor.length() == 0 
                && codigoProfessor == null || codigoProfessor.length() == 0 ){
            
            JOptionPane.showMessageDialog(null, "ERRO. SELECIONE UM PROFESSOR");
        }
        else{
            int escolha = JOptionPane.showConfirmDialog(null, "Remover professor?");
            if (escolha == JOptionPane.YES_OPTION){
                try{
                    int codigo = Integer.parseInt(codigoProfessorTextField.getText());
                    Professor p = new Professor (codigo);
                    ProfessorDAO dao = new ProfessorDAO();
                    dao.removerProfessor(p);
                    JOptionPane.showMessageDialog(null, "professor removido "
                            + "com sucesso!");
                    buscarProfessores();
                    nomeProfessorTextField.setText("");
                    codigoProfessorTextField.setText("");
                    senhaProfessorTextField.setText("");
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Falha técnica."
                            + " Tente novamente mais tarde.");
                e.printStackTrace();
                }
        }
        }
    }//GEN-LAST:event_RemoverButtonActionPerformed

    private void professoresComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professoresComboBoxActionPerformed
        Professor professor = (Professor) professoresComboBox.getSelectedItem();
        nomeProfessorTextField.setText(professor.getNome());
        codigoProfessorTextField.setText(Integer.toString(professor.getCodigo()));
    }//GEN-LAST:event_professoresComboBoxActionPerformed

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        nomeProfessorTextField.setText("");
        codigoProfessorTextField.setText("");
        senhaProfessorTextField.setText("");
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        new HUBProfessor().setVisible(true);
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void atualizarSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarSenhaButtonActionPerformed
        new AtualizarProfessorTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atualizarSenhaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton NovoProfessorButton;
    private javax.swing.JButton RemoverButton;
    private javax.swing.JButton atualizarSenhaButton;
    private javax.swing.JTextField codigoProfessorTextField;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeProfessorTextField;
    private javax.swing.JComboBox<Professor> professoresComboBox;
    private javax.swing.JTextField senhaProfessorTextField;
    // End of variables declaration//GEN-END:variables
}
