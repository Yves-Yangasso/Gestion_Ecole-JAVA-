/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ClasseDao;
import dao.EtudiantDao;
import dao.MatiereDao;
import dao.NoteDao;
import dao.ScolariteDao;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Classe;
import models.Etudiant;
import models.Matiere;
import models.Note;
import models.Professeur;
import models.Scolarite;
import utils.UtilsFonction;

/**
 *
 * @author yanga
 */
public class AjoutNote extends javax.swing.JFrame {

    /**
     * Creates new form AjoutNote
     */
    public AjoutNote() {
        initComponents();
        setLocationRelativeTo(null);
        chargerMatiere();
    }

    private void chargerMatiere() {
        //classe_txt.removeAllItems();
        List<Matiere> matieres = MatiereDao.getMatiereDao().findMatiereEntities();

        for (Matiere mat : matieres) {
            matiere_txt.addItem(mat.getId() + " - " + mat.getLibelle());
        }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        matricule_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        matiere_txt = new javax.swing.JComboBox<>();
        note_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ajouter_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("AJOUT NOTE");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        matricule_txt.setBackground(new java.awt.Color(255, 255, 255));
        matricule_txt.setForeground(new java.awt.Color(0, 0, 0));
        matricule_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricule_txtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Matricule Etudiant");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Matiere");

        matiere_txt.setBackground(new java.awt.Color(255, 255, 255));
        matiere_txt.setForeground(new java.awt.Color(0, 0, 0));

        note_txt.setBackground(new java.awt.Color(255, 255, 255));
        note_txt.setForeground(new java.awt.Color(0, 0, 0));
        note_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note_txtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Note");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matricule_txt)
                    .addComponent(matiere_txt, 0, 299, Short.MAX_VALUE)
                    .addComponent(note_txt))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matricule_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(matiere_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(note_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 170));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });
        jPanel5.add(ajouter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 450, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matricule_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricule_txtActionPerformed

    }//GEN-LAST:event_matricule_txtActionPerformed

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        String matricule = matricule_txt.getText();
        String note = note_txt.getText();
        String idM_str = matiere_txt.getSelectedItem().toString();

        if (matricule.isBlank() || note.isBlank()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoire !!! ");
            return;
        }

               int noteEtu = Integer.parseInt(note);
                if (!(noteEtu > 0 && noteEtu <= 20)) {
                    JOptionPane.showMessageDialog(this, "La note doit etre entre ( 1 - 20 )");
                    return ;
                }

        if (getEtudiantByMatricule(matricule) == null) {
            JOptionPane.showMessageDialog(this, "L'etudiant n'existe pas  !!! ");
            return;
        }

        int Imatiere = getNumberCh(idM_str);

        Matiere mat = new Matiere();

        mat = MatiereDao.getMatiereDao().findMatiere(Imatiere);

        Etudiant etu = new Etudiant();

        etu = getEtudiantByMatricule(matricule);


        try {
            Note n = new Note();
            n.setNote(noteEtu);
            n.setEtudiantId(etu);
            n.setMatiereId(mat);
            NoteDao.getNoteDao().create(n);
            
            JOptionPane.showMessageDialog(this, "La note a ete affecter a l'etudiant  "+etu.getNom()+" !!! ");
            
            matricule_txt.setText("");
            note_txt.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Impossible d'ajouter  !!! ");
        }

    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void note_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_note_txtActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> matiere_txt;
    private javax.swing.JTextField matricule_txt;
    private javax.swing.JTextField note_txt;
    // End of variables declaration//GEN-END:variables
}
