package com.model.templateMethodPattern.hook;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Test";
        graphics.drawString(message,100,100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Head First Design Pattern");
    }
}
