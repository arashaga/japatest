/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arash.test;

import com.arash.entities.Users;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author arashaga
 */
public class JPATestClient {
    static void main(String arg[]) throws DigestException, NoSuchAlgorithmException{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJNDI");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Users user = new Users();
        
        user.setFname("Arash");
        user.setLname("Mosharraf");
        user.setUsername("arashaga");
        
        user.setPassword("biashead");
        em.persist(user);
        em.getTransaction().commit();
        
        
    }
}
