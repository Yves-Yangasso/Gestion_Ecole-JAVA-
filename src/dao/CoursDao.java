/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.CoursJpaController;

/**
 *
 * @author yanga
 */
public class CoursDao {
    private static CoursJpaController COURS_DAO;
    
    public static CoursJpaController getCoursDao(){
        if(COURS_DAO == null){
            COURS_DAO = new CoursJpaController();
        }
        
        return COURS_DAO;
        
    }
}
