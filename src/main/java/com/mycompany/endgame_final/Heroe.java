/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame_final;

/**
 *
 * @author alfon
 */
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Heroe {
    private int x, y;

    public Heroe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void dibujar(Graphics2D g2d) {
        // Dibujar héroe con gradiente rojo a amarillo
        GradientPaint gp = new GradientPaint(x, y, Color.RED, x + 50, y + 50, Color.YELLOW);
        g2d.setPaint(gp);
        g2d.fill(new Rectangle2D.Double(x, y, 50, 50));
    }
}