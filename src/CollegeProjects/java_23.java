package CollegeProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class java_23 {
    static JLabel arrLabel[] = new JLabel[10];
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        CollegeProjects.java_23 obj = new CollegeProjects.java_23();

        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBackground(Color.BLACK);
        flowPanel.setBounds(0, 0, 650, 50);

        JLabel labUser = new JLabel("Enter Student ID");
        labUser.setBackground(Color.gray);
        labUser.setOpaque(true);

        JTextField txtBox = new JTextField();
        txtBox.setColumns(20);

        JButton searchBut = new JButton("Search");
        searchBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtBox.getText().equals("182115"))
                    obj.getUserData(0);
                else if (txtBox.getText().equals("182116"))
                    obj.getUserData(1);
                else
                    obj.getUserData(2);
            }
        });

        flowPanel.add(labUser);
        flowPanel.add(txtBox);
        flowPanel.add(searchBut);

        JPanel gridPanel = new JPanel(new GridLayout(2, 5, 1, 1));
        gridPanel.setBackground(Color.cyan);
        gridPanel.setBounds(0, 50, 650, 100);

        for (int i = 0; i < 10; i++) {
            arrLabel[i] = new JLabel();
            arrLabel[i].setBackground(Color.GRAY);
            arrLabel[i].setOpaque(true);
        }

        arrLabel[0].setText("Name");
        arrLabel[1].setText("ID");
        arrLabel[2].setText("Department");
        arrLabel[3].setText("Semester");
        arrLabel[4].setText("Email");

        for (int i = 0; i < 10; i++) {
            gridPanel.add(arrLabel[i]);
        }

        frame.add(flowPanel);
        frame.add(gridPanel);
        frame.setLayout(null);
        frame.setSize(650, 300);
        frame.setVisible(true);
    }

    void getUserData(int val) {
        String[] stu1 = {"Arhaan", "182115", "IT", "7th", "arhaan@gmail.com"};
        String[] stu2 = {"Moin", "182116", "IT", "7th", "moin@gmail.com"};

        if (val == 0) {
            for (int i = 0; i < 5; i++) {
                arrLabel[i + 5].setText(stu1[i]);
            }
        } else if (val == 1) {
            for (int i = 0; i < 5; i++) {
                arrLabel[i + 5].setText(stu2[i]);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Student Details Not Found!", "Error 404!", JOptionPane.WARNING_MESSAGE);
        }
    }
}