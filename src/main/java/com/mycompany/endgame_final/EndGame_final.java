/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame_final;

/**
 *
 * @author alfon
 */
import javax.swing.JFrame;

public class EndGame_final extends JFrame {
    public EndGame_final() {
        setTitle("Batalla Final de Endgame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        // Agregamos el tablero al JFrame
        add(new Tablero());
    }

    public static void main(String[] args) {
        new EndGame_final();
    }
}