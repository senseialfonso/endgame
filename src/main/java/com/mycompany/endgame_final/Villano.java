/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame_final;

/**
 *
 * @author alfon
 */
import java.awt.Color;

public class Villano extends Peleador {
    private int x, y;

    public Villano(int x, int y) {
        super(x, y, Color.MAGENTA); // Color del villano (Thanos)
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void atacar() {
        System.out.println("¡" + getClass().getSimpleName() + " ataca con el guantelete del infinito!");
    }
    
    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }
}