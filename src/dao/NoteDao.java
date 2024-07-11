/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.NoteJpaController;

/**
 *
 * @author yanga
 */
public class NoteDao {
    private static NoteJpaController NOTE_DAO;
    
    public static NoteJpaController getNoteDao(){
        if(NOTE_DAO == null){
            NOTE_DAO = new NoteJpaController();
        }
        
        return NOTE_DAO;
        
    }
}
