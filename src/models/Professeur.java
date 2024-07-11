/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author yanga
 */
@Entity
@Table(name = "professeur")
@NamedQueries({
    @NamedQuery(name = "Professeur.findAll", query = "SELECT p FROM Professeur p"),
    @NamedQuery(name = "Professeur.findById", query = "SELECT p FROM Professeur p WHERE p.id = :id"),
    @NamedQuery(name = "Professeur.findByMatricule", query = "SELECT p FROM Professeur p WHERE p.matricule = :matricule"),
    @NamedQuery(name = "Professeur.findByNom", query = "SELECT p FROM Professeur p WHERE p.nom = :nom"),
    @NamedQuery(name = "Professeur.findByPrenom", query = "SELECT p FROM Professeur p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Professeur.findByTelephone", query = "SELECT p FROM Professeur p WHERE p.telephone = :telephone"),
    @NamedQuery(name = "Professeur.findByEmail", query = "SELECT p FROM Professeur p WHERE p.email = :email"),
    @NamedQuery(name = "Professeur.findByAdresse", query = "SELECT p FROM Professeur p WHERE p.adresse = :adresse")})
public class Professeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "matricule")
    private String matricule;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "adresse")
    private String adresse;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Utilisateur userId;

    public Professeur() {
    }

    public Professeur(Integer id) {
        this.id = id;
    }

    public Professeur(Integer id, String matricule, String nom, String prenom, String telephone, String email, String adresse) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Utilisateur getUserId() {
        return userId;
    }

    public void setUserId(Utilisateur userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professeur)) {
            return false;
        }
        Professeur other = (Professeur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Professeur[ id=" + id + " ]";
    }
    
}
