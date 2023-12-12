package CollegeProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class java_21 extends JFrame implements ActionListener {
    //Creating CardLayout and CardPane
    CardLayout cardLayout = new CardLayout();
    Container cardPane = new Container();

    java_21() {
        cardPane = getContentPane();
        cardPane.setLayout(cardLayout);
        cardPane.setBounds(0, 210, 200, 200);

        //Declaring Buttons and adding ActionListener to these buttons
        JButton b5 = new JButton("First");
        b5.addActionListener(this);
        JButton b6 = new JButton("Second");
        b6.addActionListener(this);
        JButton b7 = new JButton("Third");
        b7.addActionListener(this);
        JButton b8 = new JButton("Fourth");
        b8.addActionListener(this);

        cardPane.add(b5);
        cardPane.add(b6);
        cardPane.add(b7);
        cardPane.add(b8);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(cardPane);
    }

    public static void main(String[] args) {
        java_21 obj = new java_21();
        JFrame frame = new JFrame();

        //Declaring Buttons to be added into Panels
        JButton b1 = new JButton("First");
        JButton b2 = new JButton("Second");
        JButton b3 = new JButton("Third");
        JButton b4 = new JButton("Fourth");

        //Declaring a Panel for gridLayout and adding Buttons to it
        JPanel gridPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        gridPanel.setBounds(0, 0, 200, 200);
        gridPanel.add(b1);
        gridPanel.add(b2);
        gridPanel.add(b3);
        gridPanel.add(b4);

        frame.add(gridPanel);
        frame.add(obj.cardPane);

        frame.setLayout(null);
        frame.setSize(300, 450);
        frame.setVisible(true);
    }
}