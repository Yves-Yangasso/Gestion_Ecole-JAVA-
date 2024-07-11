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
import models.Heure;

/**
 *
 * @author yanga
 */
public class HeureJpaController implements Serializable {
    private EntityManagerFactory emf;

    public HeureJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Heure hr) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(hr);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Heure hr) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(hr);
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
            Heure hr = em.find(Heure.class, id);
            if (hr != null) {
                em.remove(hr);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Heure findHeure(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Heure.class, id);
        } finally {
            em.close();
        }
    }

    public List<Heure> findHeureEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Heure p", Heure.class).getResultList();
        } finally {
            em.close();
        }
    }
}
