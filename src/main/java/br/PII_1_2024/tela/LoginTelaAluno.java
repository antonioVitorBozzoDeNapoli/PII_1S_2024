 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.tela.HUBAluno;
import br.PII_1_2024.bd.AlunoDAO;
import br.PII_1_2024.jogo.AudioCurto;
import br.PII_1_2024.jogo.TelaFundoJogo;
import br.PII_1_2024.modelo.Aluno;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class LoginTelaAluno extends javax.swing.JFrame {
    private String nomeAluno;
    public static int codigoAluno;
    private AudioCurto clipPlayer;
    
    /**
     * Creates new form LoginTelaAluno
     */
    public LoginTelaAluno() {
        clipPlayer = new AudioCurto("src/main/resources/audio/botaoSound.mp3");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/telaLoginAluno.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(imagemFundoLogin);
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

        imagemFundoLogin = new javax.swing.JPanel();
        nomeTextField = new javax.swing.JTextField();
        entrarButton = new javax.swing.JLabel();
        voltarButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagemFundoLogin.setOpaque(false);

        nomeTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        entrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoEntrar.png"))); // NOI18N
        entrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarButtonMouseClicked(evt);
            }
        });

        voltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoVoltar.png"))); // NOI18N
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imagemFundoLoginLayout = new javax.swing.GroupLayout(imagemFundoLogin);
        imagemFundoLogin.setLayout(imagemFundoLoginLayout);
        imagemFundoLoginLayout.setHorizontalGroup(
            imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagemFundoLoginLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addGroup(imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagemFundoLoginLayout.setVerticalGroup(
            imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagemFundoLoginLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemFundoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemFundoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarButtonMouseClicked
        clipPlayer.playSound();
        try{
            
            var login = nomeTextField.getText();
            var aluno = new Aluno(login);
            aluno.setNome(login);
            var dao = new AlunoDAO();
            boolean alunoOk = dao.existe(aluno);
            if (alunoOk){
                codigoAluno = dao.obterCodigo(aluno);
                new HUBAluno().setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "USUÁRIO INVÁLIDO");
                nomeTextField.setText("");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog (null, "PROBLEMAS TÉCNICOS"
                    + ", TENTE NOVAMENTE MAIS TARDE");
            e.printStackTrace();
        }
    }//GEN-LAST:event_entrarButtonMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        clipPlayer.playSound();
        new TelaDeInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonMouseClicked
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel entrarButton;
    private javax.swing.JPanel imagemFundoLogin;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel voltarButton;
    // End of variables declaration//GEN-END:variables
}
