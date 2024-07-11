/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.ProfesseurJpaController;


public class ProfesseurDao {
       private static ProfesseurJpaController PROFESSEUR_DAO;
    
    public static ProfesseurJpaController getProfesseurDao(){
        if(PROFESSEUR_DAO == null){
            PROFESSEUR_DAO = new ProfesseurJpaController();
        }
        
        return PROFESSEUR_DAO;
        
    }
}

