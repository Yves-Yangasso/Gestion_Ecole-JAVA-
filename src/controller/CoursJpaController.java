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
import models.Cours;
import models.Matiere;

/**
 *
 * @author yanga
 */
public class CoursJpaController implements Serializable {
    private EntityManagerFactory emf;

    public CoursJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Cours cr) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(cr);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Cours cr) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(cr);
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
            Cours cr = em.find(Cours.class, id);
            if (cr != null) {
                em.remove(cr);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Cours findCours(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cours.class, id);
        } finally {
            em.close();
        }
    }

    public List<Cours> findCoursEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Cours p", Cours.class).getResultList();
        } finally {
            em.close();
        }
    }
}
