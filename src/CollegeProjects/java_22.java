package CollegeProjects;

import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

class java_22 extends JFrame {
    Calendar calendar;
    static JLabel timeLabel;
    static String time;
    static SimpleDateFormat timeFormat;

    //Method for real time live system clock
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        java_23 obj = new java_23();

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
        timeLabel.setOpaque(true);

        frame.add(timeLabel);
        frame.setTitle("Clock");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setResizable(false);
        frame.setVisible(true);

//        obj.setTime();
    }
}