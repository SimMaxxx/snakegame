/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

import java.awt.event.KeyEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author shiwani singh
 */
class KeyboardListenerTest {

    KeyboardListener keyboardListener;

    public KeyboardListenerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("should print before any of the tests");
    }

    @BeforeEach
    public void setUp() {
        keyboardListener = new KeyboardListener();
    }

    /**
     * Test of keyPressed method, of class KeyboardListener.
     */
        @Test
    public void testKeyPressedtrial() {
        Assertions.assertThrows(RuntimeException.class, () -> {
        System.out.println("keyPressed");
        KeyEvent e = null;
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        });
    }
    @Test
    @DisplayName("switch case 39")
    public void testKeyPressed() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("switch case 39");
            KeyEvent e = null;
            //   int b = Integer.parseInt(e);
            KeyboardListener instance = new KeyboardListener();
            instance.keyPressed(e);
            assertEquals((39), instance.equals(ThreadsController.directionSnake = 1));
            assertTrue((39) == (ThreadsController.directionSnake = 1));

        });
    }

    @Test
    @DisplayName("switch case 38")
    public void testswitch38() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("switch case 38");
            KeyEvent e = null;
            KeyboardListener instance = new KeyboardListener();
            instance.keyPressed(e);
            assertEquals(38, instance.equals(ThreadsController.directionSnake = 3));
            assertTrue((38) == (ThreadsController.directionSnake = 3));
        });
    }

    @Test
    @DisplayName("switch case 37")
    public void testswitch37() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("switch case 37");
            KeyEvent e = null;
            KeyboardListener instance = new KeyboardListener();
            instance.keyPressed(e);
            assertEquals(37, instance.equals(ThreadsController.directionSnake = 2));
            assertTrue((37) == (ThreadsController.directionSnake = 2));
        });
    }

    @Test
    @DisplayName("switch case 40")
    public void testswitch40() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("switch case 40");
            KeyEvent e = null;
            KeyboardListener instance = new KeyboardListener();
            instance.keyPressed(e);
            assertEquals(40, instance.equals(ThreadsController.directionSnake = 4));
            assertTrue((40) == (ThreadsController.directionSnake = 4));
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
