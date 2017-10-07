package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    Panels p;


    public Window() {
        this.setTitle("Uebung Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        this.initComponents();


        this.setVisible(true);
    }

    private void initComponents() {
        p = new Panels();



        this.add(p.getjPW(), BorderLayout.WEST);
        this.add(p.getjPS(),BorderLayout.SOUTH);
        this.add(p.getjPC());
    }
}
