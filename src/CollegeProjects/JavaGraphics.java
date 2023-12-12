package CollegeProjects;

import java.awt.*;
import javax.swing.JFrame;

public class JavaGraphics extends Canvas {

    public void paint(Graphics g) {
        g.drawString("Graphics Demo", 40, 40);
        setBackground(Color.WHITE);
        g.fillRect(130, 30, 100, 80);
        g.drawOval(30, 130, 50, 60);
        setForeground(Color.BLACK);
        g.fillOval(130, 130, 50, 60);
        g.drawArc(30, 200, 40, 50, 90, 60);
        g.fillArc(30, 130, 40, 50, 180, 40);

    }

    public static void main(String[] args) {
        JavaGraphics graph = new JavaGraphics();
        JFrame f = new JFrame();
        f.add(graph);
        f.setSize(400, 400);
        //f.setLayout(null);
        f.setVisible(true);
    }

}