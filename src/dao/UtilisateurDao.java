/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.UtilisateurJpaController;

/**
 *
 * @author yanga
 */
public class UtilisateurDao {
    private static UtilisateurJpaController UTILISATEUR_DAO;
    
    public static UtilisateurJpaController getUtilisateurDao(){
        if(UTILISATEUR_DAO == null){
            UTILISATEUR_DAO = new UtilisateurJpaController();
        }
        
        return UTILISATEUR_DAO;
        
    }
}
