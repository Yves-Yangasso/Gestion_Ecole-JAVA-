/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author yanga
 */
public class MyDataSource {
     private static EntityManagerFactory emf;
    
    public static EntityManager getEntityManagement(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("Gestion_EcolePU");
        }
        return emf.createEntityManager();
    }
}
