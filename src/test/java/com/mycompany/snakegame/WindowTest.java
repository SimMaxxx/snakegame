/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import java.awt.event.KeyListener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shiwani singh
 */
public class WindowTest {
    Window window = new Window();
     @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
         window = new Window();
    }

    @Test
    public void WindowTest() {
        Window window =new Window();
        window.addKeyListener((KeyListener) new KeyboardListener());
    }
 @AfterEach
    public void tearDown() {
        System.out.println("should print after each test case");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("should be printed after all the tests have been excuted");
    }

//
//    @Test
//    public void testSomeMethod() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
