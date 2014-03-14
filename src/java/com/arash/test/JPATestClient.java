/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arash.test;



import com.arash.entities.Users;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author arashaga
 */
public class JPATestClient {
    static void main(String arg[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJNDI");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Users user = new Users();
        
        user.setFname("Arash");
        user.setLname("Mosharraf");
        user.setUsername("arashaga");
        try {
            user.setPassword("biashead");
        } catch (DigestException ex) {
            Logger.getLogger(JPATestClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(JPATestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.persist(user);
        em.getTransaction().commit();
        
        
    }
}
