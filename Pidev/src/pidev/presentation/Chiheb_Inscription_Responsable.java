/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.presentation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pidev.dao.AgenceDAO;
import pidev.dao.PersonneDAO;
import pidev.dao.ResponsableDAO;
import pidev.entities.Agence;
import pidev.entities.Personne;
import pidev.util.MyConnection;

/**
 *
 * @author chiheb
 */
public class Chiheb_Inscription_Responsable extends javax.swing.JFrame {

    /**
     * Creates new form Inscrption
     */
    public Chiheb_Inscription_Responsable() {
        initComponents();
         this.setLocationRelativeTo(null);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnomres = new javax.swing.JTextField();
        jprenomres = new javax.swing.JTextField();
        jcinres = new javax.swing.JTextField();
        jemailres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jnomage = new javax.swing.JTextField();
        jaddrage = new javax.swing.JTextField();
        jvilleage = new javax.swing.JTextField();
        jtelage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtelres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpassres = new javax.swing.JTextField();
        jpassres2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 260, 497, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("Nom :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 110, 40, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 62, 80));
        jLabel3.setText("Prénom :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 150, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 62, 80));
        jLabel4.setText("E-mail :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 210, 50, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 62, 80));
        jLabel5.setText("Tel :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 240, 40, 15);

        jnomres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomresActionPerformed(evt);
            }
        });
        getContentPane().add(jnomres);
        jnomres.setBounds(230, 110, 150, 20);
        getContentPane().add(jprenomres);
        jprenomres.setBounds(230, 150, 150, 20);
        getContentPane().add(jcinres);
        jcinres.setBounds(230, 180, 150, 20);
        getContentPane().add(jemailres);
        jemailres.setBounds(230, 210, 150, 20);

        jButton1.setText("Annuler");
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 400, 90, 23);

        jButton2.setText("S'inscrire");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 400, 100, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("Données Agence");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 260, 180, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 62, 80));
        jLabel7.setText("Nom :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 290, 40, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(44, 62, 80));
        jLabel8.setText("Adresse :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 320, 60, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(44, 62, 80));
        jLabel9.setText("Ville :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 350, 50, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 62, 80));
        jLabel10.setText("Tel :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(130, 380, 40, 15);
        getContentPane().add(jnomage);
        jnomage.setBounds(230, 290, 151, 20);

        jaddrage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddrageActionPerformed(evt);
            }
        });
        getContentPane().add(jaddrage);
        jaddrage.setBounds(230, 320, 151, 20);
        getContentPane().add(jvilleage);
        jvilleage.setBounds(230, 350, 151, 20);
        getContentPane().add(jtelage);
        jtelage.setBounds(230, 380, 151, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 62, 80));
        jLabel1.setText("Données Personnelles");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 70, 220, 22);
        getContentPane().add(jtelres);
        jtelres.setBounds(230, 240, 150, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(44, 62, 80));
        jLabel12.setText("CIN :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 180, 50, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(44, 62, 80));
        jLabel11.setText("Mot de passe :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(430, 130, 100, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(44, 62, 80));
        jLabel13.setText("Confirmer :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(430, 180, 80, 15);

        jpassres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassresActionPerformed(evt);
            }
        });
        getContentPane().add(jpassres);
        jpassres.setBounds(430, 150, 150, 20);
        getContentPane().add(jpassres2);
        jpassres2.setBounds(430, 210, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnomresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnomresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    
         String nomres=jnomres.getText().toString();
          String prenomres=jprenomres.getText().toString();
           String cinres=jcinres.getText().toString();
            String emailres=jemailres.getText().toString();
             String telres=jtelres.getText().toString();
              String passres=jpassres.getText().toString();
               String passres2=jpassres2.getText().toString();
               
                String nomage=jnomage.getText().toString();
                 String addrage=jaddrage.getText().toString();
                  String villeage=jvilleage.getText().toString();
                   String telage=jtelage.getText().toString();
                    
                   
                    
                    
                   
                   if(nomres.length() !=0 && prenomres.length() !=0 && cinres.length() !=0 
                           && emailres.length() !=0 && telres.length() !=0 
                           && passres.length() !=0 && passres2.length() !=0 && nomage.length() !=0 &&
                           addrage.length() !=0 && villeage.length() !=0 && telage.length() !=0)
                   {

                         Personne p = new Personne(cinres,nomres,prenomres, emailres,Integer.parseInt(telres), passres);
                    PersonneDAO dp = new PersonneDAO();
                    dp.ajouterPersonne(p.getCin(), p.getNom(), p.getPrenom(), p.getEmail(), p.getTel(), p.getMdp());
                    Agence a =new Agence(nomage,addrage,Integer.parseInt(telage),villeage);
                    AgenceDAO agd = new AgenceDAO();
                    agd.ajouterAgence(a.getNom(), a.getAdresse(), a.getTelephone(), a.getVille());
                    ResponsableDAO rsd = new ResponsableDAO();
                    rsd.ajouterResponsable();

                   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jaddrageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddrageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaddrageActionPerformed

    private void jpassresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassresActionPerformed

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
            java.util.logging.Logger.getLogger(Chiheb_Inscription_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Inscription_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Inscription_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chiheb_Inscription_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chiheb_Inscription_Responsable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jaddrage;
    private javax.swing.JTextField jcinres;
    private javax.swing.JTextField jemailres;
    private javax.swing.JTextField jnomage;
    private javax.swing.JTextField jnomres;
    private javax.swing.JTextField jpassres;
    private javax.swing.JTextField jpassres2;
    private javax.swing.JTextField jprenomres;
    private javax.swing.JTextField jtelage;
    private javax.swing.JTextField jtelres;
    private javax.swing.JTextField jvilleage;
    // End of variables declaration//GEN-END:variables
}
