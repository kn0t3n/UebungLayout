package com.sabel;


import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {

    JPanel jPW, jPC, jPS;
    ButtonGroup bg;


    public Panel() {

        this.setTitle("Uebung Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        this.initComponents();
//        this.initEvents();

        this.setVisible(true);
    }

    public void initComponents() {
        this.jPW = new JPanel();
        this.jPC = new JPanel();
        this.jPS = new JPanel();

        bg = new ButtonGroup();

        JRadioButton rbGruen = new JRadioButton("Gruen");
        JRadioButton rbBlau = new JRadioButton("Blau");
        JRadioButton rbRot = new JRadioButton("Rot");

        rbBlau.setSelected(true);
        rbGruen.setSelected(true);
        rbRot.setSelected(true);

        bg.add(rbBlau);
        bg.add(rbGruen);
        bg.add(rbRot);

        jPW.setLayout(new BoxLayout(jPW,BoxLayout.Y_AXIS));

        jPW.add(rbBlau);
        jPW.add(rbGruen);
        jPW.add(rbRot);

        this.add(jPC);
        this.add(jPW, BorderLayout.WEST);
        this.add(jPS, BorderLayout.SOUTH);

    }


}
