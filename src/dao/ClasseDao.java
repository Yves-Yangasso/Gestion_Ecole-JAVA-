/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.ClasseJpaController;

/**
 *
 * @author yanga
 */
public class ClasseDao {
    private static ClasseJpaController CLASSE_DAO;
    
    public static ClasseJpaController getClasseDao(){
        if(CLASSE_DAO == null){
            CLASSE_DAO = new ClasseJpaController();
        }
        
        return CLASSE_DAO;
        
    }
}
