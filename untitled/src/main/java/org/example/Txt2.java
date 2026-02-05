package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Txt2 extends Main implements ActionListener  {
    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setVisible(true);
        panel1.setVisible(false);
    }
}
