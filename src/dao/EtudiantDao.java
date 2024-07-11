/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.EtudiantJpaController;

/**
 *
 * @author yanga
 */
public class EtudiantDao {
       private static EtudiantJpaController ETUDIANT_DAO;
    
    public static EtudiantJpaController getEtudiantDao(){
        if(ETUDIANT_DAO == null){
            ETUDIANT_DAO = new EtudiantJpaController();
        }
        
        return ETUDIANT_DAO;
        
    }
}
