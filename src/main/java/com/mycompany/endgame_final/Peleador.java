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
import java.awt.Graphics;

public abstract class Peleador {
    protected int x, y;
    protected int width = 50, height = 50;
    protected Color color;

    public Peleador(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void atacar();

    public void recibirDaño() {
        System.out.println("¡" + getClass().getSimpleName() + " ha recibido daño!");
    }

    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}