/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame_final;

/**
 *
 * @author alfon
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tablero extends JPanel {
    private Heroe heroe;
    private Villano villano;
    private boolean turnoHeroe;

    public Tablero() {
        heroe = new Heroe(100, 100);
        villano = new Villano(500, 100);
        turnoHeroe = true;

        setFocusable(true);
        addKeyListener(new TAdapter());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Dibujar héroe
        heroe.dibujar(g2d);

        // Dibujar villano
        g2d.setColor(Color.BLUE);
        g2d.fillRect(villano.getX(), villano.getY(), 50, 50);

        g2d.dispose();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (turnoHeroe) {
                if (key == KeyEvent.VK_LEFT) {
                    heroe.mover(-10, 0);
                } else if (key == KeyEvent.VK_RIGHT) {
                    heroe.mover(10, 0);
                } else if (key == KeyEvent.VK_UP) {
                    heroe.mover(0, -10);
                } else if (key == KeyEvent.VK_DOWN) {
                    heroe.mover(0, 10);
                }
            } else {
                if (key == KeyEvent.VK_A) {
                    villano.mover(-10, 0);
                } else if (key == KeyEvent.VK_D) {
                    villano.mover(10, 0);
                } else if (key == KeyEvent.VK_W) {
                    villano.mover(0, -10);
                } else if (key == KeyEvent.VK_S) {
                    villano.mover(0, 10);
                }
            }

            repaint();
        }
    }

    public void cambiarTurno() {
        turnoHeroe = !turnoHeroe;
    }
}