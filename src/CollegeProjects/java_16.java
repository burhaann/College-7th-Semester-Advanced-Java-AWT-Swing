package CollegeProjects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class java_16 {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        //Declaring Textfields for Number 1, Number 2 and Result
        JTextField txtField1 = new JTextField();
        txtField1.setColumns(10);
        JTextField txtField2 = new JTextField();
        txtField2.setColumns(10);
        JTextField txtResult = new JTextField();
        txtResult.setColumns(10);
        txtResult.setEnabled(false);

        //Declaring Panel to hold all Textfields and Layout to keep them in a row
        JPanel textPanel = new JPanel(new FlowLayout());
        textPanel.add(txtField1);
        textPanel.add(txtField2);
        textPanel.add(txtResult);
        textPanel.setBounds(0, 0, 400, 50);

        //Declaring functions for Buttons +, -, *, /
        JButton butAdd = new JButton("+");
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(String.valueOf(Integer.parseInt(txtField1.getText()) + Integer.parseInt(txtField2.getText())));
            }
        });

        JButton butSub = new JButton("-");
        butSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(String.valueOf(Integer.parseInt(txtField1.getText()) - Integer.parseInt(txtField2.getText())));
            }
        });
        JButton butMul = new JButton("*");
        butMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(String.valueOf(Integer.parseInt(txtField1.getText()) * Integer.parseInt(txtField2.getText())));
            }
        });
        JButton butDiv = new JButton("/");
        butDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtResult.setText(String.valueOf(Integer.parseInt(txtField1.getText()) / Integer.parseInt(txtField2.getText())));
            }
        });

        //Adding buttons into Panel and keeping them in Grid
        JPanel butPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        butPanel.add(butAdd);
        butPanel.add(butSub);
        butPanel.add(butMul);
        butPanel.add(butDiv);
        butPanel.setBounds(0, 60, 400, 100);

        frame.add(butPanel);
        frame.add(textPanel);

        frame.setLayout(null);
        frame.setSize(400, 220);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}