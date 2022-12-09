/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ui;

import dao.UserDao;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oooo
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of clear method, of class Login.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Login instance = new Login();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        boolean expResult = false;
        boolean result = instance.getBtnLogin().isEnabled();
        assertEquals(expResult, result);
        System.out.println("clear function test passed");
    }

    /**
     * Test of validateFields method, of class Login.
     */
    @Test
    public void testValidateFields() {
        System.out.println("validateFields");
        Login instance = new Login();
        instance.setTxtName("name");
        instance.setTxtPassword("password");
        instance.validateFields();
        boolean expResult = true;
        boolean result = instance.getBtnLogin().isEnabled();
        assertEquals(expResult, result);
        System.out.println("validate function test passed");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testlogin() {
        System.out.println("main");
        String[] args = null;
        //Login.main(args);
        Login instance = new Login();
        User result = null;
        result = UserDao.login("Admin","admin");
        User expResult = null;
        assertNotEquals(expResult, result);
        System.out.println("Admin login test passed");
        
        User result2 = null;
        result2 = UserDao.login("Admin2","admin");
        User expResult2 = null;
        assertEquals(expResult2, result2);
        System.out.println("Admin login test passed");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
