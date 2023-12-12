package CollegeProjects.Practical11.mainPackage;

import CollegeProjects.Practical11.extPackage.ExtClass;

class App {
    public static void main(String[] args) {
        ExtClass obj = new ExtClass();

        //Accessing member variables from External Class
        System.out.println("Student ID : " + obj.stuID[0] + "\nStudent Name : " + obj.stuName[0]);
        System.out.println("Student ID : " + obj.stuID[1] + "\nStudent Name : " + obj.stuName[1]);
    }
}