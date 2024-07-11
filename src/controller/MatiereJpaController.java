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
import models.Matiere;

/**
 *
 * @author yanga
 */
public class MatiereJpaController implements Serializable {
    private EntityManagerFactory emf;

    public MatiereJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Matiere mat) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(mat);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Matiere mat) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(mat);
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
            Matiere mat = em.find(Matiere.class, id);
            if (mat != null) {
                em.remove(mat);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Matiere findMatiere(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Matiere.class, id);
        } finally {
            em.close();
        }
    }

    public List<Matiere> findMatiereEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Matiere p", Matiere.class).getResultList();
        } finally {
            em.close();
        }
    }
}
