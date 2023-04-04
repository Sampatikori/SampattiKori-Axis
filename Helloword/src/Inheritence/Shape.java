package Inheritence;

public abstract class Shape {
    String color;
    abstract  double calculateArea();

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color of the shape is: "+this.color);
    }
}

