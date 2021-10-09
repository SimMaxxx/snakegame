/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shiwani singh
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
//        keyboardListener = new KeyboardListener();
    }
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
     //   Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
  //  });
    }
        @AfterEach
    public void tearDown() {
        System.out.println("should print after each test case");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("should be printed after all the tests have been excuted");
    }
    
}
