/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print;

/**
 *
 * @author yanga
 */
public class Pmatiere {

    private String Matiere;
    
    private int Nombre_Heure;

    public Pmatiere() {
    }

    public Pmatiere(String Matiere, int Nombre_Heure) {
        this.Matiere = Matiere;
        this.Nombre_Heure = Nombre_Heure;
    }
    
    

    public String getMatiere() {
        return Matiere;
    }

    public void setMatiere(String Matiere) {
        this.Matiere = Matiere;
    }

    public int getNombre_Heure() {
        return Nombre_Heure;
    }

    public void setNombre_Heure(int Nombre_Heure) {
        this.Nombre_Heure = Nombre_Heure;
    }
    
    
}
