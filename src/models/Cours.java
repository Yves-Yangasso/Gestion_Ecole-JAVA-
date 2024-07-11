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
@Table(name = "cours")
@NamedQueries({
    @NamedQuery(name = "Cours.findAll", query = "SELECT c FROM Cours c"),
    @NamedQuery(name = "Cours.findById", query = "SELECT c FROM Cours c WHERE c.id = :id")})
public class Cours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Classe classeId;
    @JoinColumn(name = "matiere_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Matiere matiereId;
    @JoinColumn(name = "professeur_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Professeur professeurId;

    public Cours() {
    }

    public Cours(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Classe getClasseId() {
        return classeId;
    }

    public void setClasseId(Classe classeId) {
        this.classeId = classeId;
    }

    public Matiere getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(Matiere matiereId) {
        this.matiereId = matiereId;
    }

    public Professeur getProfesseurId() {
        return professeurId;
    }

    public void setProfesseurId(Professeur professeurId) {
        this.professeurId = professeurId;
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
        if (!(object instanceof Cours)) {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Cours[ id=" + id + " ]";
    }
    
}
