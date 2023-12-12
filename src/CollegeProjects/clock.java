import java.awt.*;
//In place of star we use Color,Dimension,Font,Graphics,event.ActionEvent,event.ActionListner.
import java.util.*;
//In place of star we use Calendar.
import javax.swing.*;
//In place of star we use Jframe.JPane1,WindowConstants.
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class clock {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        SimpleDigitalClock clock1 = new SimpleDigitalClock();
        frame.add(clock1);
        frame.pack();
        frame.setVisible(true);
    }

    static class SimpleDigitalClock extends JPanel {
        String stringTime;
        int hour, minute, second;
        String _Hour = "";
        String _Minute = "";
        String _Second = "";

        public void setStringTime(String str) {
            this.stringTime = str;
        }

        public int Number(int a, int b) {
            return (a <= b) ? a : b;
        }

        SimpleDigitalClock() {
            Timer t = new Timer(100, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    repaint();
                }
            });
            t.start();
        }

        @Override
        public void paintComponent(Graphics graph) {
            super.paintComponent(graph);
            Calendar calandr = Calendar.getInstance();
            hour = calandr.get(Calendar.HOUR_OF_DAY);
            minute = calandr.get(Calendar.MINUTE);
            second = calandr.get(Calendar.SECOND);
            if (hour < 10) {
                this._Hour = "0";
            }
            if (hour >= 10) {
                this._Hour = "";
            }
            if (minute < 10) {
                this._Minute = "0";
            }
            if (minute >= 10) {
                this._Minute = "";
            }
            if (second < 10) {
                this._Second = "0";
            }
            if (second >= 10) {
                this._Second = "";
            }
            setStringTime(_Hour + hour + ":" + _Minute + minute + ":" + _Second + second);
            graph.setColor(Color.BLACK);
            int length = Number(this.getWidth(), this.getHeight());
            Font Font1 = new Font("SansSerif", Font.PLAIN, length / 5);
            graph.setFont(Font1);
            graph.drawString(stringTime, (int) length / 6, length / 2);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }
    }
}


//package CollegeProjects;
//
//import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.geom.*;
//import javax.swing.*;
//import javax.swing.event.*;
//
//public class clock {
//    public static void main(String[] args) {
//        ClockDrawingFrame frame = new ClockDrawingFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//
///**
// * A frame with two text fields to set a clock.
// */
//class ClockDrawingFrame extends JFrame {
//    private JTextField hourField;
//    private JTextField minuteField;
//    private ClockPanel clock;
//
//    public ClockDrawingFrame() {
//        setTitle("Clock GUI");
//
//        DocumentListener listener = new ClockFieldListener();
//
//        // add a panel with text fields (label)
//
//        JPanel panel = new JPanel();
//
//        panel.add(new JLabel("Hours:"));
//        hourField = new JTextField("12", 3);
//        panel.add(hourField);
//        hourField.getDocument().addDocumentListener(listener);
//
//        panel.add(new JLabel("Minutes:"));
//        minuteField = new JTextField("00", 3);
//        panel.add(minuteField);
//        minuteField.getDocument().addDocumentListener(listener);
//
//        add(panel, BorderLayout.SOUTH);
//
//        // add the clock
//
//        clock = new ClockPanel();
//        add(clock, BorderLayout.CENTER);
//        pack();
//    }
//
//    /**
//     * Set the clock to the values stored in the text fields.
//     */
//    public void setClock() {
//        try {
//            int hours = Integer.parseInt(hourField.getText().trim());
//            int minutes = Integer.parseInt(minuteField.getText().trim());
//            clock.setTime(hours, minutes);
//        } catch (NumberFormatException e) {
//        }
//        // don't set the clock if the input can't be parsed
//    }
//
//    private class ClockFieldListener implements DocumentListener {
//        public void insertUpdate(DocumentEvent event) {
//            setClock();
//        }
//
//        public void removeUpdate(DocumentEvent event) {
//            setClock();
//        }
//
//        public void changedUpdate(DocumentEvent event) {
//        }
//    }
//}
//
///**
// * A panel that draws a clock.
// */
//class ClockPanel extends JPanel {
//    private double minutes = 0;
//    private int RADIUS = 100;
//    private double MINUTE_HAND_LENGTH = 0.8 * RADIUS;
//    private double HOUR_HAND_LENGTH = 0.6 * RADIUS;
//
//    public ClockPanel() {
//        setPreferredSize(new Dimension(2 * RADIUS + 1, 2 * RADIUS + 1));
//    }
//
//    public void paintComponent(Graphics g) {
//        // draw the circular boundary
//
//        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D) g;
//        Ellipse2D circle = new Ellipse2D.Double(0, 0, 2 * RADIUS, 2 * RADIUS);
//        g2.draw(circle);
//
//        // draw the hour hand
//
//        double hourAngle = Math.toRadians(90 - 360 * minutes / (12 * 60));
//        drawHand(g2, hourAngle, HOUR_HAND_LENGTH);
//
//        // draw the minute hand
//
//        double minuteAngle = Math.toRadians(90 - 360 * minutes / 60);
//        drawHand(g2, minuteAngle, MINUTE_HAND_LENGTH);
//    }
//
//    public void drawHand(Graphics2D g2, double angle, double handLength) {
//        Point2D end = new Point2D.Double(RADIUS + handLength * Math.cos(angle),
//                RADIUS - handLength * Math.sin(angle));
//        Point2D center = new Point2D.Double(RADIUS, RADIUS);
//        g2.draw(new Line2D.Double(center, end));
//    }
//
//    /**
//     * Set the time to be displayed on the clock
//     *
//     * @param h hours
//     * @param m minutes
//     */
//    public void setTime(int h, int m) {
//        minutes = h * 60 + m;
//        repaint();
//    }
//
//
//}
