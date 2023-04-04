package Lamda;

public interface MyInterface {
    static  void display(){
        System.out.println("This is a static method from myInterface interface");
    }

    default void  bird(){
        System.out.println("default method");
    }

    public static void animal(){
        System.out.println("public method");
    }


}
