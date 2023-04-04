package Lamda;

public class ClassImpleInter implements MyInterface{

    public static void main(String[] args) {
        MyInterface.display();

        MyInterface.animal();

        ClassImpleInter b=new ClassImpleInter();
        b.bird();
    }
}
