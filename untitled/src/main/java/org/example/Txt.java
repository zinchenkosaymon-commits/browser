package org.example;

import javax.print.DocFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Txt extends Main implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
String a = pane.getText();

       panel1.setVisible(true);
panel.setVisible(false);
        try {
            editorPane.setPage(a.trim());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
