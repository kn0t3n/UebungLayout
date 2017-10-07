package com.sabel;

import javax.swing.*;
import java.awt.*;

public class StandardButtons extends JFrame {

    private JButton jbGruen;
    private JButton jbBlau;
    private JButton jbRot;

    public StandardButtons() throws HeadlessException {

        initComponents();


    }

    private void initComponents() {
        jbGruen = new JButton("Gruen");
        jbBlau = new JButton("Blau");
        jbRot = new JButton("Rot");

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
}
