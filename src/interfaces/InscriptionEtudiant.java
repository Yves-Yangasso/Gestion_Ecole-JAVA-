/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.EtudiantDao;
import dao.UtilisateurDao;
import static interfaces.connexionUtilisateur.idUtilisateur;
import java.util.List;
import javax.swing.JOptionPane;
import models.Etudiant;
import models.Utilisateur;
import static utils.UtilsFonction.isValidEmail;
import static utils.UtilsFonction.isValidPhoneNumber;

/**
 *
 * @author yanga
 */
public class InscriptionEtudiant extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionEtudiant
     */
    public InscriptionEtudiant() {
        initComponents();
        setLocationRelativeTo(null);
        inscriptionE_txt.setText("150000");
        inscriptionE_txt.setEnabled(false);
    }

    public boolean checkField() {
        String nom = nomE_txt.getText();
        String prenom = prenomE_txt.getText();
        String inscription = inscriptionE_txt.getText();
        //int inscription = Integer.parseInt(inscriptionE_txt.getText());
        String telephone = telephoneE_txt.getText();
        String email = emailE_txt.getText();

        return !(nom.isBlank() || prenom.isBlank() || inscription.isBlank() || telephone.isBlank() || email.isBlank());
    }

    public void clearField() {
        nomE_txt.setText("");
        prenomE_txt.setText("");
        inscriptionE_txt.setText("");
        telephoneE_txt.setText("");
        emailE_txt.setText("");
    }

    public String createMatricule() {
        List<Etudiant> etudiants = EtudiantDao.getEtudiantDao().findEtudiantEntities();
        int cpt = 1;
        
        Etudiant etu = new Etudiant();
        
        for (Etudiant etudiant : etudiants) {
            cpt++;
            etu = etudiant;
        }
        
        int tmp = etu.getId()+1; 
        return "E-" + tmp;
    }

    public Etudiant getEtudiantByMatricule(String matricule) {
        List<Etudiant> etudiants = EtudiantDao.getEtudiantDao().findEtudiantEntities();
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMatricule().equals(matricule)) {
                return etudiant;
            }
        }
        return null;
    }

    private void inscription() {
        try {
            String nom = nomE_txt.getText();
            String prenom = prenomE_txt.getText();
            String inscriptionStr = inscriptionE_txt.getText();
            String telephone = telephoneE_txt.getText();
            String email = emailE_txt.getText();
            String matricule = createMatricule();
            int inscription;

            if (!inscriptionStr.isEmpty()) {
                inscription = Integer.parseInt(inscriptionStr);
            } else {
                throw new NumberFormatException("La valeur d'inscription ne peut pas être vide");
            }

            Utilisateur user = new Utilisateur();

            List<Utilisateur> utilisateurs = UtilisateurDao.getUtilisateurDao().findUtilisateurEntities();
            for (Utilisateur utilisateur : utilisateurs) {
                if (utilisateur.getId().equals(idUtilisateur)) {
                    user.setId(utilisateur.getId());
                    user.setUsername(utilisateur.getUsername());
                    user.setTelephone(utilisateur.getTelephone());
                    user.setEmail(utilisateur.getEmail());
                    user.setMdp(utilisateur.getMdp());
                    user.setRole(utilisateur.getRole());
                    user.setNom(utilisateur.getNom());
                    user.setPrenom(utilisateur.getPrenom());
                }
            }

            if (user == null) {
                throw new Exception("Utilisateur non trouvé pour l'ID spécifié");
            }

            System.out.println("info : " + user.getEmail());

            Etudiant etu = new Etudiant();
            etu.setInscription(inscription);
            etu.setMatricule(matricule);
            etu.setNom(nom);
            etu.setPrenom(prenom);
            etu.setTelephone(telephone);
            etu.setEmail(email);
            etu.setUserId(user);

            EtudiantDao.getEtudiantDao().create(etu);

            JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);

            clearField();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erreur de format pour l'inscription : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ajouter_btn = new javax.swing.JButton();
        supprimer_btn = new javax.swing.JButton();
        modifier_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomE_txt = new javax.swing.JTextField();
        prenomE_txt = new javax.swing.JTextField();
        inscriptionE_txt = new javax.swing.JTextField();
        telephoneE_txt = new javax.swing.JTextField();
        emailE_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        recherche_btn1 = new javax.swing.JButton();
        recherche_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });

        supprimer_btn.setBackground(new java.awt.Color(51, 153, 255));
        supprimer_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supprimer_btn.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_btn.setText("Supprimer");
        supprimer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_btnActionPerformed(evt);
            }
        });

        modifier_btn.setBackground(new java.awt.Color(51, 153, 255));
        modifier_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modifier_btn.setForeground(new java.awt.Color(255, 255, 255));
        modifier_btn.setText("Modifier");
        modifier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ajouter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(supprimer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(modifier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supprimer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nom");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Frais Inscription");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telephone");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        nomE_txt.setBackground(new java.awt.Color(255, 255, 255));
        nomE_txt.setForeground(new java.awt.Color(0, 0, 0));
        nomE_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomE_txtActionPerformed(evt);
            }
        });

        prenomE_txt.setBackground(new java.awt.Color(255, 255, 255));
        prenomE_txt.setForeground(new java.awt.Color(0, 0, 0));

        inscriptionE_txt.setBackground(new java.awt.Color(255, 255, 255));
        inscriptionE_txt.setForeground(new java.awt.Color(0, 0, 0));

        telephoneE_txt.setBackground(new java.awt.Color(255, 255, 255));
        telephoneE_txt.setForeground(new java.awt.Color(0, 0, 0));

        emailE_txt.setBackground(new java.awt.Color(255, 255, 255));
        emailE_txt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomE_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(prenomE_txt)
                    .addComponent(inscriptionE_txt)
                    .addComponent(telephoneE_txt)
                    .addComponent(emailE_txt))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prenomE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inscriptionE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telephoneE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(emailE_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Etudiant");

        recherche_btn1.setBackground(new java.awt.Color(51, 153, 255));
        recherche_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recherche_btn1.setForeground(new java.awt.Color(255, 255, 255));
        recherche_btn1.setText("Recherche");
        recherche_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche_btn1ActionPerformed(evt);
            }
        });

        recherche_txt.setBackground(new java.awt.Color(255, 255, 255));
        recherche_txt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Matricule");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(recherche_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recherche_btn1)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recherche_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recherche_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        String nom = nomE_txt.getText();
        String prenom = prenomE_txt.getText();
        int inscription = Integer.parseInt(inscriptionE_txt.getText());
        String telephone = telephoneE_txt.getText();
        String email = emailE_txt.getText();
        String matricule = createMatricule();

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

    private void recherche_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche_btn1ActionPerformed
        String recherche = recherche_txt.getText();
        Etudiant etudiant = getEtudiantByMatricule(recherche);

        if (etudiant != null) {
            inscriptionE_txt.setText("" + etudiant.getInscription());
            nomE_txt.setText(etudiant.getNom());
            prenomE_txt.setText(etudiant.getPrenom());
            emailE_txt.setText(etudiant.getEmail());
            telephoneE_txt.setText(etudiant.getTelephone());

        } else {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas !!!");
            recherche_txt.setText("");
            clearField();
        }
    }//GEN-LAST:event_recherche_btn1ActionPerformed

    private void supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_btnActionPerformed
        String recherche = recherche_txt.getText();
        Etudiant etudiant = getEtudiantByMatricule(recherche);

        if (etudiant != null) {
            EtudiantDao.getEtudiantDao().destroy(etudiant.getId());
            JOptionPane.showMessageDialog(this, "L'etudiant a ete supprime !!!");
            clearField();
            recherche_txt.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas !!!");
            recherche_txt.setText("");
            clearField();
        }

    }//GEN-LAST:event_supprimer_btnActionPerformed

    private void modifier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_btnActionPerformed
        String recherche = recherche_txt.getText();
        Etudiant etudiant = getEtudiantByMatricule(recherche);

        if (etudiant != null) {
            String nom = nomE_txt.getText();
            String prenom = prenomE_txt.getText();
            int inscription = Integer.parseInt(inscriptionE_txt.getText());
            String telephone = telephoneE_txt.getText();
            String email = emailE_txt.getText();
            String matricule = createMatricule();

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
            
            
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            etudiant.setTelephone(telephone);
            etudiant.setEmail(email);
            
            EtudiantDao.getEtudiantDao().edit(etudiant);
            
            JOptionPane.showMessageDialog(this, "L'etudiant a ete modifie !!!");
        }else {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas !!!");
            recherche_txt.setText("");
            clearField();
        }


    }//GEN-LAST:event_modifier_btnActionPerformed

    private void nomE_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomE_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomE_txtActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JTextField emailE_txt;
    private javax.swing.JTextField inscriptionE_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton modifier_btn;
    private javax.swing.JTextField nomE_txt;
    private javax.swing.JTextField prenomE_txt;
    private javax.swing.JButton recherche_btn1;
    private javax.swing.JTextField recherche_txt;
    private javax.swing.JButton supprimer_btn;
    private javax.swing.JTextField telephoneE_txt;
    // End of variables declaration//GEN-END:variables
}
