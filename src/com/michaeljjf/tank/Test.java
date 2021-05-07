package com.michaeljjf.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setTitle("坦克大战");
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
