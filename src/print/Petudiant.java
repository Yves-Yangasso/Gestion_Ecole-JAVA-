/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package print;



/**
 *
 * @author yanga
 */
public class Petudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private int inscription;
    private String telephone;
    private String email;
    private String user;

    public Petudiant() {
    }

    public Petudiant(String matricule, String nom, String prenom, int inscription, String telephone, String email, String user) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.inscription = inscription;
        this.telephone = telephone;
        this.email = email;
        this.user = user;
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

    public int getInscription() {
        return inscription;
    }

    public void setInscription(int inscription) {
        this.inscription = inscription;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    
}
