public class Triangle {
    int len;
    int bred;
    int side1,side2,side3;



    Triangle(){

    }
    public Triangle(int len, int bred, int side1, int side2, int side3) {
        this.len = len;
        this.bred = bred;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    void areaOfTriangle(){
        int area = (1/2*(len*bred));
        System.out.println("area of triangle is "+ area);
    }
    void perimeterOfTriangle(){
        int perimeter = side1+side2+side3;
        System.out.println("perimeter of a triangle "+ perimeter);
    }

    public static void main(String[] args) {
        Triangle t1=new Triangle(5,5,4,8,2);
        t1.areaOfTriangle();
        t1.perimeterOfTriangle();
    }
}
