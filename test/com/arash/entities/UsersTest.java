/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arash.entities;

import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arashaga
 */
public class UsersTest {

    public UsersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setFname method, of class Users.
     */
    @Test
    public void testSetProperties() {
        Users instance = new Users();
        System.out.println("setFname");
        String fname = "Arash";
        instance.setFname(fname);
        System.out.println("setLname");
        String lname = "Arash";
        instance.setLname(lname);
        System.out.println("setUsername");
        String uname = "arashaga";
        instance.setUsername(uname);
        System.out.println("setPassword");
        String pass = "biashead";
        try {
            instance.setPassword(pass);
        } catch (DigestException ex) {
            Logger.getLogger(UsersTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsersTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJNDI");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(instance);
        em.getTransaction().commit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
    /**
     * Test of getLname method, of class Users.
     */
//    @Test
//    public void testGetProperties() {
//        System.out.println("getLname");
//        Users instance = new Users();
//        String expResult = "";
//        String result = instance.getLname();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
