/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.MatiereJpaController;


/**
 *
 * @author yanga
 */
public class MatiereDao {
    private static MatiereJpaController MATIERE_DAO;
    
    public static MatiereJpaController getMatiereDao(){
        if(MATIERE_DAO == null){
            MATIERE_DAO = new MatiereJpaController();
        }
        
        return MATIERE_DAO;
        
    }
}
