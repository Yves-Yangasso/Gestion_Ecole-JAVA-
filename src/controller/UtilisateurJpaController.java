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
import models.Utilisateur;

/**
 *
 * @author yanga
 */
public class UtilisateurJpaController implements Serializable {
    private EntityManagerFactory emf;

    public UtilisateurJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Utilisateur user) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(user);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Utilisateur user) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(user);
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
            Utilisateur user = em.find(Utilisateur.class, id);
            if (user != null) {
                em.remove(user);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Utilisateur findUtilisateur(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Utilisateur.class, id);
        } finally {
            em.close();
        }
    }

    public List<Utilisateur> findUtilisateurEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Utilisateur p", Utilisateur.class).getResultList();
        } finally {
            em.close();
        }
    }
}
