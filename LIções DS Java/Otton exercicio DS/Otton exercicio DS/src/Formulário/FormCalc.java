package Formulário;

public class FormCalc extends javax.swing.JFrame {

    public FormCalc() {
        initComponents();
        Desabilitar();
    }
void Desabilitar () {
            txt_N1 . setEditable (false);
            txt_N2 . setEditable (false);
            txt_res . setEditable (false);
        }
void Habilitar() {
            txt_N1 . setEditable (true);
            txt_N2 . setEditable (true);
            txt_res . setEditable (true);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_N1 = new javax.swing.JTextField();
        txt_N2 = new javax.swing.JTextField();
        txt_res = new javax.swing.JTextField();
        btn_Soma = new javax.swing.JButton();
        btn_Sub = new javax.swing.JButton();
        btn_Mult = new javax.swing.JButton();
        btn_Div = new javax.swing.JButton();
        btn_Retornar = new javax.swing.JButton();
        btn_New = new javax.swing.JButton();
        btn_Clean = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        jLabel3.setText("Resultado");

        txt_N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_N1ActionPerformed(evt);
            }
        });

        btn_Soma.setText("+");
        btn_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SomaActionPerformed(evt);
            }
        });

        btn_Sub.setText("-");
        btn_Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubActionPerformed(evt);
            }
        });

        btn_Mult.setText("*");
        btn_Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultActionPerformed(evt);
            }
        });

        btn_Div.setText("/");
        btn_Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivActionPerformed(evt);
            }
        });

        btn_Retornar.setText("Retornar");
        btn_Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetornarActionPerformed(evt);
            }
        });

        btn_New.setText("Novo");
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });

        btn_Clean.setText("Limpar");
        btn_Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CleanActionPerformed(evt);
            }
        });

        btn_Exit.setText("Sair");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        jButton9.setText("Comparação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_N2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txt_N1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_New)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Clean)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Exit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Soma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Sub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Mult)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Div)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Retornar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Soma)
                    .addComponent(btn_Sub)
                    .addComponent(btn_Mult)
                    .addComponent(btn_Div)
                    .addComponent(btn_Retornar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_New)
                    .addComponent(btn_Clean)
                    .addComponent(btn_Exit)
                    .addComponent(jButton9))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SomaActionPerformed
// TODO add your handling code here:
 int x, y, z; // Variáveis de apoio    
 
 String r; // R string para receber valor


 x = Integer.parseInt( txt_N1.getText()); //Mesclando o Campo com a variável
 y = Integer.parseInt( txt_N2.getText());

 z= x + y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor
 
 
    }//GEN-LAST:event_btn_SomaActionPerformed

    private void btn_RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetornarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RetornarActionPerformed

    private void txt_N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_N1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_N1ActionPerformed

    private void btn_MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultActionPerformed
        // TODO add your handling code here:
int x, y, z; // Variáveis de apoio    
 
 String r; // R string para receber valor


 x = Integer.parseInt( txt_N1.getText()); //Mesclando o Campo com a variável
 y = Integer.parseInt( txt_N2.getText());

 z= x * y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_MultActionPerformed

    private void btn_DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivActionPerformed
int x, y, z; // Variáveis de apoio    
 
 String r; // R string para receber valor


 x = Integer.parseInt( txt_N1.getText()); //Mesclando o Campo com a variável
 y = Integer.parseInt( txt_N2.getText());

 z= x / y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_DivActionPerformed

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        Habilitar();
    }//GEN-LAST:event_btn_NewActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubActionPerformed
// TODO add your handling code here:
int x, y, z; // Variáveis de apoio
String r; // R string para receber valor


 x = Integer.parseInt( txt_N1.getText()); //Mesclando o Campo com a variável
 y = Integer.parseInt( txt_N2.getText());

 z= x - y;//operação
 r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

 txt_res.setText(r);// Camppo de resposta recebendo valor

 
    }//GEN-LAST:event_btn_SubActionPerformed

    private void btn_CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CleanActionPerformed
    txt_N1.setText("");
    txt_N2.setText("");
    txt_res.setText("");
    }//GEN-LAST:event_btn_CleanActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clean;
    private javax.swing.JButton btn_Div;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Mult;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Retornar;
    private javax.swing.JButton btn_Soma;
    private javax.swing.JButton btn_Sub;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_N1;
    private javax.swing.JTextField txt_N2;
    private javax.swing.JTextField txt_res;
    // End of variables declaration//GEN-END:variables
}
