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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author yanga
 */
@Entity
@Table(name = "classe")
@NamedQueries({
    @NamedQuery(name = "Classe.findAll", query = "SELECT c FROM Classe c"),
    @NamedQuery(name = "Classe.findById", query = "SELECT c FROM Classe c WHERE c.id = :id"),
    @NamedQuery(name = "Classe.findByCode", query = "SELECT c FROM Classe c WHERE c.code = :code"),
    @NamedQuery(name = "Classe.findByNom", query = "SELECT c FROM Classe c WHERE c.nom = :nom")})
public class Classe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "code")
    private int code;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classeId")
    private List<Scolarite> scolariteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classeId")
    private List<Cours> coursList;

    public Classe() {
    }

    public Classe(Integer id) {
        this.id = id;
    }

    public Classe(Integer id, int code, String nom) {
        this.id = id;
        this.code = code;
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Scolarite> getScolariteList() {
        return scolariteList;
    }

    public void setScolariteList(List<Scolarite> scolariteList) {
        this.scolariteList = scolariteList;
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
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
        if (!(object instanceof Classe)) {
            return false;
        }
        Classe other = (Classe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Classe[ id=" + id + " ]";
    }
    
}
