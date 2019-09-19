/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignpersist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pajmen
 */
public class Manager {
    static EntityManager entityManager;
    private Manager(){
    
    }
    public static EntityManager createManager(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonPU");
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }
}
