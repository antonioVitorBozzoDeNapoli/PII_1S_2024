/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.jogo;

/**
 *
 * @author anton
 */
import br.PII_1_2024.db.UsuarioDAO;
import br.PII_1_2024.modelo.Usuario;
import java.awt.BorderLayout;
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        initComponents();
        setLocationRelativeTo(null);       
        TelaFundoJogo login = new
            TelaFundoJogo(getClass().getResource(""));
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

        cancelarButton.setText("Cancelar");

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
                        .addGap(287, 287, 287)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addGroup(imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 462, Short.MAX_VALUE))
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addGap(517, 517, 517)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagemFundoLoginLayout.setVerticalGroup(
            imagemFundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagemFundoLoginLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
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
        dispose();
        try{
            var login = loginTextField.getText();
            var senha = new String(passwordTextField.getPassword());
            var usuario = new Usuario();
            usuario.setLogin(login);
            usuario.setSenha(senha);
            var dao = new UsuarioDAO();
            if(dao.existe(usuario)){

            }
            else{

            }
        }
        catch(Exception e){
            
        }
        new HUBJogador().setVisible(true);
    }//GEN-LAST:event_entrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JPanel imagemFundoLogin;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}