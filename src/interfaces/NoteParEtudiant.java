/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.NoteDao;
import dao.ScolariteDao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Note;
import models.Scolarite;
import print.Pnote;
import utils.UtilsFonction;

/**
 *
 * @author yanga
 */
public class NoteParEtudiant extends javax.swing.JFrame {

    /**
     * Creates new form NoteParEtudiant
     */
    public NoteParEtudiant() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void AfficherEtudiantByNote(String mat) {
    List<Note> list = NoteDao.getNoteDao().findNoteEntities();
    
    List<Note> sco = list.stream()
        .filter(sc -> sc.getEtudiantId() != null && sc.getEtudiantId().getMatricule().equals(mat))
        .collect(Collectors.toList());
    
    List<Pnote> note = new ArrayList<>();
    
    for(Note s : sco){
        Pnote n = new Pnote(s.getNote(), s.getEtudiantId().getNom() + " - " + s.getEtudiantId().getPrenom(), s.getMatiereId().getLibelle());
        note.add(n);
    }
    
    if (!sco.isEmpty()) {
        UtilsFonction.displayDataInTable(note, tableEtudiant);
    } else {
        JOptionPane.showMessageDialog(this, "L'etudiant n'a pas de note !!!");
        rClasse_txt.setText("");
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utilisateurs = new javax.swing.JPanel();
        welcomeText1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEtudiant = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        scolarite_btn1 = new javax.swing.JButton();
        rClasse_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        utilisateurs.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText1.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText1.setText("Note Etudiant");

        tableEtudiant.setBackground(new java.awt.Color(255, 255, 255));
        tableEtudiant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableEtudiant.setForeground(new java.awt.Color(0, 0, 0));
        tableEtudiant.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEtudiant.setRowHeight(30);
        tableEtudiant.setRowMargin(2);
        jScrollPane2.setViewportView(tableEtudiant);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scolarite_btn1.setBackground(new java.awt.Color(51, 153, 255));
        scolarite_btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scolarite_btn1.setForeground(new java.awt.Color(255, 255, 255));
        scolarite_btn1.setText("Rechercher");
        scolarite_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scolarite_btn1ActionPerformed(evt);
            }
        });

        rClasse_txt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rClasse_txt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(rClasse_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(scolarite_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rClasse_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scolarite_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout utilisateursLayout = new javax.swing.GroupLayout(utilisateurs);
        utilisateurs.setLayout(utilisateursLayout);
        utilisateursLayout.setHorizontalGroup(
            utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilisateursLayout.createSequentialGroup()
                .addGroup(utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utilisateursLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(utilisateursLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(welcomeText1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        utilisateursLayout.setVerticalGroup(
            utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilisateursLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(welcomeText1)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utilisateurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utilisateurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scolarite_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scolarite_btn1ActionPerformed
        String recherche = rClasse_txt.getText();

        if(!recherche.isBlank()){
            AfficherEtudiantByNote(recherche);
        }else{
            JOptionPane.showMessageDialog(this, "Veuillez saisir la matricule de l'etudiant !!! ");
        }
    }//GEN-LAST:event_scolarite_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(NoteParEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoteParEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoteParEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoteParEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoteParEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rClasse_txt;
    private javax.swing.JButton scolarite_btn1;
    private javax.swing.JTable tableEtudiant;
    private javax.swing.JPanel utilisateurs;
    private javax.swing.JLabel welcomeText1;
    // End of variables declaration//GEN-END:variables
}
