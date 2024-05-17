/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.jogo;

/**
 *
 * @author anton
 */
import br.PII_1_2024.db.ProfessorDAO;
import br.PII_1_2024.modelo.Professor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
public class LoginTelaProfessor extends javax.swing.JFrame {
    private String nomeProfessor;
    public static int codigoProfessor;
    /**
     * Creates new form LoginTela
     */
    public LoginTelaProfessor() {
        initComponents();
        setLocationRelativeTo(null);       
        TelaFundoJogo login = new
            TelaFundoJogo(getClass().getResource("/images/telaLoginProfessor.png"));
        this.setContentPane(login);
        this.setLayout(new BorderLayout());
        // Certifique-se de que todos os componentes são adicionados ao painel da imagem
        login.add(imagemFundoLogin);
        // Certifique-se de que a janela está corretamente dimensionada
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
        passwordTextField = new javax.swing.JPasswordField();
        loginTextField = new javax.swing.JTextField();
        cancelarButton = new javax.swing.JButton();
        entrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagemFundoLogin.setOpaque(false);

        cancelarButton.setText("Voltar");

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagemFundoLoginLayout = new javax.swing.GroupLayout(imagemFundoLogin);
        imagemFundoLogin.setLayout(imagemFundoLoginLayout);
        imagemFundoLoginLayout.setHorizontalGroup(
            imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addGroup(imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 503, Short.MAX_VALUE))
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagemFundoLoginLayout.setVerticalGroup(
            imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
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

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed

        try{
            
            var login = loginTextField.getText();
            var senha = new String(passwordTextField.getPassword());
            var professor = new Professor(login, senha);
            professor.setNome(login);
            professor.setSenha(senha);
            var dao = new ProfessorDAO();
            if (dao.existe(professor)){
                JOptionPane.showMessageDialog (null, "Bem vindo, " +
                professor.getNome() + "!");
                codigoProfessor = dao.obterCodigo(professor);
                new HUBProfessor().setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário inválido");
                loginTextField.setText("");
                passwordTextField.setText("");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog (null, "Problemas técnicos. Tente "
                    + "novamente mais tarde");
            e.printStackTrace();
            }
    }//GEN-LAST:event_entrarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JPanel imagemFundoLogin;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
