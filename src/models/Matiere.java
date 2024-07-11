/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yanga
 */
@Entity
@Table(name = "matiere")
@NamedQueries({
    @NamedQuery(name = "Matiere.findAll", query = "SELECT m FROM Matiere m"),
    @NamedQuery(name = "Matiere.findById", query = "SELECT m FROM Matiere m WHERE m.id = :id"),
    @NamedQuery(name = "Matiere.findByLibelle", query = "SELECT m FROM Matiere m WHERE m.libelle = :libelle")})
public class Matiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "libelle")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matiereId")
    private List<Note> noteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matiereId")
    private List<Cours> coursList;
    @JoinColumn(name = "idheure", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Heure idheure;

    public Matiere() {
    }

    public Matiere(Integer id) {
        this.id = id;
    }

    public Matiere(Integer id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
    }

    public Heure getIdheure() {
        return idheure;
    }

    public void setIdheure(Heure idheure) {
        this.idheure = idheure;
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
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Matiere[ id=" + id + " ]";
    }
    
}
