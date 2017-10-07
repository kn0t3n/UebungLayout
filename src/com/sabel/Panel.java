package com.sabel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Panel extends JFrame {

    JPanel jPW, jPC, jPS;
    ButtonGroup bg;
    JRadioButton rbGruen;
    JRadioButton rbBlau;
    JRadioButton rbRot;
    JButton jbGruen;
    JButton jbBlau;
    JButton jbRot;


    public Panel() {

        this.setTitle("Uebung Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        this.initComponents();
        this.initEvents();

        this.setVisible(true);
    }

    public void initComponents() {
        this.jPW = new JPanel();
        this.jPC = new JPanel();
        this.jPS = new JPanel();

        bg = new ButtonGroup();

        rbGruen = new JRadioButton("Gruen");
        rbBlau = new JRadioButton("Blau");
        rbRot = new JRadioButton("Rot");

        jbGruen = new JButton("Gruen");
        jbBlau = new JButton("Blau");
        jbRot = new JButton("Rot");

        rbBlau.setSelected(true);
        rbGruen.setSelected(true);
        rbRot.setSelected(true);

        jbBlau.setSelected(true);
        jbGruen.setSelected(true);
        jbRot.setSelected(true);

        bg.add(rbBlau);
        bg.add(rbGruen);
        bg.add(rbRot);
        bg.add(jbBlau);
        bg.add(jbGruen);
        bg.add(jbRot);

        jPW.setLayout(new BoxLayout(jPW,BoxLayout.Y_AXIS));

        jPW.add(rbBlau);
        jPW.add(rbGruen);
        jPW.add(rbRot);

        jPS.add(jbBlau);
        jPS.add(jbGruen);
        jPS.add(jbRot);

        this.add(jPC);
        this.add(jPW, BorderLayout.WEST);
        this.add(jPS, BorderLayout.SOUTH);

    }

    private void initEvents(){
        jbBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.BLUE);
                jbBlau.setSelected(true);
                rbBlau.setSelected(true);
            }
        });
        rbBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.BLUE);
                jbBlau.setSelected(true);
                rbBlau.setSelected(true);
            }
        });
        jbGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.GREEN);
                jbGruen.setSelected(true);
                rbGruen.setSelected(true);
            }
        });
        rbGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.GREEN);
                jbGruen.setSelected(true);
                rbGruen.setSelected(true);
            }
        });
        jbRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.RED);
                jbRot.setSelected(true);
                rbRot.setSelected(true);
            }
        });
        rbRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.RED);
                jbRot.setSelected(true);
                rbRot.setSelected(true);
            }
        });
    }


}
