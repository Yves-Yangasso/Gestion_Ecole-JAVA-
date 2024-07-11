/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.ClasseDao;
import java.util.List;
import javax.swing.JOptionPane;
import models.Classe;
import utils.UtilsFonction;

/**
 *
 * @author yanga
 */
public class AjoutClasse extends javax.swing.JFrame {

    /**
     * Creates new form AjoutClasse
     */
    public AjoutClasse() {
        initComponents();
        setLocationRelativeTo(this);
        AfficherClasse();
    }

    public int createCode() {
        List<Classe> classes = ClasseDao.getClasseDao().findClasseEntities();
        int cpt = 1;

        Classe cla = new Classe();

        for (Classe classe : classes) {
            cpt++;
            cla = classe;
        }

        int tmp = cla.getId();
        return tmp;
    }

    private void AfficherClasse() {
        List<Classe> list = ClasseDao.getClasseDao().findClasseEntities();
        UtilsFonction.displayDataInTable(list, tableClasse, List.of("id", "scolariteList", "coursList"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        libelle_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ajouter_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClasse = new javax.swing.JTable();
        supprimer_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("AJOUT CLASSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        libelle_txt.setBackground(new java.awt.Color(255, 255, 255));
        libelle_txt.setForeground(new java.awt.Color(0, 0, 0));
        libelle_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelle_txtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Libelle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(libelle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(libelle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 70));

        ajouter_btn.setBackground(new java.awt.Color(51, 153, 255));
        ajouter_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ajouter_btn.setForeground(new java.awt.Color(255, 255, 255));
        ajouter_btn.setText("Ajouter");
        ajouter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_btnActionPerformed(evt);
            }
        });
        jPanel1.add(ajouter_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 210, 40));

        tableClasse.setModel(new javax.swing.table.DefaultTableModel(
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
        tableClasse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClasseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClasse);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 500, 220));

        supprimer_btn.setBackground(new java.awt.Color(255, 51, 51));
        supprimer_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        supprimer_btn.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_btn.setText("Supprimer");
        supprimer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_btnActionPerformed(evt);
            }
        });
        jPanel1.add(supprimer_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void libelle_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelle_txtActionPerformed

    }//GEN-LAST:event_libelle_txtActionPerformed

    private void ajouter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_btnActionPerformed
        if (!libelle_txt.getText().isBlank()) {

            int code = createCode();
            String libelle = libelle_txt.getText();

            try {
                Classe cla = new Classe();

                cla.setCode(code);
                cla.setNom(libelle);

                ClasseDao.getClasseDao().create(cla);

                JOptionPane.showMessageDialog(null, "Inscription réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                AfficherClasse();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Échec d'inscription: " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Veuillez saisir une Classe");
        }

    }//GEN-LAST:event_ajouter_btnActionPerformed

    private void tableClasseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClasseMouseClicked

        int selectedRow = tableClasse.getSelectedRow();
        int selectedColumn = tableClasse.getSelectedColumn();
        if (selectedRow != -1 && selectedColumn != -1) { // Check if a cell is selected
            Object value = tableClasse.getValueAt(selectedRow, selectedColumn);
            libelle_txt.setText(value.toString());
        }


    }//GEN-LAST:event_tableClasseMouseClicked

    private void supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_btnActionPerformed
       String id_tmp = libelle_txt.getText();
   
       int id = Integer.parseInt(id_tmp);
       
        try {
             //  System.out.println("id "+id);
            ClasseDao.getClasseDao().destroy(Integer.parseInt(id_tmp));
            
            JOptionPane.showMessageDialog(this, "Classe supprime");
            AfficherClasse();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Impossible de supprimer la classe ! Cliquez sur l'ID ");
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
            java.util.logging.Logger.getLogger(AjoutClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutClasse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelle_txt;
    private javax.swing.JButton supprimer_btn;
    private javax.swing.JTable tableClasse;
    // End of variables declaration//GEN-END:variables
}
