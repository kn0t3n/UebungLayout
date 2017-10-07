package com.sabel;

import javax.swing.*;
import java.awt.*;

public class RadioButtons extends JFrame {


    private JRadioButton rbGruen;
    private JRadioButton rbBlau;
    private JRadioButton rbRot;


    public RadioButtons() throws HeadlessException {

        initComponents();
    }

    private void initComponents(){
        rbGruen = new JRadioButton("Gruen");
        rbBlau = new JRadioButton("Blau");
        rbRot = new JRadioButton("Rot");
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
