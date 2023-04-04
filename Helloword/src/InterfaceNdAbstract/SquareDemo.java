package InterfaceNdAbstract;

import Inherit.ShapeDemo;

public class SquareDemo implements Shape {
    int side;

    public SquareDemo(int i) {
        this.side=i;
    }

    public int getArea() {
        return side*side;
    }

    @Override
    public int area() {
        return 0;
    }

    public int perimeter() {
        return side+side+side+side;
    }
}
