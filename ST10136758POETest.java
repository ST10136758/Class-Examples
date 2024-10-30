/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10136758.poe.part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ST10136758POETest {
    
    public ST10136758POETest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ST10136758POE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ST10136758POE.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class ST10136758POE.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String passwordConfirmation = "";
        String usernameConfirmation = "";
        String userpassword = "";
        boolean expResult = false;
        boolean result = ST10136758POE.loginUser(username, passwordConfirmation, usernameConfirmation, userpassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
