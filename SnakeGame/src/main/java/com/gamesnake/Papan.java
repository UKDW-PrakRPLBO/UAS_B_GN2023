package com.gamesnake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Papan extends JPanel implements ActionListener {

    private final int LEBAR_PAPAN = 400;
    private final int TINGGI_PAPAN = 400;
    private final int UKURAN_TILE = 10;
    private final int TOTAL_JUMLAH_TILE = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 140;

    private final int x[] = new int[TOTAL_JUMLAH_TILE];
    private final int y[] = new int[TOTAL_JUMLAH_TILE];

    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean arahKiri = false;
    private boolean arahKanan = true;
    private boolean arahAtas = false;
    private boolean arahBawah = false;
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;

    public Papan() {

    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
        }
        repaint();
    }

    private class KeyAdapter extends java.awt.event.KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if ((key == KeyEvent.VK_LEFT) && (!arahKanan)) {
                arahKiri = true;
                arahAtas = false;
                arahBawah = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!arahKiri)) {
                arahKanan = true;
                arahAtas = false;
                arahBawah = false;
            }

            if ((key == KeyEvent.VK_UP) && (!arahBawah)) {
                arahAtas = true;
                arahKanan = false;
                arahKiri = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!arahAtas)) {
                arahBawah = true;
                arahKanan = false;
                arahKiri = false;
            }

            if ((key == KeyEvent.VK_SPACE) && (!inGame)) {

            }
        }
    }
}
