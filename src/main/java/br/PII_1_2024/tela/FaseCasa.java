/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.tela;

import br.PII_1_2024.bd.AlunoFaseDAO;
import br.PII_1_2024.jogo.AudioCurto;
import br.PII_1_2024.jogo.JogoDaMemoria;
import br.PII_1_2024.jogo.TelaFundoJogo;
import br.PII_1_2024.modelo.AlunoFase;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author anton
 */
public class FaseCasa extends javax.swing.JFrame {     
    private AudioCurto clipPlayer;
    private static int alunoAtual = LoginTelaAluno.codigoAluno;
    private static AlunoFaseDAO dao = new AlunoFaseDAO();
    
           
    /**
     * Creates new form FaseCasa
     */
    public FaseCasa() {
        initComponents();
        clipPlayer = new AudioCurto("src/main/resources/audio/botaoSound.mp3");
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/ImagemFundoCasa.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(telaFundoCasa);
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

        telaFundoCasa = new javax.swing.JPanel();
        iniciarQuarto = new javax.swing.JLabel();
        iniciarSala = new javax.swing.JLabel();
        iniciarBanheiro = new javax.swing.JLabel();
        iniciarCozinha = new javax.swing.JLabel();
        voltarButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaFundoCasa.setOpaque(false);
        telaFundoCasa.setPreferredSize(new java.awt.Dimension(1280, 718));

        iniciarQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoQuarto.png"))); // NOI18N
        iniciarQuarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarQuartoMouseClicked(evt);
            }
        });

        iniciarSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoSala.png"))); // NOI18N
        iniciarSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSalaMouseClicked(evt);
            }
        });

        iniciarBanheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoBanheiro.png"))); // NOI18N
        iniciarBanheiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarBanheiroMouseClicked(evt);
            }
        });

        iniciarCozinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoCozinha.png"))); // NOI18N
        iniciarCozinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarCozinhaMouseClicked(evt);
            }
        });

        voltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoVoltar.png"))); // NOI18N
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout telaFundoCasaLayout = new javax.swing.GroupLayout(telaFundoCasa);
        telaFundoCasa.setLayout(telaFundoCasaLayout);
        telaFundoCasaLayout.setHorizontalGroup(
            telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaFundoCasaLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addGroup(telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarQuarto)
                    .addComponent(iniciarBanheiro))
                .addGap(216, 216, 216)
                .addGroup(telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniciarSala)
                    .addComponent(iniciarCozinha))
                .addGap(156, 156, 156))
            .addGroup(telaFundoCasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaFundoCasaLayout.setVerticalGroup(
            telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaFundoCasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniciarBanheiro)
                    .addComponent(iniciarCozinha))
                .addGap(126, 126, 126)
                .addGroup(telaFundoCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaFundoCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaFundoCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBanheiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarBanheiroMouseClicked
        clipPlayer.playSound();
        dispose();
        var jogoBanheiro = new JogoDaMemoria("banheiro","imagemBanheiro.png");
        jogoBanheiro.inicializarJogoMemoria(8, "banheiro");
        jogoBanheiro.setVisible(true);
        jogoBanheiro.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoBanheiro.getTempoTotal();
                int tempoFase = Math.toIntExact(t);
                try{
                    AlunoFase alunoFase = new AlunoFase(9, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                var p = new TelaParabens(tempoFase);
                p.setVisible(true);
                jogoBanheiro.dispose();
            }
        });
    }//GEN-LAST:event_iniciarBanheiroMouseClicked

    private void iniciarCozinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarCozinhaMouseClicked
        clipPlayer.playSound();
        dispose();
        var jogoCozinha = new JogoDaMemoria("cozinha","imagemCozinha.png");
        jogoCozinha.inicializarJogoMemoria(8, "cozinha");
        jogoCozinha.setVisible(true);
        jogoCozinha.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoCozinha.getTempoTotal();
                int tempoFase = Math.toIntExact(t);
                try{
                    AlunoFase alunoFase = new AlunoFase(6, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                var p = new TelaParabens(tempoFase);
                p.setVisible(true);
                jogoCozinha.dispose();
                
            }
        });
    }//GEN-LAST:event_iniciarCozinhaMouseClicked

    private void iniciarQuartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarQuartoMouseClicked
        clipPlayer.playSound();
        dispose();
        var jogoQuarto = new JogoDaMemoria("quarto", "imagemQuarto.png");
        jogoQuarto.inicializarJogoMemoria(8, "quarto");
        jogoQuarto.setVisible(true);
        jogoQuarto.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoQuarto.getTempoTotal();
                int tempoFase = Math.toIntExact(t);
                try{
                    AlunoFase alunoFase = new AlunoFase(8, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                var p = new TelaParabens(tempoFase);
                p.setVisible(true);
                jogoQuarto.dispose();
                
            }
        });
    }//GEN-LAST:event_iniciarQuartoMouseClicked

    private void iniciarSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSalaMouseClicked
        clipPlayer.playSound();
        this.dispose();
        var jogoSala = new JogoDaMemoria("sala", "imagemSala.png");
        jogoSala.inicializarJogoMemoria(8, "sala");
        jogoSala.setVisible(true);
        jogoSala.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoSala.getTempoTotal();
                int tempoFase = Math.toIntExact(t);            
                try{
                    AlunoFase alunoFase = new AlunoFase(7, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                var p = new TelaParabens(tempoFase);
                p.setVisible(true);
                jogoSala.dispose();
                
            }
        });
    }//GEN-LAST:event_iniciarSalaMouseClicked

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        clipPlayer.playSound();
        new TelaMapa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iniciarBanheiro;
    private javax.swing.JLabel iniciarCozinha;
    private javax.swing.JLabel iniciarQuarto;
    private javax.swing.JLabel iniciarSala;
    private javax.swing.JPanel telaFundoCasa;
    private javax.swing.JLabel voltarButton;
    // End of variables declaration//GEN-END:variables
}