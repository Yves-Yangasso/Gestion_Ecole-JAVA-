/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ClasseDao;
import dao.EtudiantDao;
import dao.ScolariteDao;
import java.util.List;
import javax.swing.JOptionPane;
import models.Classe;
import models.Etudiant;
import models.Scolarite;

public class InscriptionNewEtudiant extends javax.swing.JFrame {

    public InscriptionNewEtudiant() {
        initComponents();
        setLocationRelativeTo(null);
        chargerClasses();
        total_txt.setEnabled(false);
        reste_txt.setEnabled(false);

        //  System.out.println(classe_txt.getSelectedItem().toString());
    }

    public boolean checkField() {
        String matricule = matricule_txt.getText();
        String montant = montant_txt.getText();

        return !(matricule.isBlank() || montant.isBlank());
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

    public Scolarite getScolariteByEtudiant(int id) {
        List<Scolarite> scolarites = ScolariteDao.getScolariteDao().findScolariteEntities();
        for (Scolarite sco : scolarites) {
            if (sco.getEtudiantId().getId() == id) {
                // System.out.println(sco.getEtudiantId().getEmail());
                return sco;
            }
        }
        return null;
    }

    public Classe getClasseByNom(String nom) {
        List<Classe> classes = ClasseDao.getClasseDao().findClasseEntities();
        for (Classe classe : classes) {
            if (classe.getNom().equals(nom)) {
                return classe;
            }
        }
        return null;
    }

    private void clearField() {
        matricule_txt.setText("");
        montant_txt.setText("");
    }

    private void insertion() {
        try {
            String matricule = matricule_txt.getText();
            String montant = montant_txt.getText();
            String classe = classe_txt.getSelectedItem().toString();
            String reste = reste_txt.getText();

            Etudiant etu = getEtudiantByMatricule(matricule);
            Classe cla = getClasseByNom(classe);

            int mtn = Integer.parseInt(montant);
            int res = Integer.parseInt(reste);

            Scolarite sco = new Scolarite();
            sco.setClasseId(cla);
            sco.setEtudiantId(etu);
            sco.setMtnP(mtn);
            sco.setMtnR(res);

            ScolariteDao.getScolariteDao().create(sco);

            JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);

            clearField();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void chargerClasses() {
        //classe_txt.removeAllItems();
        List<Classe> classes = ClasseDao.getClasseDao().findClasseEntities();

        for (Classe cla : classes) {
            classe_txt.addItem(cla.getNom());
        }
    }

    private int getMontantP(String cla) {
        if (cla.equals("CP1")) {
            return 500000;
        }

        if (cla.equals("CP2")) {
            return 600000;
        }

        if (cla.equals("CE1")) {
            return 700000;
        }

        if (cla.equals("CE2")) {
            return 800000;
        }

        if (cla.equals("CM1")) {
            return 900000;
        }

        if (cla.equals("CM2")) {
            return 1000000;
        }

        return 0;
    }

    private void getReste() {
        int mtn = getMontantP(classe_txt.getSelectedItem().toString());

        reste_txt.setText("" + mtn);

        total_txt.setText("" + mtn);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        montant_txt = new javax.swing.JTextField();
        classe_txt = new javax.swing.JComboBox<>();
        matricule_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reste_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Ajour_btn = new javax.swing.JButton();
        ajouter_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Scolarité");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Matricule");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Classe");

        montant_txt.setBackground(new java.awt.Color(255, 255, 255));
        montant_txt.setForeground(new java.awt.Color(0, 0, 0));
        montant_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montant_txtActionPerformed(evt);
            }
        });

        classe_txt.setBackground(new java.awt.Color(255, 255, 255));
        classe_txt.setForeground(new java.awt.Color(0, 0, 0));
        classe_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                classe_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                classe_txtFocusLost(evt);
            }
        });
        classe_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classe_txtMouseClicked(evt);
            }
        });
        classe_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classe_txtActionPerformed(evt);
            }
        });

        matricule_txt.setBackground(new java.awt.Color(255, 255, 255));
        matricule_txt.setForeground(new java.awt.Color(0, 0, 0));
        matricule_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricule_txtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Montant");

        total_txt.setBackground(new java.awt.Color(255, 255, 255));
        total_txt.setForeground(new java.awt.Color(0, 0, 0));
        total_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total");

        reste_txt.setBackground(new java.awt.Color(255, 255, 255));
        reste_txt.setForeground(new java.awt.Color(0, 0, 0));
        reste_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reste_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Reste");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(matricule_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(montant_txt)
                            .addComponent(classe_txt, 0, 370, Short.MAX_VALUE)
                            .addComponent(reste_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(matricule_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(classe_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montant_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reste_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 330));

        Ajour_btn.setBackground(new java.awt.Color(51, 153, 255));
        Ajour_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Ajour_btn.setForeground(new java.awt.Color(255, 255, 255));
        Ajour_btn.setText("A  Jour");
        Ajour_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajour_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Ajour_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 170, 40));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });
        jPanel1.add(ajouter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montant_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montant_txtActionPerformed
        int mtn = getMontantP(classe_txt.getSelectedItem().toString());
        int montant = mtn - Integer.parseInt(montant_txt.getText());

        reste_txt.setText("" + montant);
    }//GEN-LAST:event_montant_txtActionPerformed

    private void total_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_txtActionPerformed

    private void reste_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reste_txtActionPerformed

    }//GEN-LAST:event_reste_txtActionPerformed

    private void classe_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classe_txtMouseClicked

    }//GEN-LAST:event_classe_txtMouseClicked

    private void classe_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_classe_txtFocusLost

    }//GEN-LAST:event_classe_txtFocusLost

    private void classe_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classe_txtActionPerformed
        getReste();

    }//GEN-LAST:event_classe_txtActionPerformed

    private void classe_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_classe_txtFocusGained

    }//GEN-LAST:event_classe_txtFocusGained

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        if (!checkField()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoire !!!");
            return;
        }

        String matricule = matricule_txt.getText();
        String montant = montant_txt.getText();
        String classe = classe_txt.getSelectedItem().toString();
        String reste = reste_txt.getText();

        Etudiant etu = getEtudiantByMatricule(matricule);
        Classe cla = getClasseByNom(classe);

        if (etu == null) {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas !!!");
            return;
        }

        insertion();
    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void matricule_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricule_txtActionPerformed
        String recherche = matricule_txt.getText();
        Etudiant etudiant = getEtudiantByMatricule(recherche);
        Classe cla = new Classe();
        Scolarite sco = new Scolarite();

        if (etudiant != null) {

            int idEtu = etudiant.getId();
            sco = getScolariteByEtudiant(idEtu);

            montant_txt.setText("" + sco.getMtnP());
            classe_txt.setSelectedItem(sco.getClasseId().getNom());
            reste_txt.setText("" + sco.getMtnR());

            // System.out.println(sco.getMtnP());
        }
    }//GEN-LAST:event_matricule_txtActionPerformed

    private void Ajour_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajour_btnActionPerformed
        if (!checkField()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoire !!!");
            return;
        }

        String matricule = matricule_txt.getText();
        String montant = montant_txt.getText();
        String classe = classe_txt.getSelectedItem().toString();
        String reste = reste_txt.getText();

        Etudiant etu = getEtudiantByMatricule(matricule);
        Classe cla = getClasseByNom(classe);

        if (etu == null) {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas !!!");
            return;
        }

        try {
            int mtn = Integer.parseInt(montant);
            int res = Integer.parseInt(reste);

            String recherche = matricule_txt.getText();
            Etudiant etudiant = getEtudiantByMatricule(recherche);

            Scolarite sco = new Scolarite();

            int idEtu = etudiant.getId();
            sco = getScolariteByEtudiant(idEtu);

            sco.setMtnP(mtn);
            sco.setMtnR(res);

            ScolariteDao.getScolariteDao().edit(sco);

            JOptionPane.showMessageDialog(null, "Mise a jour effectue !", "Succès", JOptionPane.INFORMATION_MESSAGE);
            clearField();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Impossible!", "Succès", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Ajour_btnActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionNewEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionNewEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionNewEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionNewEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionNewEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajour_btn;
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JComboBox<String> classe_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField matricule_txt;
    private javax.swing.JTextField montant_txt;
    private javax.swing.JTextField reste_txt;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables
}
