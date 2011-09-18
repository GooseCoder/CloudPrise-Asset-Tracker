/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.xioh.cloudprise.warehouse.model;

import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustav
 */
public class CategoryTest {
    private static EntityManagerFactory emf; 
    private static EntityManager em; 
    private static EntityTransaction tx; 
    
    public CategoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {  
        emf = Persistence.createEntityManagerFactory("CloudPrisePUTest"); 
        em = emf.createEntityManager(); 
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        em.close(); 
        emf.close(); 
    }
    
    @Before
    public void setUp() {
         tx = em.getTransaction(); 
    }
    
   
    @Test 
    public void shouldCreateACategory() throws Exception { 
 
        // Creates an instance of book 
        Category category = new Category(); 
        category.setCategory("Category"); 
 
        // Persists the book to the database 
        tx.begin(); 
        em.persist(category); 
        tx.commit(); 
        assertNotNull("ID should not be null", category.getId()); 
//        assertNotNull("ID should not be null", category.getCategory()); 
//        assert(true);
 
        // Retrieves all the books from the database 
        List<Category> categories = em.createNamedQuery("findAllCategories").getResultList(); 
        assertEquals(1, categories.size()); 
        assert(true);
    } 
}
