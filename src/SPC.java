import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SPC {

    // Function to write a student
    // information in JFrame and
    // storing it in a file
    public static void StudentInfo() {

        List<String> clusterId = new ArrayList<>();
        clusterId.add("");
        List<Integer> classRollNo = new ArrayList<>();
        classRollNo.add(null);
        List<String> names = new ArrayList<>();
        names.add("");
        List<String> email = new ArrayList<>();
        email.add("");
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("");
        List<Integer> examRollNo = new ArrayList<>();
        examRollNo.add(null);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spc", "root", "");
            Statement stmt = con.createStatement();
            ResultSet students = stmt.executeQuery("select * from students");

            while (students.next()) {
                clusterId.add(students.getString(1).replaceAll("\\s+", ""));
                classRollNo.add(students.getInt(2));
                names.add(students.getString(3));
                email.add(students.getString(4).replaceAll("\\s+", ""));
                phoneNumber.add(students.getString(5).replaceAll("\\s+", ""));
                examRollNo.add(students.getInt(6));

                System.out.println(students.getString(1).replaceAll("\\s+", "") + "  " + students.getInt(2) + "  " + students.getString(5).replaceAll("\\s+", "") + "  " + students.getInt(6) + "  " + students.getString(3).replaceAll("\\s+", "") + "  " + students.getString(4).replaceAll("\\s+", ""));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Creating a new frame using JFrame
        JFrame studentHomeScreen
                = new JFrame(
                "Batch 2018 Student Details");

        Dimension Screen = Toolkit.getDefaultToolkit().getScreenSize();

        // Creating the labels
        JLabel l1, l2, l3, l4, l5, l6;

        // Creating three text fields.
        // One for student name, one for
        // college mail ID  and one
        // for  Mobile No
        JTextField t1, t2, t3, t4, t5, t6;

        // Creating two JComboboxes
        // one for Branch and one
        // for Section
        JComboBox j1, j2, j3, j4, j5, j6;

        // Creating  two buttons
        JButton Save, Close, Details;

        //Width Height Variables
        int x1 = 30, x2 = 200, w1 = 150, w2 = 300, h1 = 30;

        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Name:");
        l1.setBounds(x1, 50, w1, h1);
        l2 = new JLabel("College Roll Number:");
        l2.setBounds(x1, 100, w1, h1);
        l3 = new JLabel("Cluster ID:");
        l3.setBounds(x1, 150, w1, h1);
        l4 = new JLabel("Examination Roll Number:");
        l4.setBounds(x1, 200, w1, h1);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(x1, 250, w1, h1);
        l6 = new JLabel("Email:");
        l6.setBounds(x1, 300, w1, h1);

        // Creating the textfields and
        // setting the bounds for textfields
        t1 = new JTextField("Names of Batch 2018 Students");
        t1.setBounds(x2, 50, w2, h1);
        t1.setEditable(false);
        t2 = new JTextField("Class Roll Number");
        t2.setBounds(x2, 100, w2, h1);
        t2.setEditable(false);
        t3 = new JTextField("Cluster University ID");
        t3.setBounds(x2, 150, w2, h1);
        t3.setEditable(false);
        t4 = new JTextField("Examination Roll Number");
        t4.setBounds(x2, 200, w2, h1);
        t4.setEditable(false);
        t5 = new JTextField("Phone Number");
        t5.setBounds(x2, 250, w2, h1);
        t5.setEditable(false);
        t6 = new JTextField("Email Address");
        t6.setBounds(x2, 300, w2, h1);
        boolean abc = false;
        t6.setEditable(abc);


        // Creating two string arrays one for
        // braches and other for sections

        String s1[]
                = {"  ", "CSE", "ECE", "EEE",
                "CIVIL", "MEC", "Others"};

        // Creating two JComboBoxes one for
        // selecting branch and other for
        // selecting the section
        // and setting the bounds
        j1 = new JComboBox(names.toArray());
        j1.setBounds(x2, 50, w2, h1);
        j2 = new JComboBox(classRollNo.toArray());
        j2.setBounds(x2, 100, w2, h1);
        j2.setEnabled(false);
        j3 = new JComboBox(clusterId.toArray());
        j3.setBounds(x2, 150, w2, h1);
        j3.setEnabled(false);
        j4 = new JComboBox(examRollNo.toArray());
        j4.setBounds(x2, 200, w2, h1);
        j4.setEnabled(false);
        j5 = new JComboBox(phoneNumber.toArray());
        j5.setBounds(x2, 250, w2, h1);
        j5.setEnabled(false);
        j6 = new JComboBox(email.toArray());
        j6.setBounds(x2, 300, w2, h1);
        j6.setEnabled(false);

        // Creating one button for Saving
        // and other button to close
        // and setting the bounds
        Save = new JButton("Save");
        Save.setBounds(50, 400, w1 - 50, h1);
        Close = new JButton("close");
        Close.setBounds(150, 400, w1 - 50, h1);
        Details = new JButton("Clear Details");
        Details.setBounds(300, 400, w1, h1);

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                try {
                    for (int i = 0; i < names.size(); i++) {
                        name = names.get(i);
                        if (j1.getSelectedItem().toString() == name) {
//                            j2.setSelectedIndex(i);
//                            j3.setSelectedIndex(i);
//                            j4.setSelectedIndex(i);
//                            j5.setSelectedIndex(i);
//                            j6.setSelectedIndex(i);
                            t2.setText(classRollNo.get(i).toString());
                            t3.setText(clusterId.get(i));
                            t4.setText(examRollNo.get(i).toString());
                            t5.setText(phoneNumber.get(i));
                            t6.setText(email.get(i));
                        }
                    }
                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });

        Details.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String name;
                try {
                    j1.setSelectedIndex(0);
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");

                } catch (Exception exception) {
                    System.out.println(exception);
                }
            }
        });

        // Adding action listener
        Save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                // Getting the text from text fields
                // and JComboboxes
                // and copying it to a strings

//                String s1 = j1.getSelectedItem() + "";
//                String s2 = j2.getSelectedItem() + "";
//                String s3 = j3.getSelectedItem() + "";
//                String s4 = j4.getSelectedItem() + "";
//                String s5 = j5.getSelectedItem() + "";
//                String s6 = j6.getSelectedItem() + "";

                String s1 = j1.getSelectedItem() + "";
                String s2 = t2.getText() + "";
                String s3 = t3.getText() + "";
                String s4 = t4.getText() + "";
                String s5 = t5.getText() + "";
                String s6 = t6.getText() + "";

                if (event.getSource() == Save) {
                    try {

                        // Creating a file and
                        // writing the data
                        // into a Textfile.
                        FileWriter studentsFile
                                = new FileWriter(
                                "students.txt", true);

                        studentsFile.write(s1 + "\n");
                        studentsFile.write(s2 + "\n");
                        studentsFile.write(s3 + "\n");
                        studentsFile.write(s4 + "\n");
                        studentsFile.write(s5 + "\n");
                        studentsFile.write(s6 + "\n");
                        studentsFile.write("\n\n");
                        studentsFile.close();
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

                // Shows a Pop up Message when
                // save button is clicked
                JOptionPane
                        .showMessageDialog(
                                studentHomeScreen,
                                "Successfully Saved"
                                        + " The Details");
            }
        });

        // Action listener to close the form
        Close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentHomeScreen.dispose();
            }
        });

        // Default method for closing the frame
        studentHomeScreen.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created objects
        // to the frame
        studentHomeScreen.add(l1);
//        studentHomeScreen.add(t1);
        studentHomeScreen.add(j1);


        studentHomeScreen.add(l2, t2);
//        studentHomeScreen.add(t2);
//        studentHomeScreen.add(j2);

        studentHomeScreen.add(l3);
        studentHomeScreen.add(t3);
//        studentHomeScreen.add(j3);

        studentHomeScreen.add(l4);
        studentHomeScreen.add(t4);
//        studentHomeScreen.add(j4);

        studentHomeScreen.add(l5);
        studentHomeScreen.add(t5);
//        studentHomeScreen.add(j5);

        studentHomeScreen.add(l6);
        studentHomeScreen.add(t6);
//        studentHomeScreen.add(j6);

        studentHomeScreen.add(Save);
        studentHomeScreen.add(Close);
        studentHomeScreen.add(Details);


        studentHomeScreen.setLayout(null);
        studentHomeScreen.setSize(550, 500);
        studentHomeScreen.setVisible(true);
    }

    // Driver code
    public static void main(String args[]) {
        StudentInfo();
    }
}