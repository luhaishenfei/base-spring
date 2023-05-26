package _0Demo;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My first Swing");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);



        Container container = frame.getContentPane();
        frame.setLayout(null);

        JButton jButton = new JButton("Button");
        jButton.setBounds(100,100,100,40);

        container.add(jButton);

        frame.setVisible(true);
    }
}
