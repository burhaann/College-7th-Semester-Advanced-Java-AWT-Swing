package CollegeProjects;

import javax.swing.*;
import java.awt.*;

class java_20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //Declaring Buttons to be added into Panels
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
        JButton b6 = new JButton("First");
        JButton b7 = new JButton("Second");
        JButton b8 = new JButton("Third");

        //Declaring a Panel for BorderLayout and adding Buttons to it in BorderLayout manner
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBounds(0, 0, 300, 300);
        borderPanel.add(b1, BorderLayout.NORTH);
        borderPanel.add(b2, BorderLayout.SOUTH);
        borderPanel.add(b3, BorderLayout.EAST);
        borderPanel.add(b4, BorderLayout.WEST);
        borderPanel.add(b5, BorderLayout.CENTER);

        //Declaring a Panel for FlowLayout  and adding buttons to it
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBounds(0, 310, 300, 100);
        flowPanel.add(b6);
        flowPanel.add(b7);
        flowPanel.add(b8);

        frame.add(borderPanel);
        frame.add(flowPanel);
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}