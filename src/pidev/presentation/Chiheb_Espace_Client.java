/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.presentation;

import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.TableModel;
import pidev.dao.AnnonceDAO;
import pidev.dao.PersonneDAO;
import static pidev.presentation.AfficherAnnonceResponsable.id_Responsable;
import static pidev.presentation.GraphReaderExample.firstname;
import static pidev.presentation.GraphReaderExample.lastname;

/**
 *
 * @author chiheb
 */
public class Chiheb_Espace_Client extends javax.swing.JFrame {

    /**
     * Creates new form Chiheb_Espace_Client
     */
    public Chiheb_Espace_Client() {
        initComponents();
        this.setLocationRelativeTo(null);
       this.pack();
       num1.setVisible(false);
        this.getContentPane().setBackground(new Color(52, 152, 219));
//        if (Chiheb_Authentification.connecté==1){
//            jiconnecté1.setText(""+Chiheb_Authentification.id_connecté_normal);
//        //System.out.println(""+Chiheb_Authentification.id_connecté_normal);
//     }
         if (Chiheb_Authentification.connecté==1){
       jnconnecté.setText(firstname+" "+lastname);
  // jiconnecté1.setText(""+GraphReaderExample.idCC);
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

        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TfRech = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jnconnecté = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        details1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(233, 194, 175));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        details.setText("Afficher Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        tableau.setModel(new AfficherAnnonce());
        jScrollPane2.setViewportView(tableau);

        jButton2.setText("Recherche");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TfRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfRechActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pidev/presentation/recherche_icone.png"))); // NOI18N
        jLabel2.setText("recherche par mots- clés");

        jButton3.setText("Proposer un Offre");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Espace Client");

        jnconnecté.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jnconnecté.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Bienvenue :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Deconnexion");
        jButton1.setMaximumSize(new java.awt.Dimension(800, 700));
        jButton1.setMinimumSize(new java.awt.Dimension(800, 700));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        details1.setText("Afficher Details");
        details1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(details1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305)
                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(591, 591, 591)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jnconnecté)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TfRech, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(num1)
                        .addGap(4, 4, 4)
                        .addComponent(num2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnconnecté)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TfRech, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(details1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1)
                            .addComponent(num2)
                            .addComponent(num4)
                            .addComponent(num3))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 PersonneDAO psd = new PersonneDAO();
        psd.deconnexion(Chiheb_Authentification.id_connecté_normal);
        Chiheb_Accueil chacc = new Chiheb_Accueil();
        chacc.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new pikon_proposer_annonce_client().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TfRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfRechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfRechActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!TfRech.getText().equals("")){
                tableau.setModel(new AfficherAnnonce(TfRech.getText()));
        }
        else{
            showMessageDialog(this, "Vous devez ecrire quelque chose", "Attention", JOptionPane.INFORMATION_MESSAGE);  
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed

        int ligneSelectionne = tableau.getSelectedRow();
        if(ligneSelectionne!=-1){
        int id = Integer.parseInt(tableau.getValueAt(ligneSelectionne, 0).toString());
        new Detail_annonce((id)).setVisible(true);
         }
                else{ 
                   showMessageDialog(this, "Rien n'est selectionner", "Attention", JOptionPane.INFORMATION_MESSAGE);

                }
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        tableau.setModel(new AfficherAnnonce(20,30));
        num1.setVisible(true);
        num2.setVisible(true);
        num3.setVisible(false);
        num4.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        tableau.setModel(new AfficherAnnonce(30,40));
        num1.setVisible(true);
        num2.setVisible(true);
        num3.setVisible(true);
        num4.setVisible(false);
    }//GEN-LAST:event_num4ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        tableau.setModel(new AfficherAnnonce(10,20));
        num1.setVisible(true);
        num2.setVisible(false);
        num3.setVisible(true);
        num4.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_num2ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        tableau.setModel(new AfficherAnnonce(0,10));
        num1.setVisible(false);
        num2.setVisible(true);
        num3.setVisible(true);
        num4.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void details1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details1ActionPerformed

        int ligneSelectionne = tableau.getSelectedRow();
        if(ligneSelectionne!=-1){
            int id = Integer.parseInt(tableau.getValueAt(ligneSelectionne, 0).toString());
            new Detail_annonce((id)).setVisible(true);
        }
        else{
            showMessageDialog(this, "Rien n'est selectionner", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_details1ActionPerformed

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
            java.util.logging.Logger.getLogger(Chiheb_Espace_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Espace_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Espace_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Espace_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chiheb_Espace_Client().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfRech;
    private javax.swing.JButton details;
    private javax.swing.JButton details1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jnconnecté;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JTable tableau;
    // End of variables declaration//GEN-END:variables
}
