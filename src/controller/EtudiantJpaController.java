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
import models.Etudiant;

public class EtudiantJpaController implements Serializable {
    private EntityManagerFactory emf;

    public EtudiantJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Etudiant etu) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(etu);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Etudiant etu) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(etu);
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
            Etudiant etu = em.find(Etudiant.class, id);
            if (etu != null) {
                em.remove(etu);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Etudiant findEtudiant(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Etudiant.class, id);
        } finally {
            em.close();
        }
    }

    public List<Etudiant> findEtudiantEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Etudiant p", Etudiant.class).getResultList();
        } finally {
            em.close();
        }
    }
}
