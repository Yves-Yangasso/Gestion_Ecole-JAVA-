/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ClasseDao;
import dao.CoursDao;
import dao.EtudiantDao;
import dao.MatiereDao;
import dao.ProfesseurDao;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import models.Classe;
import models.Cours;
import models.Etudiant;
import models.Matiere;
import models.Professeur;
import print.Pcours;
import utils.UtilsFonction;

public class AffecterProfesseur extends javax.swing.JFrame {

    public AffecterProfesseur() {
        initComponents();
        setLocationRelativeTo(null);
        chargerClasses();
        chargerProfesseur();
        chargerMatiere();
        AfficherCours();
    }

    private void chargerClasses() {
        //classe_txt.removeAllItems();
        List<Classe> classes = ClasseDao.getClasseDao().findClasseEntities();

        for (Classe cla : classes) {
            classe_txt.addItem(cla.getId() + " - " + cla.getNom());
        }
    }

    private void chargerMatiere() {
        //classe_txt.removeAllItems();
        List<Matiere> matieres = MatiereDao.getMatiereDao().findMatiereEntities();

        for (Matiere mat : matieres) {
            matiere_txt.addItem(mat.getId() + " - " + mat.getLibelle());
        }
    }

    private void chargerProfesseur() {
        //classe_txt.removeAllItems();
        List<Professeur> professeur = ProfesseurDao.getProfesseurDao().findProfesseurEntities();

        for (Professeur prof : professeur) {
            professeur_txt.addItem(prof.getId() + " - " + prof.getNom() + " " + prof.getPrenom());
        }
    }

    private void AfficherCours() {
        List<Cours> list = CoursDao.getCoursDao().findCoursEntities();

        List<Pcours> Lcr = new ArrayList<>();

        for (Cours c : list) {
            Pcours cr = new Pcours();
            cr.setClasse(c.getClasseId().getNom());
            cr.setMatiere(c.getMatiereId().getLibelle());
            cr.setProfesseur(c.getProfesseurId().getNom() + " - " + c.getProfesseurId().getPrenom());

            Lcr.add(cr);
        }

        UtilsFonction.displayDataInTable(Lcr, tableCours);
    }

    private int getNumberCh(String ch2) {
        String ch1;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(ch2);
        if (matcher.find()) {
            ch1 = matcher.group();
        } else {
            ch1 = ""; // ou une valeur par défaut
        }

        return Integer.parseInt(ch1);
    }

    public Cours getCoursByProf(int idProf) {
        List<Cours> cours = CoursDao.getCoursDao().findCoursEntities();
        for (Cours cr : cours) {
            if (cr.getProfesseurId().getId() == idProf) {
                return cr;
            }
        }
        return null;
    }

    private void Inscription() {
        String classe = classe_txt.getSelectedItem().toString();
        String matiere = matiere_txt.getSelectedItem().toString();
        String professeur = professeur_txt.getSelectedItem().toString();

        int Iclasse, Imatiere, Iprofesseur;

        Iclasse = getNumberCh(classe);
        Imatiere = getNumberCh(matiere);
        Iprofesseur = getNumberCh(professeur);

        Classe cla = new Classe();
        Matiere mat = new Matiere();
        Professeur prof = new Professeur();

        cla = ClasseDao.getClasseDao().findClasse(Iclasse);
        mat = MatiereDao.getMatiereDao().findMatiere(Imatiere);
        prof = ProfesseurDao.getProfesseurDao().findProfesseur(Iprofesseur);

        Cours cr = new Cours();

        cr = getCoursByProf(Iprofesseur);

        if (cr != null) {
            JOptionPane.showMessageDialog(this, "Le prof est deja dans une classe !");
            return;
        }

        try {
            Cours crs = new Cours();

            crs.setClasseId(cla);
            crs.setMatiereId(mat);
            crs.setProfesseurId(prof);

            CoursDao.getCoursDao().create(crs);

            JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);

            AfficherCours();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("info " + Iclasse + " - " + Imatiere + " - " + Iprofesseur);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        matiere_txt = new javax.swing.JComboBox<>();
        classe_txt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        professeur_txt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ajouter_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCours = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Prof en fonction");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Matiere");

        matiere_txt.setBackground(new java.awt.Color(255, 255, 255));
        matiere_txt.setForeground(new java.awt.Color(0, 0, 0));
        matiere_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matiere_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                matiere_txtFocusLost(evt);
            }
        });
        matiere_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matiere_txtMouseClicked(evt);
            }
        });
        matiere_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matiere_txtActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Classe");

        professeur_txt.setBackground(new java.awt.Color(255, 255, 255));
        professeur_txt.setForeground(new java.awt.Color(0, 0, 0));
        professeur_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                professeur_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                professeur_txtFocusLost(evt);
            }
        });
        professeur_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                professeur_txtMouseClicked(evt);
            }
        });
        professeur_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professeur_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Professeur");

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classe_txt, 0, 213, Short.MAX_VALUE)
                    .addComponent(matiere_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(professeur_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(ajouter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ajouter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(classe_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(matiere_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(professeur_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 200));

        tableCours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableCours);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 280, 490, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matiere_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matiere_txtFocusGained

    }//GEN-LAST:event_matiere_txtFocusGained

    private void matiere_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matiere_txtFocusLost

    }//GEN-LAST:event_matiere_txtFocusLost

    private void matiere_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matiere_txtMouseClicked

    }//GEN-LAST:event_matiere_txtMouseClicked

    private void matiere_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matiere_txtActionPerformed

    }//GEN-LAST:event_matiere_txtActionPerformed

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        Inscription();
    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void classe_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_classe_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_classe_txtFocusGained

    private void classe_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_classe_txtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_classe_txtFocusLost

    private void classe_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classe_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_classe_txtMouseClicked

    private void classe_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classe_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classe_txtActionPerformed

    private void professeur_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_professeur_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_professeur_txtFocusGained

    private void professeur_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_professeur_txtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_professeur_txtFocusLost

    private void professeur_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professeur_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_professeur_txtMouseClicked

    private void professeur_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professeur_txtActionPerformed
        
    }//GEN-LAST:event_professeur_txtActionPerformed

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
            java.util.logging.Logger.getLogger(AffecterProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffecterProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffecterProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffecterProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AffecterProfesseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JComboBox<String> classe_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> matiere_txt;
    private javax.swing.JComboBox<String> professeur_txt;
    private javax.swing.JTable tableCours;
    // End of variables declaration//GEN-END:variables
}
