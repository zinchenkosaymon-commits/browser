package org.example;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public static String name = "frogswamp";
public static JFrame frame = new JFrame(name);
public static JTextPane pane = new JTextPane();
public static JPanel panel = new JPanel();
public  static JPanel panel1 = new JPanel();
public static JEditorPane editorPane = new JEditorPane();
public static JButton button =new JButton("поиск");
    public static void main(String[] args) {

        editorPane.setEditable(false);
        pane.setText("найти");
       panel1.setVisible(false);
panel1.add(editorPane);
frame.setSize(400,500);
frame.setLocationRelativeTo(null);
frame.setLayout(new FlowLayout(1));

frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
button.addActionListener(new Txt());
panel.add(pane);
panel.add(button);

frame.add(panel);
frame.add(panel1);
frame.setVisible(true);
    }
}