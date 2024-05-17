/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.PII_1_2024.jogo;

import br.PII_1_2024.db.AlunoFaseDAO;
import br.PII_1_2024.modelo.AlunoFase;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author anton
 */
public class FaseHospital extends javax.swing.JFrame {
    private static int alunoAtual = LoginTelaAluno.codigoAluno;
    private static AlunoFaseDAO dao = new AlunoFaseDAO();
    /**
     * Creates new form FaseHospital
     */
    public FaseHospital() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        TelaFundoJogo t = new
            TelaFundoJogo(getClass().getResource("/images/ImagemFundoHospital.png"));
        this.setContentPane(t);
        this.setLayout(new BorderLayout());
        t.add(hospital);
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

        hospital = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hospital.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botaoHospital.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hospitalLayout = new javax.swing.GroupLayout(hospital);
        hospital.setLayout(hospitalLayout);
        hospitalLayout.setHorizontalGroup(
            hospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalLayout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        hospitalLayout.setVerticalGroup(
            hospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        var jogoHospital = new JogoDaMemoria("hospital");
        jogoHospital.inicializarJogoMemoria(8, "hospital");
        jogoHospital.setVisible(true);
        jogoHospital.setJogoTerminadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long t = jogoHospital.getTempoTotal();
                int tempoFase = Math.toIntExact(t);
                new FaseHospital().setVisible(true);
                try{
                    AlunoFase alunoFase = new AlunoFase(5, alunoAtual, tempoFase);
                    dao.inserirAlunoFase(alunoFase);
                }
                catch(Exception ev){
                    ev.printStackTrace();
                }
                
            }
        });
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hospital;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
