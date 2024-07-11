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
import models.Professeur;

public class ProfesseurJpaController implements Serializable {
    private EntityManagerFactory emf;

    public ProfesseurJpaController() {
       
    }

    public EntityManager getEntityManager() {
        return MyDataSource.getEntityManagement();
    }

    public void create(Professeur prof) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(prof);
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public void edit(Professeur prof) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(prof);
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
            Professeur prof = em.find(Professeur.class, id);
            if (prof != null) {
                em.remove(prof);
            }
            tx.commit();
        } finally {
            if (tx.isActive()) {
                tx.rollback();
            }
            em.close();
        }
    }

    public Professeur findProfesseur(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Professeur.class, id);
        } finally {
            em.close();
        }
    }

    public List<Professeur> findProfesseurEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Professeur p", Professeur.class).getResultList();
        } finally {
            em.close();
        }
    }
}
