package InterfaceNdAbstract;

import Inherit.ShapeDemo;

public class RectangleDemo implements Shape {


    int length;
    int breadth;
    int side;

    public RectangleDemo(int l, int b) {
        this.length = l;
        this.breadth = b;
    }


    public int area() {

        return length * breadth;
    }

    public int perimeter() {

        return 2 * (length + breadth);
    }

}
