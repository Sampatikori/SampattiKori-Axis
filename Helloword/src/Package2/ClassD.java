package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
    public static void main(String[] args) {

        ClassA ob=new ClassA();
        ob.x1=60;

        ClassD obj=new ClassD();
        obj.x1=50;
        obj.x3=40;
    }
}
