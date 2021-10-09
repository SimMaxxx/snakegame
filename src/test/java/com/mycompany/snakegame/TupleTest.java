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
public class TupleTest {
    
    public TupleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
System.out.println("should print before the start of the tests scipts");    }

    /**
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("ChangeData");
        int x = 0;
        int y = 0;
        Tuple instance = null;
        instance.ChangeData(x, y);
        });
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("getX");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        });
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("getY");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        });
    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void testGetXf() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("getXf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getXf();
        assertEquals(expResult, result);
        });
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("getYf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getYf();
        assertEquals(expResult, result);
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
