package com.company;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainScreen extends Applet implements KeyListener {

    private Rectangle rect;
    private Rectangle box;
    private Label score;

    @Override
    public void init() {
        super.init();
        addKeyListener(this);
        setSize(500, 500);
        box = new Rectangle(10, 10, 10, 10);
        setFocusable(true);
        requestFocusInWindow();
        score = new Label("Start moving the keys");
        add(score);
    }

    @Override
    public void paint(Graphics g) {
        setSize(500, 500);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.BLACK);
        graphics2D.fill(box);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            score.setText("UP");
            Timber.e("UP");
            box.y -= 10;
            repaint();
            return;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            score.setText("DOWN");
            Timber.e("DOWN");
            box.y += 10;
            repaint();
            return;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            score.setText("VK_LEFT");
            Timber.e("LEFT");
            box.x -= 10;
            repaint();
            return;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            score.setText("VK_RIGHT");
            Timber.e("RIGHT");
            box.x += 10;
            repaint();
            return;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
