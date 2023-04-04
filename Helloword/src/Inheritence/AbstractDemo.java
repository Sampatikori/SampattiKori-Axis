package Inheritence;

public class AbstractDemo {
    public static void main(String[] args) {
        int rad=6,side=8;
        Shape s1=new Circle(rad);
        Shape s2=new Square(side);
        System.out.println("Area of the circle is: "+s1.calculateArea());
        System.out.println("Area of the square is: "+s2.calculateArea());
        s1.setColor("PurPle");
        s2.setColor("Violet");



    }
}
