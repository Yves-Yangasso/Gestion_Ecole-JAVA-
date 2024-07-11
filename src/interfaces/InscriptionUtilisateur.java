/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.EtudiantDao;
import dao.UtilisateurDao;
import java.util.List;
import javax.swing.JOptionPane;
import models.Etudiant;
import models.Utilisateur;
import security.Security;
import static utils.UtilsFonction.isValidEmail;
import static utils.UtilsFonction.isValidPhoneNumber;

/**
 *
 * @author yanga
 */
public class InscriptionUtilisateur extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionUtilisateur
     */
    public InscriptionUtilisateur() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public boolean checkField() {
        String username = username_txt.getText();
        String nom = nomU_txt.getText();
        String prenom = prenomU_txt.getText();
        String role = roleU_txt.getSelectedItem().toString();
        String email = emailU_txt.getText();
        String telephone = telephoneU_txt.getText();
        String mdp = mdpU_txt.getText();
        return !(username.isBlank() || nom.isBlank() || prenom.isBlank() || role.isBlank()
                || email.isBlank() || telephone.isBlank() || mdp.isBlank());

    }
         
    
      public Utilisateur getUtilisateurByUsername(String username) {
        List<Utilisateur> utilisateurs = UtilisateurDao.getUtilisateurDao().findUtilisateurEntities();
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getUsername().equals(username)) {
                return utilisateur;
            }
        }
        return null; 
    }
    
   
    public void clearField() {
        username_txt.setText("");
        nomU_txt.setText("");
        prenomU_txt.setText("");
        emailU_txt.setText("");
        telephoneU_txt.setText("");
        mdpU_txt.setText("");
    }

    public void inscription() {
        try {
            String username = username_txt.getText();
            String nom = nomU_txt.getText();
            String prenom = prenomU_txt.getText();
            String role = roleU_txt.getSelectedItem().toString();
            String email = emailU_txt.getText();
            String telephone = telephoneU_txt.getText();
            String mdp = mdpU_txt.getText();

            Security scr = new Security();
            mdp = scr.hashPassword(mdp);

            Utilisateur user = new Utilisateur();
            user.setUsername(username);
            user.setTelephone(telephone);
            user.setEmail(email);
            user.setMdp(mdp);
            user.setRole(role);
            user.setNom(nom);
            user.setPrenom(prenom);

            UtilisateurDao.getUtilisateurDao().create(user);

            JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);

            clearField();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        nomU_txt = new javax.swing.JTextField();
        prenomU_txt = new javax.swing.JTextField();
        emailU_txt = new javax.swing.JTextField();
        telephoneU_txt = new javax.swing.JTextField();
        roleU_txt = new javax.swing.JComboBox<>();
        mdpU_txt = new javax.swing.JPasswordField();
        ajouter_btn = new javax.swing.JButton();
        supprimer_btn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajout Utilisateur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 450, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Prenom");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telephone");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Role");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Mot de passe");

        username_txt.setBackground(new java.awt.Color(255, 255, 255));
        username_txt.setForeground(new java.awt.Color(0, 0, 0));
        username_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_txtFocusLost(evt);
            }
        });

        nomU_txt.setBackground(new java.awt.Color(255, 255, 255));
        nomU_txt.setForeground(new java.awt.Color(0, 0, 0));

        prenomU_txt.setBackground(new java.awt.Color(255, 255, 255));
        prenomU_txt.setForeground(new java.awt.Color(0, 0, 0));

        emailU_txt.setBackground(new java.awt.Color(255, 255, 255));
        emailU_txt.setForeground(new java.awt.Color(0, 0, 0));

        telephoneU_txt.setBackground(new java.awt.Color(255, 255, 255));
        telephoneU_txt.setForeground(new java.awt.Color(0, 0, 0));

        roleU_txt.setBackground(new java.awt.Color(255, 255, 255));
        roleU_txt.setForeground(new java.awt.Color(0, 0, 0));
        roleU_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilisateur", "Administrateur" }));

        mdpU_txt.setBackground(new java.awt.Color(255, 255, 255));
        mdpU_txt.setForeground(new java.awt.Color(0, 0, 0));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });

        supprimer_btn.setBackground(new java.awt.Color(255, 102, 102));
        supprimer_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        supprimer_btn.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_btn.setText("Supprimer");
        supprimer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ajouter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(supprimer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_txt)
                            .addComponent(nomU_txt)
                            .addComponent(prenomU_txt)
                            .addComponent(emailU_txt)
                            .addComponent(telephoneU_txt)
                            .addComponent(roleU_txt, 0, 285, Short.MAX_VALUE)
                            .addComponent(mdpU_txt))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(prenomU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telephoneU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(roleU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mdpU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter_btn)
                    .addComponent(supprimer_btn))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        String username = username_txt.getText();
        String nom = nomU_txt.getText();
        String prenom = prenomU_txt.getText();
        String role = roleU_txt.getSelectedItem().toString();
        String email = emailU_txt.getText();
        String telephone = telephoneU_txt.getText();
        String mdp = mdpU_txt.getText();

        if (!checkField()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoire !!!");
            return;
        }

        if (!isValidPhoneNumber(telephone)) {
            JOptionPane.showMessageDialog(this, "Numero invalide !!!");
            return;
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email invalide !!!");
            return;
        }

        inscription();
    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void username_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_txtFocusLost
                                      
    String username = username_txt.getText();
    Utilisateur utilisateur = getUtilisateurByUsername(username);

    if (utilisateur != null) {
        username_txt.setText(utilisateur.getUsername());
        nomU_txt.setText(utilisateur.getNom());
        prenomU_txt.setText(utilisateur.getPrenom());
        emailU_txt.setText(utilisateur.getEmail());
        telephoneU_txt.setText(utilisateur.getTelephone());
        mdpU_txt.setText(""); 
    } 
    
    }//GEN-LAST:event_username_txtFocusLost

    private void supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_btnActionPerformed
        String username = username_txt.getText();
         Utilisateur utilisateur = getUtilisateurByUsername(username);

        if (utilisateur != null) {
            UtilisateurDao.getUtilisateurDao().destroy(utilisateur.getId());
            JOptionPane.showMessageDialog(this, "L'utilisateur a ete supprime !!!");
            clearField();
            username_txt.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "L'utilisateur n'existe pas !!!");
            username_txt.setText("");
            clearField();
        }
    }//GEN-LAST:event_supprimer_btnActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JTextField emailU_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField mdpU_txt;
    private javax.swing.JTextField nomU_txt;
    private javax.swing.JTextField prenomU_txt;
    private javax.swing.JComboBox<String> roleU_txt;
    private javax.swing.JButton supprimer_btn;
    private javax.swing.JTextField telephoneU_txt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
