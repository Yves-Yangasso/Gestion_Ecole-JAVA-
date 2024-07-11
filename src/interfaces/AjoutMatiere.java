/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ClasseDao;
import dao.CoursDao;
import dao.EtudiantDao;
import dao.HeureDao;
import dao.MatiereDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Classe;
import models.Cours;
import models.Etudiant;
import models.Heure;
import models.Matiere;
import print.Pmatiere;
import utils.UtilsFonction;

/**
 *
 * @author yanga
 */
public class AjoutMatiere extends javax.swing.JFrame {

    /**
     * Creates new form AjoutMatiere
     */
    public AjoutMatiere() {
        initComponents();
        setLocationRelativeTo(null);
        chargerHeure();
        AfficherMatiere();
    }

     public Heure getHeureByNb(int hr) {
        List<Heure> heures = HeureDao.getHeureDao().findHeureEntities();

        for (Heure h : heures) {
           if (h.getNombre() == hr) {
                return h;
            }
        }

        return null;
    }

       private void chargerHeure() {
        //classe_txt.removeAllItems();
        List<Heure> heures = HeureDao.getHeureDao().findHeureEntities();

        for (Heure h : heures) {
            heure_txt.addItem(""+h.getNombre());
        }
    }
       
     private void AfficherMatiere() {
       List<Matiere> list = MatiereDao.getMatiereDao().findMatiereEntities();

       List<Pmatiere> Lsc = new ArrayList<>();
       
       for(Matiere m : list){
           
            Pmatiere mat = new Pmatiere(m.getLibelle(),m.getIdheure().getNombre());

           Lsc.add(mat);
           
       }
 
       
        UtilsFonction.displayDataInTable(Lsc, tableHeure);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        matiere_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        heure_txt = new javax.swing.JComboBox<>();
        ajouter_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHeure = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("AJOUT MATIERE");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        matiere_txt.setBackground(new java.awt.Color(255, 255, 255));
        matiere_txt.setForeground(new java.awt.Color(0, 0, 0));
        matiere_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matiere_txtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Matiere");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nb heure");

        heure_txt.setBackground(new java.awt.Color(255, 255, 255));
        heure_txt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matiere_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(heure_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matiere_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(heure_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 150));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });
        jPanel5.add(ajouter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 450, 40));

        tableHeure.setModel(new javax.swing.table.DefaultTableModel(
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
        tableHeure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHeureMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHeure);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 500, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matiere_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matiere_txtActionPerformed

    }//GEN-LAST:event_matiere_txtActionPerformed

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        if (!matiere_txt.getText().isBlank()) {


            String matiere = matiere_txt.getText();
            
            String heure = heure_txt.getSelectedItem().toString();

            try {
               
                int hr = Integer.parseInt(heure);
                
                Heure h = new Heure();
                
                h = getHeureByNb(hr);
                
                Matiere mat = new Matiere();
                mat.setLibelle(matiere);
                mat.setIdheure(h);
                
                MatiereDao.getMatiereDao().create(mat);

                JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                AfficherMatiere();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez saisir une Classe");
        }
    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void tableHeureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHeureMouseClicked

        int selectedRow = tableHeure.getSelectedRow();
        int selectedColumn = tableHeure.getSelectedColumn();
        if (selectedRow != -1 && selectedColumn != -1) { // Check if a cell is selected
            Object value = tableHeure.getValueAt(selectedRow, selectedColumn);
            matiere_txt.setText(value.toString());
        }

    }//GEN-LAST:event_tableHeureMouseClicked

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
            java.util.logging.Logger.getLogger(AjoutMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutMatiere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutMatiere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JComboBox<String> heure_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelle_txt;
    private javax.swing.JTextField libelle_txt1;
    private javax.swing.JTextField matiere_txt;
    private javax.swing.JTable tableHeure;
    // End of variables declaration//GEN-END:variables
}
