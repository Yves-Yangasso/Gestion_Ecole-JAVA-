/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import dao.EtudiantDao;
import dao.ProfesseurDao;
import dao.UtilisateurDao;
import static interfaces.connexionUtilisateur.emailUtilisateur;
import static interfaces.connexionUtilisateur.roleUtilisateur;
import java.util.ArrayList;
import java.util.List;
import models.Etudiant;
import models.Professeur;
import models.Utilisateur;
import print.Petudiant;
import print.Pprofesseur;
import print.Putilisateur;
import utils.UtilsFonction;

/**
 *
 * @author yanga
 */
public class Menus extends javax.swing.JFrame {

    public Menus() {
        initComponents();
        setLocationRelativeTo(null);
        allMenus.setSelectedIndex(0);
        cnx_txt.setText(emailUtilisateur);
        AfficherUtilisateur();
        AfficherEtudiant();
        AfficherProfesseur();
        if(roleUtilisateur.equals("Utilisateur")){
            utilisateurs_btn.setVisible(false);
        }
    }

    private void AfficherUtilisateur() {

        List<Utilisateur> list = UtilisateurDao.getUtilisateurDao().findUtilisateurEntities();
        
        Putilisateur user = new Putilisateur();
        
        List<Putilisateur> luser = new ArrayList<>();
        
        for(Utilisateur u : list){
            user.setEmail(u.getEmail());
            user.setNom(u.getNom());
            user.setPrenom(u.getPrenom());
            user.setRole(u.getRole());
            user.setTelephone(u.getTelephone());
            user.setUsername(u.getUsername());
            
            luser.add(user);
        }
        
      UtilsFonction.displayDataInTable(luser, tableUtilisateur);
    }
    
    private void AfficherProfesseur() {

        List<Professeur> list = ProfesseurDao.getProfesseurDao().findProfesseurEntities();
        
        Pprofesseur prof = new Pprofesseur();
        
        List<Pprofesseur> Lprof = new ArrayList<>();
        
        for(Professeur p : list){
            prof.setAdresse(p.getAdresse());
            prof.setEmail(p.getEmail());
            prof.setMatricule(p.getMatricule());
            prof.setNom(p.getNom());
            prof.setPrenom(p.getPrenom());
            prof.setTelephone(p.getTelephone());
            prof.setUser(p.getUserId().getNom() + " - " + p.getUserId().getPrenom());
            
            Lprof.add(prof);
        }
      UtilsFonction.displayDataInTable(Lprof, tableProfesseurs);
    }
    
    private void AfficherEtudiant() {

        List<Etudiant> list = EtudiantDao.getEtudiantDao().findEtudiantEntities();
        
        Petudiant etu = new Petudiant();
        
        List<Petudiant> Letu = new ArrayList<>();
        
        for(Etudiant e : list){
            etu.setEmail(e.getEmail());
            etu.setInscription(e.getInscription());
            etu.setMatricule(e.getMatricule());
            etu.setNom(e.getNom());
            etu.setPrenom(e.getPrenom());
            etu.setTelephone(e.getTelephone());
            etu.setUser(e.getUserId().getNom() + " - " + e.getUserId().getPrenom());
            
            Letu.add(etu);
        }
        
      UtilsFonction.displayDataInTable(Letu, tableEtudiant);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        utilisateurs_btn = new javax.swing.JButton();
        Etudiants_btn = new javax.swing.JButton();
        Enseignants_btn = new javax.swing.JButton();
        Examens_btn = new javax.swing.JButton();
        Deconnexion_btn = new javax.swing.JButton();
        cnx_txt = new javax.swing.JLabel();
        allMenus = new javax.swing.JTabbedPane();
        welcome = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messages = new javax.swing.JPanel();
        welcomeText4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUtilisateur = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        crudUtilisateur_btn = new javax.swing.JButton();
        actualiser = new javax.swing.JButton();
        utilisateurs = new javax.swing.JPanel();
        welcomeText1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEtudiant = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        scolarite_btn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        actualiserEtu = new javax.swing.JButton();
        scolarite_btn1 = new javax.swing.JButton();
        etudiants = new javax.swing.JPanel();
        welcomeText2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        insertEnseignant_btn = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        actualiserProf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProfesseurs = new javax.swing.JTable();
        enseignants = new javax.swing.JPanel();
        welcomeText3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        examans = new javax.swing.JPanel();
        welcomeText5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menu-64.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        utilisateurs_btn.setBackground(new java.awt.Color(51, 153, 255));
        utilisateurs_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        utilisateurs_btn.setForeground(new java.awt.Color(255, 255, 255));
        utilisateurs_btn.setText("Utilisateur");
        utilisateurs_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilisateurs_btnActionPerformed(evt);
            }
        });

        Etudiants_btn.setBackground(new java.awt.Color(51, 153, 255));
        Etudiants_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Etudiants_btn.setForeground(new java.awt.Color(255, 255, 255));
        Etudiants_btn.setText("Etudiants");
        Etudiants_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Etudiants_btnActionPerformed(evt);
            }
        });

        Enseignants_btn.setBackground(new java.awt.Color(51, 153, 255));
        Enseignants_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Enseignants_btn.setForeground(new java.awt.Color(255, 255, 255));
        Enseignants_btn.setText("Enseignants");
        Enseignants_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enseignants_btnActionPerformed(evt);
            }
        });

        Examens_btn.setBackground(new java.awt.Color(51, 153, 255));
        Examens_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Examens_btn.setForeground(new java.awt.Color(255, 255, 255));
        Examens_btn.setText("Examens");
        Examens_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Examens_btnActionPerformed(evt);
            }
        });

        Deconnexion_btn.setBackground(new java.awt.Color(255, 51, 51));
        Deconnexion_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Deconnexion_btn.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion_btn.setText("Deconnection");
        Deconnexion_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deconnexion_btnActionPerformed(evt);
            }
        });

        cnx_txt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnx_txt.setForeground(new java.awt.Color(255, 255, 255));
        cnx_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnx_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-utilisateur-64 (1).png"))); // NOI18N
        cnx_txt.setText("Utilisateur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(utilisateurs_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Etudiants_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Enseignants_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Examens_btn)
                .addGap(185, 185, 185)
                .addComponent(cnx_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Deconnexion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Deconnexion_btn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Etudiants_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(utilisateurs_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Enseignants_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cnx_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Examens_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        welcome.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText.setText("Bienvenue sur notre application");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/l1-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                        .addComponent(welcomeText)
                        .addGap(202, 202, 202))))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(welcomeText)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        allMenus.addTab("tab1", welcome);

        messages.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText4.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText4.setText("Utilisateurs");

        tableUtilisateur.setBackground(new java.awt.Color(255, 255, 255));
        tableUtilisateur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableUtilisateur.setForeground(new java.awt.Color(0, 0, 0));
        tableUtilisateur.setRowHeight(30);
        tableUtilisateur.setRowMargin(2);
        jScrollPane1.setViewportView(tableUtilisateur);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        crudUtilisateur_btn.setBackground(new java.awt.Color(51, 153, 255));
        crudUtilisateur_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crudUtilisateur_btn.setForeground(new java.awt.Color(255, 255, 255));
        crudUtilisateur_btn.setText("Créer un utilisateur");
        crudUtilisateur_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudUtilisateur_btnActionPerformed(evt);
            }
        });

        actualiser.setBackground(new java.awt.Color(102, 255, 102));
        actualiser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actualiser.setForeground(new java.awt.Color(255, 255, 255));
        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(crudUtilisateur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                .addComponent(actualiser)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crudUtilisateur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout messagesLayout = new javax.swing.GroupLayout(messages);
        messages.setLayout(messagesLayout);
        messagesLayout.setHorizontalGroup(
            messagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(messagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagesLayout.createSequentialGroup()
                        .addComponent(welcomeText4)
                        .addGap(357, 357, 357))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messagesLayout.createSequentialGroup()
                        .addGroup(messagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        messagesLayout.setVerticalGroup(
            messagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messagesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(welcomeText4)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        allMenus.addTab("tab5", messages);

        utilisateurs.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText1.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText1.setText("Etudiants");

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

        scolarite_btn.setBackground(new java.awt.Color(51, 153, 255));
        scolarite_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scolarite_btn.setForeground(new java.awt.Color(255, 255, 255));
        scolarite_btn.setText("Scolarité");
        scolarite_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scolarite_btnActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Inscription");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        actualiserEtu.setBackground(new java.awt.Color(102, 255, 51));
        actualiserEtu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actualiserEtu.setForeground(new java.awt.Color(255, 255, 255));
        actualiserEtu.setText("Actualiser");
        actualiserEtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserEtuActionPerformed(evt);
            }
        });

        scolarite_btn1.setBackground(new java.awt.Color(51, 153, 255));
        scolarite_btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scolarite_btn1.setForeground(new java.awt.Color(255, 255, 255));
        scolarite_btn1.setText("Etudiant par Classe");
        scolarite_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scolarite_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(actualiserEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(scolarite_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scolarite_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scolarite_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualiserEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scolarite_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout utilisateursLayout = new javax.swing.GroupLayout(utilisateurs);
        utilisateurs.setLayout(utilisateursLayout);
        utilisateursLayout.setHorizontalGroup(
            utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, utilisateursLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeText1)
                .addGap(375, 375, 375))
            .addGroup(utilisateursLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        utilisateursLayout.setVerticalGroup(
            utilisateursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilisateursLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(welcomeText1)
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        allMenus.addTab("tab2", utilisateurs);

        etudiants.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText2.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText2.setText("Enseignants");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        insertEnseignant_btn.setBackground(new java.awt.Color(51, 153, 255));
        insertEnseignant_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        insertEnseignant_btn.setForeground(new java.awt.Color(255, 255, 255));
        insertEnseignant_btn.setText("Créer un enseignant");
        insertEnseignant_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertEnseignant_btnActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(51, 153, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Affecter dans une classe");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        actualiserProf.setBackground(new java.awt.Color(153, 255, 102));
        actualiserProf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        actualiserProf.setForeground(new java.awt.Color(255, 255, 255));
        actualiserProf.setText("Actualiser");
        actualiserProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(insertEnseignant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualiserProf)
                .addGap(129, 129, 129)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertEnseignant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualiserProf))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tableProfesseurs.setBackground(new java.awt.Color(255, 255, 255));
        tableProfesseurs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableProfesseurs.setForeground(new java.awt.Color(0, 0, 0));
        tableProfesseurs.setModel(new javax.swing.table.DefaultTableModel(
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
        tableProfesseurs.setRowHeight(30);
        tableProfesseurs.setRowMargin(2);
        jScrollPane3.setViewportView(tableProfesseurs);

        javax.swing.GroupLayout etudiantsLayout = new javax.swing.GroupLayout(etudiants);
        etudiants.setLayout(etudiantsLayout);
        etudiantsLayout.setHorizontalGroup(
            etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, etudiantsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeText2)
                .addGap(362, 362, 362))
            .addGroup(etudiantsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        etudiantsLayout.setVerticalGroup(
            etudiantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(etudiantsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(welcomeText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        allMenus.addTab("tab3", etudiants);

        enseignants.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText3.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText3.setText("Messages");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton13.setBackground(new java.awt.Color(51, 153, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Messages");

        jButton14.setBackground(new java.awt.Color(51, 153, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Annonces");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Type de message");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jButton15.setBackground(new java.awt.Color(51, 153, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Envoyer");

        javax.swing.GroupLayout enseignantsLayout = new javax.swing.GroupLayout(enseignants);
        enseignants.setLayout(enseignantsLayout);
        enseignantsLayout.setHorizontalGroup(
            enseignantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enseignantsLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(enseignantsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enseignantsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(enseignantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enseignantsLayout.createSequentialGroup()
                        .addComponent(welcomeText3)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enseignantsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enseignantsLayout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))))
        );
        enseignantsLayout.setVerticalGroup(
            enseignantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enseignantsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(welcomeText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(enseignantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        allMenus.addTab("tab4", enseignants);

        examans.setBackground(new java.awt.Color(255, 255, 255));

        welcomeText5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText5.setForeground(new java.awt.Color(51, 153, 255));
        welcomeText5.setText("Examens");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton16.setBackground(new java.awt.Color(51, 153, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Classe");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(51, 153, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Matiere");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(51, 153, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Notes");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 153, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Voir les notes d'etudiant");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout examansLayout = new javax.swing.GroupLayout(examans);
        examans.setLayout(examansLayout);
        examansLayout.setHorizontalGroup(
            examansLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examansLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(examansLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(welcomeText5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        examansLayout.setVerticalGroup(
            examansLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examansLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(welcomeText5)
                .addGap(52, 52, 52)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        allMenus.addTab("tab6", examans);

        jPanel1.add(allMenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void utilisateurs_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilisateurs_btnActionPerformed
        allMenus.setSelectedIndex(1);
    }//GEN-LAST:event_utilisateurs_btnActionPerformed

    private void Etudiants_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Etudiants_btnActionPerformed
        allMenus.setSelectedIndex(2);
    }//GEN-LAST:event_Etudiants_btnActionPerformed

    private void Enseignants_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enseignants_btnActionPerformed
       allMenus.setSelectedIndex(3);
    }//GEN-LAST:event_Enseignants_btnActionPerformed

    private void Examens_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Examens_btnActionPerformed
       allMenus.setSelectedIndex(5);
    }//GEN-LAST:event_Examens_btnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        allMenus.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void crudUtilisateur_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudUtilisateur_btnActionPerformed
       new InscriptionUtilisateur().setVisible(true);
        
    }//GEN-LAST:event_crudUtilisateur_btnActionPerformed

    private void scolarite_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scolarite_btnActionPerformed
         new InscriptionNewEtudiant().setVisible(true);
    }//GEN-LAST:event_scolarite_btnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          new InscriptionEtudiant().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void insertEnseignant_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertEnseignant_btnActionPerformed
         new InscriptionEnseignant().setVisible(true);
    }//GEN-LAST:event_insertEnseignant_btnActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        AfficherUtilisateur();
    }//GEN-LAST:event_actualiserActionPerformed

    private void Deconnexion_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deconnexion_btnActionPerformed
       new connexionUtilisateur().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Deconnexion_btnActionPerformed

    private void actualiserEtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserEtuActionPerformed
        AfficherEtudiant();
    }//GEN-LAST:event_actualiserEtuActionPerformed

    private void actualiserProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserProfActionPerformed
         AfficherProfesseur();
    }//GEN-LAST:event_actualiserProfActionPerformed

    private void scolarite_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scolarite_btn1ActionPerformed
        new EtudiantParClasse().setVisible(true);
    }//GEN-LAST:event_scolarite_btn1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        new AjoutClasse().setVisible(true);
 
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       new AjoutMatiere().setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        new AjoutNote().setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new AffecterProfesseur().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new NoteParEtudiant().setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deconnexion_btn;
    private javax.swing.JButton Enseignants_btn;
    private javax.swing.JButton Etudiants_btn;
    private javax.swing.JButton Examens_btn;
    private javax.swing.JButton actualiser;
    private javax.swing.JButton actualiserEtu;
    private javax.swing.JButton actualiserProf;
    private javax.swing.JTabbedPane allMenus;
    private javax.swing.JLabel cnx_txt;
    private javax.swing.JButton crudUtilisateur_btn;
    private javax.swing.JPanel enseignants;
    private javax.swing.JPanel etudiants;
    private javax.swing.JPanel examans;
    private javax.swing.JButton insertEnseignant_btn;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel messages;
    private javax.swing.JButton scolarite_btn;
    private javax.swing.JButton scolarite_btn1;
    private javax.swing.JTable tableEtudiant;
    private javax.swing.JTable tableProfesseurs;
    private javax.swing.JTable tableUtilisateur;
    private javax.swing.JPanel utilisateurs;
    private javax.swing.JButton utilisateurs_btn;
    private javax.swing.JPanel welcome;
    private javax.swing.JLabel welcomeText;
    private javax.swing.JLabel welcomeText1;
    private javax.swing.JLabel welcomeText2;
    private javax.swing.JLabel welcomeText3;
    private javax.swing.JLabel welcomeText4;
    private javax.swing.JLabel welcomeText5;
    // End of variables declaration//GEN-END:variables
}
