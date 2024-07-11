/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author yanga
 */
public class Security {

    public String hashPassword(String password) {
        try {
            // Créer une instance de MessageDigest avec l'algorithme SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Mettre le mot de passe dans le MessageDigest
            md.update(password.getBytes());

            // Récupérer le haché du mot de passe
            byte[] hashedBytes = md.digest();

            // Convertir les bytes en représentation hexadécimale
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Erreur de hachage : " + e.getMessage());
            return null;
        }
    }
    
}
