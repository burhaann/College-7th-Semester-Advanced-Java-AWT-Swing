package CollegeProjects;

import javax.swing.*;

class java_18 {
    public static void main(String[] args) {
        //Creating JFrame(Container) which will hold everything
        JFrame frame = new JFrame("Menu");
        //Creating JMenuBar(Menu Container) which will hold Menus
        JMenuBar menuBar = new JMenuBar();

        //Creating JMenu which will act asw Menu and will contain multiple sub Menu Items
        JMenu file = new JMenu("File");
        JMenuItem fileNew = new JMenuItem("New");
        JMenuItem fileOpen = new JMenuItem("Open");
        JMenuItem fileSave = new JMenuItem("Save");
        JMenuItem fileSaveAs = new JMenuItem("SaveAs");
        JMenuItem fileExit = new JMenuItem("Exit");
        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);
        file.add(fileSaveAs);
        file.add(fileExit);
        ;

        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        JMenu exit = new JMenu("Exit");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        menuBar.add(exit);
        frame.setJMenuBar(menuBar);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}