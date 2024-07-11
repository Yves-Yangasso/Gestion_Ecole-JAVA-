/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ProfesseurDao;
import dao.UtilisateurDao;
import static interfaces.connexionUtilisateur.idUtilisateur;
import java.util.List;
import javax.swing.JOptionPane;
import models.Professeur;
import models.Utilisateur;
import static utils.UtilsFonction.isValidEmail;
import static utils.UtilsFonction.isValidPhoneNumber;

/**
 *
 * @author yanga
 */
public class InscriptionEnseignant extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionEnseignant
     */
    public InscriptionEnseignant() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public boolean checkField() {
        String nom = nom_txt.getText();
        String prenom = prenom_txt.getText();
        String adresse = adresse_txt.getText();
        String telephone = telephone_txt.getText();
        String email = email_txt.getText();

        return !(nom.isBlank() || prenom.isBlank() || adresse.isBlank() || telephone.isBlank() || email.isBlank());
    }

    public void clearField() {
        nom_txt.setText("");
        prenom_txt.setText("");
        adresse_txt.setText("");
        telephone_txt.setText("");
        email_txt.setText("");
    }

    public String createMatricule() {
        List<Professeur> professeurs = ProfesseurDao.getProfesseurDao().findProfesseurEntities();
        int cpt = 0;

        Professeur prof = new Professeur();

        for (Professeur professeur : professeurs) {
            cpt++;
            prof = professeur;
        }

        int tmp = prof.getId();

        return "P-" + tmp;
    }

    public void inscription() {
        Utilisateur user = UtilisateurDao.getUtilisateurDao().findUtilisateur(idUtilisateur);

        try {
            if (user != null) {
                String nom = nom_txt.getText();
                String prenom = prenom_txt.getText();
                String adresse = adresse_txt.getText();
                String telephone = telephone_txt.getText();
                String email = email_txt.getText();
                String matricule = createMatricule();

                Professeur prof = new Professeur();

                prof.setNom(nom);
                prof.setEmail(email);
                prof.setMatricule(matricule);
                prof.setPrenom(prenom);
                prof.setTelephone(telephone);
                prof.setAdresse(adresse);
                prof.setUserId(user);

                ProfesseurDao.getProfesseurDao().create(prof);

                JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);

                clearField();

            }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nom_txt = new javax.swing.JTextField();
        prenom_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        telephone_txt = new javax.swing.JTextField();
        adresse_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        recherche_txt = new javax.swing.JTextField();
        recherche_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(14, 14, 14)
                .addComponent(ajouter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(supprimer_btn)
                .addGap(28, 28, 28)
                .addComponent(modifier_btn)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouter_btn))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 380, 50));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Enseignant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

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
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telephone");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Adresse");

        nom_txt.setBackground(new java.awt.Color(255, 255, 255));
        nom_txt.setForeground(new java.awt.Color(0, 0, 0));

        prenom_txt.setBackground(new java.awt.Color(255, 255, 255));
        prenom_txt.setForeground(new java.awt.Color(0, 0, 0));

        email_txt.setBackground(new java.awt.Color(255, 255, 255));
        email_txt.setForeground(new java.awt.Color(0, 0, 0));

        telephone_txt.setBackground(new java.awt.Color(255, 255, 255));
        telephone_txt.setForeground(new java.awt.Color(0, 0, 0));

        adresse_txt.setBackground(new java.awt.Color(255, 255, 255));
        adresse_txt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nom_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(prenom_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephone_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresse_txt, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prenom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telephone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(adresse_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 370, 260));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Matricule");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        recherche_txt.setBackground(new java.awt.Color(255, 255, 255));
        recherche_txt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(recherche_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 150, 30));

        recherche_btn1.setBackground(new java.awt.Color(51, 153, 255));
        recherche_btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recherche_btn1.setForeground(new java.awt.Color(255, 255, 255));
        recherche_btn1.setText("Recherche");
        recherche_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recherche_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(recherche_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recherche_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recherche_btn1ActionPerformed
        String recherche = recherche_txt.getText();
        List<Professeur> profs = ProfesseurDao.getProfesseurDao().findProfesseurEntities();

        if (profs != null) {
            for (Professeur prof : profs) {
                if (prof.getMatricule().equals(recherche)) {
                    nom_txt.setText(prof.getNom());
                    prenom_txt.setText(prof.getPrenom());
                    email_txt.setText(prof.getEmail());
                    adresse_txt.setText(prof.getAdresse());
                    telephone_txt.setText(prof.getTelephone());
                }
            }
        }
    }//GEN-LAST:event_recherche_btn1ActionPerformed

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        String nom = nom_txt.getText();
        String prenom = prenom_txt.getText();
        String adresse = adresse_txt.getText();
        String telephone = telephone_txt.getText();
        String email = email_txt.getText();

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

    private void supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_btnActionPerformed
        String recherche = recherche_txt.getText();
        List<Professeur> profs = ProfesseurDao.getProfesseurDao().findProfesseurEntities();

        Professeur prof_tmp = new Professeur();

        if (profs != null) {
            for (Professeur prof : profs) {
                if (prof.getMatricule().equals(recherche)) {
                    prof_tmp = prof;
                }
            }
        }

        try {
            if (prof_tmp.getId() != null) {
                ProfesseurDao.getProfesseurDao().destroy(prof_tmp.getId());
                JOptionPane.showMessageDialog(this, "Le professeur  " + prof_tmp.getNom() + " a ete supprime !!!");
                clearField();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Impossible de supprime le professeur" + prof_tmp.getNom() + "!!!");
        }
    }//GEN-LAST:event_supprimer_btnActionPerformed

    private void modifier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_btnActionPerformed

        String recherche = recherche_txt.getText();
        List<Professeur> profs = ProfesseurDao.getProfesseurDao().findProfesseurEntities();

        Professeur prof_tmp = new Professeur();

        if (profs != null) {
            for (Professeur prof : profs) {
                if (prof.getMatricule().equals(recherche)) {
                    prof_tmp = prof;
                }
            }
        }

        try {
                String nom = nom_txt.getText();
                String prenom = prenom_txt.getText();
                String adresse = adresse_txt.getText();
                String telephone = telephone_txt.getText();
                String email = email_txt.getText();

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
                
                prof_tmp.setAdresse(adresse);
                prof_tmp.setEmail(email);
                prof_tmp.setNom(nom);
                prof_tmp.setPrenom(prenom);
                prof_tmp.setTelephone(telephone);

                ProfesseurDao.getProfesseurDao().edit(prof_tmp);
                JOptionPane.showMessageDialog(this, "Le professeur  " + prof_tmp.getNom() + " a ete modifie !!!");
                clearField();
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Impossible de modifie le professeur" + prof_tmp.getNom() + "!!!");
        }
    }//GEN-LAST:event_modifier_btnActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionEnseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionEnseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionEnseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionEnseignant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionEnseignant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse_txt;
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JTextField email_txt;
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
    private javax.swing.JTextField nom_txt;
    private javax.swing.JTextField prenom_txt;
    private javax.swing.JButton recherche_btn1;
    private javax.swing.JTextField recherche_txt;
    private javax.swing.JButton supprimer_btn;
    private javax.swing.JTextField telephone_txt;
    // End of variables declaration//GEN-END:variables
}
