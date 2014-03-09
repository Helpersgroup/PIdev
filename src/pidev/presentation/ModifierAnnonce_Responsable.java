/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.presentation;

import java.util.Date;
import javax.swing.*;
import pidev.dao.AgenceDAO;
import pidev.dao.AnnonceDAO;
import pidev.entities.Annonce;
import pidev.util.MyConnection;



/**
 *
 * @author chiheb
 */
public class ModifierAnnonce_Responsable extends javax.swing.JFrame {
        int x=0;
        String y="";
        static int id;
//int id ;    
/**
     * Creates new form ModifierAnnonce_Responsable
     */
        public int getId(){
            return id;
        }
        public void setId(int i){
            id=i;
        }
        
    public ModifierAnnonce_Responsable(int id) {
        
        initComponents();
         this.setId(id);
        this.setLocationRelativeTo(null);
        this.pack();
        AgenceDAO agd = new AgenceDAO();
     x=agd.selectIdAgence(Chiheb_Authentification.id_connecté_normal);
        System.out.println(x);
        y=agd.selectNomAgence(x);
    jLabel12.setText(""+y);
    
   // récupération de données    
               AnnonceDAO aDAO =new AnnonceDAO();
             //  int id =Chiheb_Authentification.id_connecté_normal;
               
                Annonce a= aDAO.selectAnnonce(id);

                if(a.getNom() != null) {
                    TFnom.setText(a.getNom());
                 } 
                
                 if(a.getTransport() != null) {
            CboxTransport.setSelectedItem(a.getTransport().toString());
        }
                 
                 if (a.getHebergement() != null) {
            TfHebergement.setText(a.getHebergement());
        }
                
                 if(a.getType_Hebergement() != null) {
            CboxTypeHeberg.setSelectedItem(a.getType_Hebergement().toString());
        }
                   
                 if(a.getDepart() != null) {
            TFdepart.setText(a.getDepart());
        }
                 
                 if(a.getDepart() != null) {
            TFdestination.setText(a.getDestination());
        }
                 
                 if(a.getType_Hebergement() != null) {
            TfHebergement.setText(a.getHebergement());
        }
                 
                 if(a.getDate_Deb() != null) {
            JXDateDepart.setDate(a.getDate_Deb());
        }
                 
                 if(a.getDate_Fin() != null) {
            jXDateRetour.setDate(a.getDate_Fin());
        }
                
                 if(a.getType_Annonce() != null) {
            CboxTheme.setSelectedItem(a.getType_Annonce().toString());
        }
                  
                if(a.getDescription() != null) {
            TAdesc.setText(a.getDescription());
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAdesc = new javax.swing.JTextArea();
        TFdepart = new javax.swing.JTextField();
        CboxTypeHeberg = new javax.swing.JComboBox();
        CboxTheme = new javax.swing.JComboBox();
        TFdestination = new javax.swing.JTextField();
        TFnom = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BtnModifierA = new javax.swing.JButton();
        CboxTransport = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TfHebergement = new javax.swing.JTextField();
        jXDateRetour = new org.jdesktop.swingx.JXDatePicker();
        JXDateDepart = new org.jdesktop.swingx.JXDatePicker();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfPrix = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avion", "Camping-Car", "Bus", "Micro-Bus ", "Mini-Bus", "Voiture", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("Date Depart ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 170, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 62, 80));
        jLabel4.setText("Nom ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 80, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 62, 80));
        jLabel5.setText("Date Retour ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 100, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("Depart ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 240, 70, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 62, 80));
        jLabel7.setText("Type Hebergement ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 400, 150, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(44, 62, 80));
        jLabel8.setText("Destination ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 290, 100, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(44, 62, 80));
        jLabel9.setText("Description");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 340, 100, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 62, 80));
        jLabel10.setText("Transport ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 440, 100, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(44, 62, 80));
        jLabel11.setText("Thème");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 130, 120, 17);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TAdesc.setColumns(20);
        TAdesc.setRows(5);
        jScrollPane1.setViewportView(TAdesc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 320, 190, 60);

        TFdepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdepartActionPerformed(evt);
            }
        });
        getContentPane().add(TFdepart);
        TFdepart.setBounds(240, 240, 190, 30);

        CboxTypeHeberg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Auberge", "Bungalow", "Hotel 1 etoile ", "Hotel 2 etoiles ", "Hotel 3 etoiles ", "Hotel 4 etoiles", "Hotel 5 etoiles", "Residence  ", "Villa", " " }));
        CboxTypeHeberg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxTypeHebergActionPerformed(evt);
            }
        });
        getContentPane().add(CboxTypeHeberg);
        CboxTypeHeberg.setBounds(240, 400, 190, 30);

        CboxTheme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Affaire", "Bien etre", "Camping", "Excursion", "Randonnée", "Voyage de découverte ", "Voyage de noce ", " " }));
        CboxTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxThemeActionPerformed(evt);
            }
        });
        getContentPane().add(CboxTheme);
        CboxTheme.setBounds(240, 120, 190, 30);

        TFdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdestinationActionPerformed(evt);
            }
        });
        getContentPane().add(TFdestination);
        TFdestination.setBounds(240, 280, 190, 30);

        TFnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnomActionPerformed(evt);
            }
        });
        getContentPane().add(TFnom);
        TFnom.setBounds(240, 80, 190, 30);

        jButton1.setText("Annuler");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 610, 90, 23);

        BtnModifierA.setText("Modifier");
        BtnModifierA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifierAActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModifierA);
        BtnModifierA.setBounds(210, 610, 90, 23);

        CboxTransport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "AVION", "BUS ", "MACRO-BUS", "MINI-BUS", "VOITURE" }));
        getContentPane().add(CboxTransport);
        CboxTransport.setBounds(240, 440, 190, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Modifier Annonce ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 230, 29);

        jLabel3.setText("le nom du responsable");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 20, 130, 14);

        jLabel12.setText("le nom de l'agence");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 20, 130, 14);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(44, 62, 80));
        jLabel14.setText("Hebergement");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(450, 400, 110, 20);
        getContentPane().add(TfHebergement);
        TfHebergement.setBounds(560, 400, 140, 30);
        getContentPane().add(jXDateRetour);
        jXDateRetour.setBounds(240, 200, 190, 30);
        getContentPane().add(JXDateDepart);
        JXDateDepart.setBounds(240, 162, 190, 30);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(240, 490, 90, 18);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(490, 490, 100, 18);

        jLabel15.setText("Nombre Enfants ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(380, 490, 100, 20);

        jLabel16.setText("Nombre Adultes");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(150, 490, 90, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("prix");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(90, 530, 100, 30);

        tfPrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrixActionPerformed(evt);
            }
        });
        getContentPane().add(tfPrix);
        tfPrix.setBounds(240, 530, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdepartActionPerformed

    private void CboxThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxThemeActionPerformed

    private void TFdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdestinationActionPerformed

    private void TFnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnomActionPerformed

    private void BtnModifierAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierAActionPerformed
        JOptionPane d = new JOptionPane();

        Annonce a = new Annonce();
        AnnonceDAO aDAO = new AnnonceDAO();
        a.setNom(TFnom.getText());
        a.setType_annonce(CboxTheme.getSelectedItem().toString());


        a.setDate_deb(JXDateDepart.getDate());
        a.setDate_fin(jXDateRetour.getDate());
        a.setDepart(TFdepart.getText());
        a.setDestination(TFdestination.getText());
        a.setType_annonce(CboxTypeHeberg.getSelectedItem().toString());
        a.setTransport(CboxTransport.getSelectedItem().toString());
        a.setNbr_adultes (Integer.parseInt(jSpinner1.getValue().toString()));
        a.setNbr_enfants(Integer.parseInt(jSpinner2.getValue().toString()));
        a.setPrix (Integer.parseInt(tfPrix.getText()));
    int id = Chiheb_Authentification.id_connecté_normal;

      if (aDAO.modifierAnnonce(id))
              System.out.println("modification effectuée ");
      else
            System.out.println("modification non effectuée ");
    }//GEN-LAST:event_BtnModifierAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AfficherAnnonceResponsable AAR = new AfficherAnnonceResponsable();
    AAR.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CboxTypeHebergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxTypeHebergActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxTypeHebergActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ResponsableAgence RA = new ResponsableAgence();
        this.dispose();
        RA.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void tfPrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrixActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierAnnonce_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierAnnonce_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierAnnonce_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierAnnonce_Responsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new ModifierAnnonce_Responsable(id).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModifierA;
    private javax.swing.JComboBox CboxTheme;
    private javax.swing.JComboBox CboxTransport;
    private javax.swing.JComboBox CboxTypeHeberg;
    private org.jdesktop.swingx.JXDatePicker JXDateDepart;
    private javax.swing.JTextArea TAdesc;
    private javax.swing.JTextField TFdepart;
    private javax.swing.JTextField TFdestination;
    private javax.swing.JTextField TFnom;
    private javax.swing.JTextField TfHebergement;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private org.jdesktop.swingx.JXDatePicker jXDateRetour;
    private javax.swing.JTextField tfPrix;
    // End of variables declaration//GEN-END:variables
}