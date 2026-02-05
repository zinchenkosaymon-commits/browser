package org.example;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public static String name = "frogswamp";
public static JFrame frame = new JFrame(name);
public static String end = "->";
public  static JButton buton = new JButton(end);
public static JTextPane pane = new JTextPane();
public static JPanel panel = new JPanel();
public  static JPanel panel1 = new JPanel();
public static JEditorPane editorPane = new JEditorPane();
public static JButton button =new JButton("поиск");
public static JScrollPane pane1 = new JScrollPane(panel1);
    public static void main(String[] args) {

        editorPane.setEditable(false);
        pane.setText("найти");
       panel1.setVisible(false);
panel1.add(editorPane);
panel1.add(buton);

frame.setSize(400,500);
frame.setLocationRelativeTo(null);
frame.setLayout(new GridLayout(2,2));

frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
button.addActionListener(new Txt());
buton.addActionListener(new Txt2());
panel.add(pane);
panel.add(button);
panel1.add(buton);

frame.add(pane1);
frame.add(panel);
frame.setVisible(true);
    }
}