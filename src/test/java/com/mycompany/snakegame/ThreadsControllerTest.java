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
public class ThreadsControllerTest {
    
    public ThreadsControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("should print before the start of the tests scipts");
    }

    /**
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("run");
        ThreadsController instance = new ThreadsController();
        instance.run();
        });
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
