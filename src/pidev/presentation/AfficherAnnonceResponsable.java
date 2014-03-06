/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.presentation;

import java.util.List;
import javax.swing.ImageIcon;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;

/**
 *
 * @author Eya
 */
public class AfficherAnnonceResponsable extends javax.swing.JFrame {
AnnonceDAO aDAO = new AnnonceDAO();
List<Annonce> annonces;
static int id_Responsable =Chiheb_Authentification.id_connecté_normal; 
    /**
     * Creates new form AfficherAnnonceResponsable
     */
   
    public AfficherAnnonceResponsable() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSupp = new javax.swing.JButton();
        BtnRetour = new javax.swing.JButton();
        TfRech = new javax.swing.JTextField();
        detaiBtn = new javax.swing.JButton();
        jBtnModifier = new javax.swing.JButton();
        BtnRech = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mes annonces ");

        jTable1.setModel(new Affiche_Annonce_Responsable(id_Responsable));
        jScrollPane1.setViewportView(jTable1);

        btnSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppActionPerformed(evt);
            }
        });

        BtnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetourActionPerformed(evt);
            }
        });

        TfRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfRechActionPerformed(evt);
            }
        });

        detaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detaiBtnActionPerformed(evt);
            }
        });

        jBtnModifier.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eya\\Documents\\NetBeansProjects\\PIdev\\src\\image\\modifi.jpg")); // NOI18N
        jBtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModifierActionPerformed(evt);
            }
        });

        BtnRech.setText("Rechercher");
        BtnRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(detaiBtn)
                                    .addComponent(jBtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(TfRech, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BtnRech)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(TfRech, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRech, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jBtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(BtnRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppActionPerformed
        int ligneSelectionne = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(ligneSelectionne, 0).toString());

        AnnonceDAO aDAO = new AnnonceDAO();
        System.out.println("on va effectuer la suppression ");
        if (aDAO.deleteAnnonce(id)) {
            System.out.println("suppression effectuée");
            jTable1.setModel(new Affiche_Annonce_Responsable());
        } else {
            System.out.println("supp nn effectuée");
        }
    }//GEN-LAST:event_btnSuppActionPerformed

    private void TfRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfRechActionPerformed
        AnnonceDAO aDAO = new AnnonceDAO();
        String contenu = TfRech.getText().toString();
        //aDAO.rech(contenu);

    }//GEN-LAST:event_TfRechActionPerformed

    private void jBtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModifierActionPerformed
        int ligneSelectionne = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(ligneSelectionne, 0).toString());

        System.out.println("on va effectuer la modification ");
        new ModifierAnnonce_Responsable(id).setVisible(true);
//        if (aDAO.modifierAnnonce(id)) {
//            System.out.println("mod effectuée");
//            jTable1.setModel(new Affiche_Annonce_Responsable());
//        } else {
//            System.out.println("mod nn effectuée");
//        }
    }//GEN-LAST:event_jBtnModifierActionPerformed

    private void BtnRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRechActionPerformed
             
        Affiche_Annonce_Responsable a=new Affiche_Annonce_Responsable();
        
        
        a.annonces=aDAO.rech(TfRech.getText().toString(),id_Responsable);
        jTable1.setModel(a);
        System.out.println("on va effectuer la recherche ");
            
           //jTable1.setModel(new Affiche_Annonce_Responsable());
        
    }//GEN-LAST:event_BtnRechActionPerformed

    private void detaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detaiBtnActionPerformed
//       int ligneSelectionne = jTable1.getSelectedRow();
//        int id = Integer.parseInt(jTable1.getValueAt(ligneSelectionne, 0).toString());
//        new Detail_annonce(id).setVisible(true);

    }//GEN-LAST:event_detaiBtnActionPerformed

    private void BtnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetourActionPerformed
        this.dispose();
        new Chiheb_Espace_Responsable().setVisible(true);
    }//GEN-LAST:event_BtnRetourActionPerformed

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
            java.util.logging.Logger.getLogger(AfficherAnnonceResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherAnnonceResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherAnnonceResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherAnnonceResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherAnnonceResponsable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRech;
    private javax.swing.JButton BtnRetour;
    private javax.swing.JTextField TfRech;
    private javax.swing.JButton btnSupp;
    private javax.swing.JButton detaiBtn;
    private javax.swing.JButton jBtnModifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
