/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.MyDataSource;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import models.Note;
import models.Utilisateur;

/**
 *
 * @author yanga
 */
public class NoteJpaController implements Serializable {
    private EntityManagerFactory emf;

    public NoteJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Note n) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(n);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Note n) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(n);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void destroy(int id) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            Note n = em.find(Note.class, id);
            if (n != null) {
                em.remove(n);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Note findNote(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Note.class, id);
        } finally {
            em.close();
        }
    }

    public List<Note> findNoteEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Note p", Note.class).getResultList();
        } finally {
            em.close();
        }
    }
}
