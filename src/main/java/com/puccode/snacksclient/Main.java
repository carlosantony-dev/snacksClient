package com.puccode.snacksclient;

import com.puccode.snacksclient.forms.Home;

import javax.swing.*;
import java.awt.*;

public class Main implements Runnable {
    JFrame jFrame;
   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    @Override
    public void run() {
        Home home = new Home();
        jFrame = new JFrame();
        jFrame.setContentPane(home.getContentPane());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Java Snacks Restaurant");
        jFrame.setSize(new Dimension(1080, 720));
        jFrame.setVisible(true);
    }
}