package Package2;

import Package1.ClassA;

public class ClassC {
    public static void main(String[] args) {

        ClassA ob2=new ClassA();
        ob2.x1=50;
        System.out.println("public variable of a class in another package "+ob2.x1);
    }
}
