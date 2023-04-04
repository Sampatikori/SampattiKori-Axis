package Inheritence;

public class Square extends Shape{
    int side;

    public Square(int s) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return (this.side*this.side);
    }
}
