/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print;

/**
 *
 * @author yanga
 */
public class Pnote {

    private float note;
    private String etudiant;
    private String matiere;

    public Pnote(float note, String etudiant, String matiere) {
        this.note = note;
        this.etudiant = etudiant;
        this.matiere = matiere;
    }

    public Pnote() {
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(String etudiant) {
        this.etudiant = etudiant;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    
    
}
