/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoadivinhe;

import javax.swing.JOptionPane;


public class JogoAdivinhe2 extends javax.swing.JFrame {

  
    public JogoAdivinhe2() {
        initComponents();
    }
    int resp, sorteio, tentativa, quant;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lJogador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lTentativas = new javax.swing.JLabel();
        sNumero = new javax.swing.JSpinner();
        jToolBar1 = new javax.swing.JToolBar();
        bIniciar = new javax.swing.JButton();
        bJogador = new javax.swing.JButton();
        bNovoJogo = new javax.swing.JButton();
        bVerificar = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagem1.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("JOGADOR:");

        lJogador.setText("XXXXXXX");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("TENTATIVAS:");

        lTentativas.setText("000");

        sNumero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sNumero.setEnabled(false);

        jToolBar1.setRollover(true);

        bIniciar.setText("INICIAR");
        bIniciar.setFocusable(false);
        bIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bIniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });
        jToolBar1.add(bIniciar);

        bJogador.setText("JOGADOR");
        bJogador.setEnabled(false);
        bJogador.setFocusable(false);
        bJogador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bJogador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJogadorActionPerformed(evt);
            }
        });
        jToolBar1.add(bJogador);

        bNovoJogo.setText("NOVO JOGO");
        bNovoJogo.setEnabled(false);
        bNovoJogo.setFocusable(false);
        bNovoJogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bNovoJogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoJogoActionPerformed(evt);
            }
        });
        jToolBar1.add(bNovoJogo);

        bVerificar.setText("VERIFICAR");
        bVerificar.setEnabled(false);
        bVerificar.setFocusable(false);
        bVerificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVerificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bVerificar);

        bFechar.setText("FECHAR");
        bFechar.setFocusable(false);
        bFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bFechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bFechar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lJogador))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lTentativas))
                            .addComponent(sNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addComponent(jLabel2)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lJogador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lTentativas))
                        .addGap(37, 37, 37)
                        .addComponent(sNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
     lJogador.setText(JOptionPane.showInputDialog(null, "Digite o nome do Jogador", "Nome Jogador", JOptionPane.INFORMATION_MESSAGE));
     sorteio = (int)(Math.random()*100);
     bIniciar.setEnabled(false);
     bJogador.setEnabled(true);
     bNovoJogo.setEnabled(true);
     bVerificar.setEnabled(true);
     sNumero.setEnabled(true);
   
      
    }//GEN-LAST:event_bIniciarActionPerformed

    private void bJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJogadorActionPerformed
         lJogador.setText(JOptionPane.showInputDialog(null, "Digite o nome do Jogador", "Nome Jogador", JOptionPane.INFORMATION_MESSAGE));
    }//GEN-LAST:event_bJogadorActionPerformed

    private void bNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoJogoActionPerformed
      resp = JOptionPane.showConfirmDialog(null, "Deseja mudar o nome do Jogador", "Nome Jogador", JOptionPane.YES_NO_OPTION);
      
      if (resp == 0 ){
          lJogador.setText(JOptionPane.showInputDialog(null, "Digite o nome do jogador", "Nome Jogador", JOptionPane.INFORMATION_MESSAGE));
            sorteio = (int)(Math.random()*100); 
            bJogador.setEnabled(true);    
            bVerificar.setEnabled(true);
            sNumero.setEnabled(true);    
      }else{
            sorteio = (int)(Math.random()*100);
            bJogador.setEnabled(true);    
            bVerificar.setEnabled(true);
            sNumero.setEnabled(true);  
      }
    }//GEN-LAST:event_bNovoJogoActionPerformed

    private void bVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificarActionPerformed
        quant++;
        lTentativas.setText(String.valueOf(quant));
        tentativa = sNumero.getValue().hashCode();
        
        if(sorteio > tentativa){
            JOptionPane.showMessageDialog(null, "Tente um numero maior");
        } if(sorteio < tentativa){
            JOptionPane.showMessageDialog(null, "Tente um numero menor");
        } if(sorteio == tentativa){
            JOptionPane.showMessageDialog(null, "Parabéns, voce acertou!");
            
            resp = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "FECHAR", JOptionPane.YES_NO_OPTION);
            quant = 0;
            if (resp == 0){
                System.exit(0);
            }else{
                bJogador.setEnabled(false);
                bVerificar.setEnabled(false);
                sNumero.setEnabled(false);
                bNovoJogo.setEnabled(true);
                tentativa = 0;
                lTentativas.setText(String.valueOf("000"));
            }
        }
    }//GEN-LAST:event_bVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoAdivinhe2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bJogador;
    private javax.swing.JButton bNovoJogo;
    private javax.swing.JButton bVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lJogador;
    private javax.swing.JLabel lTentativas;
    private javax.swing.JSpinner sNumero;
    // End of variables declaration//GEN-END:variables
}
