package com.onkar;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(420,420);
//        frame.setTitle("JFrame");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//
//        ImageIcon image = new ImageIcon("dp.png");
//        frame.setIconImage(image.getImage());
//
//        frame.getContentPane().setBackground(new Color(255,0,0));

        MyFrame frame = new MyFrame();
        frame.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        label.setText("Wsup!");
        frame.add(label);

        ImageIcon image = new ImageIcon("batman.png");
        label.setIcon(image);

    }
}
