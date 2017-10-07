package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JFrame {

    private JPanel jPW, jPC, jPS;
    private Buttons sb;


    public Panels() throws HeadlessException {

        initComponents();
        initEvents();

    }

    private void initComponents() {
        this.jPW = new JPanel();
        this.jPC = new JPanel();
        this.jPS = new JPanel();

        sb = new Buttons();

        this.jPW.add(sb.getRbBlau());
        this.jPW.add(sb.getRbGruen());
        this.jPW.add(sb.getRbRot());

        this.jPW.setLayout(new BoxLayout(jPW,BoxLayout.Y_AXIS));

        this.jPS.add(sb.getJbBlau());
        this.jPS.add(sb.getJbGruen());
        this.jPS.add(sb.getJbRot());

    }

    public JPanel getjPW() {
        return jPW;
    }

    public JPanel getjPC() {
        return jPC;
    }

    public JPanel getjPS() {
        return jPS;
    }

    private void initEvents(){
        sb.getJbBlau().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.BLUE);
                sb.getRbBlau().setSelected(true);
            }
        });
        sb.getRbBlau().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.BLUE);
                sb.getJbBlau().setSelected(true);
            }
        });
        sb.getJbGruen().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.GREEN);
                sb.getRbGruen().setSelected(true);
            }
        });
        sb.getRbGruen().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.GREEN);
                sb.getJbGruen().setSelected(true);
            }
        });
        sb.getJbRot().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.RED);
                sb.getRbRot().setSelected(true);
            }
        });
        sb.getRbRot().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPC.setBackground(Color.RED);
                sb.getJbRot().setSelected(true);
            }
        });
    }
}
