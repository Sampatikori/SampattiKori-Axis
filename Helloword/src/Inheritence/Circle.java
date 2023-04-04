package Inheritence;

public class Circle extends Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14*this.radius*this.radius;
    }
}
