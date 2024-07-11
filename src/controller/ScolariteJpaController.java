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
import models.Scolarite;

public class ScolariteJpaController implements Serializable {
    private EntityManagerFactory emf;

    public ScolariteJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Scolarite sco) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(sco);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Scolarite sco) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(sco);
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
            Scolarite sco = em.find(Scolarite.class, id);
            if (sco != null) {
                em.remove(sco);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Scolarite findScolarite(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Scolarite.class, id);
        } finally {
            em.close();
        }
    }

    public List<Scolarite> findScolariteEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Scolarite p", Scolarite.class).getResultList();
        } finally {
            em.close();
        }
    }
}
