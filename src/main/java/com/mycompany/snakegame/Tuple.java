/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.snakegame;

/**
 *
 * @author shiwani singh
 */
public class Tuple {

    public int x;
    public int y;
    public int xf;
    public int yf;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void ChangeData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXf() {
        return xf;
    }

    public int getYf() {
        return yf;
    }

}
