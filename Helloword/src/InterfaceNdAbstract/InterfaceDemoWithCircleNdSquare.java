package InterfaceNdAbstract;

public class InterfaceDemoWithCircleNdSquare {
    public static void main(String[] args) {
        Shape s = new Circledemo(5);
        System.out.println("Area of circle is:- "+s.area());
        System.out.println("Perimeter of circle is:- "+s.perimeter());

         s = new SquareDemo(3);
        System.out.println("Area of square is:- "+s.area());
        System.out.println("Perimeter of square is:- "+s.perimeter());

        s=new RectangleDemo(5,8);
        System.out.println("Area of rectangle is:- "+s.area());
        System.out.println("Perimeter of rectangle is:- "+s.perimeter());

        s=new TriangleDemo(2,10,9);
        System.out.println("Area of triangle is:- "+s.area());
        System.out.println("Perimeter of triangle is:- "+s.perimeter());


    }
}
