package mainPackage;
import extPackage.*;

class SubClass{
    int[] stuID= {106, 115, 116};

    int getStuID(int i){
        return stuID[i];
    }
}

class MainClass{
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
        ExtClass p2Obj = new ExtClass();

        System.out.println("I'm in Package01 inside Main method.");

        System.out.println(subObj.getStuID(1));
        System.out.println(p2Obj.getStuName(1));
    }
}