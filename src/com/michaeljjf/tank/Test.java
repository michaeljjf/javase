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
        center(frame);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    /**
     *
     * @param c
     */
    public static void center(Component c) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }
}
