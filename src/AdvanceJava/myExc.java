package AdvanceJava;

import java.util.*;

//User defined exception
class MyException extends Exception {

    String pw;

    public MyException(String str) {
        pw = str;
    }
}

public class myExc {
    //Method to check for Exception to throw
    static void passCheck(String pwd) throws MyException {
        if (pwd.equals("Arhaan"))
            System.out.println("Welcome to Ganjotso!");
        else
            throw new MyException(pwd);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();

        //Try - Catch block
        try {
            passCheck(pwd);
        } catch (MyException me) {
            System.out.println("My Exception : Password is Wrong!");
        }
    }
}