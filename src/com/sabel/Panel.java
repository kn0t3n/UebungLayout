package com.sabel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JFrame {

    private JPanel jPW, jPC, jPS, jPN;
    private ButtonGroup bg;
    private JRadioButton rbGruen, rbBlau, rbRot;
    private JButton jbGruen, jbBlau, jbRot;
    private JComboBox<String> jCB;
    private String[] comboStrings;


    public Panel() {

        comboStrings = new String[]{"Blau", "Gruen", "Rot"};
        jCB = new JComboBox<>(comboStrings);

        this.setTitle("Uebung Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(300, 200);

        this.initComponents();
        this.initEvents();

        this.pack();

        this.setVisible(true);
    }

    private void initComponents() {
        this.jPW = new JPanel();
        this.jPC = new JPanel();
        this.jPS = new JPanel();
        this.jPN = new JPanel();

        bg = new ButtonGroup();

        rbGruen = new JRadioButton("Gruen");
        rbBlau = new JRadioButton("Blau");
        rbRot = new JRadioButton("Rot");

        jbGruen = new JButton("Gruen");
        jbBlau = new JButton("Blau");
        jbRot = new JButton("Rot");

        bg.add(rbBlau);
        bg.add(rbGruen);
        bg.add(rbRot);
        bg.add(jbBlau);
        bg.add(jbGruen);
        bg.add(jbRot);

        jPW.setLayout(new BoxLayout(jPW, BoxLayout.Y_AXIS));

        jPW.add(rbBlau);
        jPW.add(rbGruen);
        jPW.add(rbRot);

        jPS.add(jbBlau);
        jPS.add(jbGruen);
        jPS.add(jbRot);

        jPN.add(jCB);

        this.add(jPC);
        this.add(jPN, BorderLayout.NORTH);
        this.add(jPW, BorderLayout.WEST);
        this.add(jPS, BorderLayout.SOUTH);

        blue();

    }

    private void initEvents() {
        jCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String)jCB.getSelectedItem();
                if (s == "Blau"){
                    blue();
                }
                if (s == "Gruen"){
                    green();
                }
                if (s == "Rot"){
                    red();
                }
            }
        });

        jbBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });
        rbBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });
        jbGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });
        rbGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });
        jbRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });
        rbRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });
    }

    private void blue() {
        jPC.setBackground(Color.BLUE);
        rbBlau.setSelected(true);
        jCB.setSelectedItem("Blau");
    }

    private void green() {
        jPC.setBackground(Color.GREEN);
        rbGruen.setSelected(true);
        jCB.setSelectedItem("Gruen");
    }

    private void red() {
        jPC.setBackground(Color.RED);
        rbRot.setSelected(true);
        jCB.setSelectedItem("Rot");
    }


}
