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
@Table(name = "scolarite")
@NamedQueries({
    @NamedQuery(name = "Scolarite.findAll", query = "SELECT s FROM Scolarite s"),
    @NamedQuery(name = "Scolarite.findById", query = "SELECT s FROM Scolarite s WHERE s.id = :id"),
    @NamedQuery(name = "Scolarite.findByMtnP", query = "SELECT s FROM Scolarite s WHERE s.mtnP = :mtnP"),
    @NamedQuery(name = "Scolarite.findByMtnR", query = "SELECT s FROM Scolarite s WHERE s.mtnR = :mtnR")})
public class Scolarite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "mtnP")
    private int mtnP;
    @Basic(optional = false)
    @Column(name = "mtnR")
    private int mtnR;
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Classe classeId;
    @JoinColumn(name = "etudiant_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Etudiant etudiantId;

    public Scolarite() {
    }

    public Scolarite(Integer id) {
        this.id = id;
    }

    public Scolarite(Integer id, int mtnP, int mtnR) {
        this.id = id;
        this.mtnP = mtnP;
        this.mtnR = mtnR;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMtnP() {
        return mtnP;
    }

    public void setMtnP(int mtnP) {
        this.mtnP = mtnP;
    }

    public int getMtnR() {
        return mtnR;
    }

    public void setMtnR(int mtnR) {
        this.mtnR = mtnR;
    }

    public Classe getClasseId() {
        return classeId;
    }

    public void setClasseId(Classe classeId) {
        this.classeId = classeId;
    }

    public Etudiant getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(Etudiant etudiantId) {
        this.etudiantId = etudiantId;
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
        if (!(object instanceof Scolarite)) {
            return false;
        }
        Scolarite other = (Scolarite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Scolarite[ id=" + id + " ]";
    }
    
}
