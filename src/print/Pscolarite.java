/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print;

/**
 *
 * @author yanga
 */
public class Pscolarite {
    private int Montant_Payer;
    private int Reste_A_Payer;
    private String classe;
    private String etudiant;

    public Pscolarite() {
    }

    public int getMontant_Payer() {
        return Montant_Payer;
    }

    public void setMontant_Payer(int Montant_Payer) {
        this.Montant_Payer = Montant_Payer;
    }

    public int getReste_A_Payer() {
        return Reste_A_Payer;
    }

    public void setReste_A_Payer(int Reste_A_Payer) {
        this.Reste_A_Payer = Reste_A_Payer;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(String etudiant) {
        this.etudiant = etudiant;
    }
    
    
}
