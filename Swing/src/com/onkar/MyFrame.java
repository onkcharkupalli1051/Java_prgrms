package com.onkar;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon image = new ImageIcon("dp.png");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(255,0,0));

    }
}
