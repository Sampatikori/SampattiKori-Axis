package InterfaceNdAbstract;

import Inherit.ShapeDemo;

public class Circledemo implements Shape {
    int radius;

    public Circledemo(int radius) {
        this.radius = radius;
    }

    public int area() {
        return radius * (22 / 7);
    }

    public int perimeter() {
        return (44 / 7) * radius;

    }
}