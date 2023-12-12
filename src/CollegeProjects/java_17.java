package CollegeProjects;

import java.awt.*;
import javax.swing.JFrame;

public class java_17 extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        setForeground(Color.RED);

        //Drawing Rectangle
        g.drawRect(10, 10, 100, 50);
        g.drawString("Rectangle", 20, 80);

        //Drawing Oval
        g.drawOval(120, 10, 100, 50);
        g.drawString("Oval", 160, 80);

        //Drawing Line
        g.drawLine(230, 50, 300, 50);
        g.drawString("Line", 250, 80);
    }

    public static void main(String[] args) {
        CollegeProjects.java_23 obj = new CollegeProjects.java_23();

        JFrame frame = new JFrame();
        frame.add(frame);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

}