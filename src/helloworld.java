//import java.awt.*;
//
//public class helloworld extends Frame {
//
//    public helloworld() {
//        setSize(400, 400);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new helloworld();
//        System.out.println("Hello");
//    }
//}

//here sonoo is database name, root is username and password, "root", "root"

import java.sql.*;

class helloworld {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spc", "root", "your_password");
            Statement stmt = con.createStatement();
            ResultSet students = stmt.executeQuery("select * from students");
            while (students.next())
                System.out.println(students.getString(1) + "  " + students.getInt(2) + "  " + students.getString(3) + "  " + students.getString(4) + "  " + students.getString(5) + "  " + students.getInt(6));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}