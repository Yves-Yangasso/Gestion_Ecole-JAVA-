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
@Table(name = "note")
@NamedQueries({
    @NamedQuery(name = "Note.findAll", query = "SELECT n FROM Note n"),
    @NamedQuery(name = "Note.findById", query = "SELECT n FROM Note n WHERE n.id = :id"),
    @NamedQuery(name = "Note.findByNote", query = "SELECT n FROM Note n WHERE n.note = :note")})
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "note")
    private float note;
    @JoinColumn(name = "etudiant_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Etudiant etudiantId;
    @JoinColumn(name = "matiere_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Matiere matiereId;

    public Note() {
    }

    public Note(Integer id) {
        this.id = id;
    }

    public Note(Integer id, float note) {
        this.id = id;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Etudiant getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(Etudiant etudiantId) {
        this.etudiantId = etudiantId;
    }

    public Matiere getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(Matiere matiereId) {
        this.matiereId = matiereId;
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
        if (!(object instanceof Note)) {
            return false;
        }
        Note other = (Note) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Note[ id=" + id + " ]";
    }
    
}
