package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Panels extends JFrame {

    private JPanel jPW, jPC, jPS;
    private RadioButtons rb;
    private StandardButtons sb;
    private ButtonGroup bg;


    public Panels() throws HeadlessException {

        initComponents();
    }

    private void initComponents() {
        this.jPW = new JPanel();
        this.jPC = new JPanel();
        this.jPS = new JPanel();

        rb = new RadioButtons();
        sb = new StandardButtons();
        bg = new ButtonGroup();


        this.jPW.add(rb.getRbBlau());
        this.jPW.add(rb.getRbGruen());
        this.jPW.add(rb.getRbRot());

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
}
