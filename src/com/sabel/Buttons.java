package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Buttons extends JFrame {

    private JButton jbGruen;
    private JButton jbBlau;
    private JButton jbRot;

    private JRadioButton rbGruen;
    private JRadioButton rbBlau;
    private JRadioButton rbRot;

    private ButtonGroup bg;


    public Buttons() throws HeadlessException {

        initComponents();

    }

    private void initComponents() {
        jbGruen = new JButton("Gruen");
        jbBlau = new JButton("Blau");
        jbRot = new JButton("Rot");

        rbGruen = new JRadioButton("Gruen");
        rbBlau = new JRadioButton("Blau");
        rbRot = new JRadioButton("Rot");

        bg = new ButtonGroup();

        bg.add(rbBlau);
        bg.add(rbGruen);
        bg.add(rbRot);
        bg.add(jbBlau);
        bg.add(jbGruen);
        bg.add(jbRot);

    }

    public JButton getJbGruen() {
        return jbGruen;
    }

    public JButton getJbBlau() {
        return jbBlau;
    }

    public JButton getJbRot() {
        return jbRot;
    }

    public JRadioButton getRbGruen() {
        return rbGruen;
    }

    public JRadioButton getRbBlau() {
        return rbBlau;
    }

    public JRadioButton getRbRot() {
        return rbRot;
    }


}
