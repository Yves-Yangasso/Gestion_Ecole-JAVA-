/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.ScolariteJpaController;

/**
 *
 * @author yanga
 */
public class ScolariteDao {
    private static ScolariteJpaController SCOLARITE_DAO;
    
    public static ScolariteJpaController getScolariteDao(){
        if(SCOLARITE_DAO == null){
            SCOLARITE_DAO = new ScolariteJpaController();
        }
        
        return SCOLARITE_DAO;
        
    }
}
