public class Rectangle {

       private int length;
       private int bredth;

      Rectangle(){

        }

    public Rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;

    }

    void areaOfReactangle(){
          int area=(length*bredth);
        System.out.println("Area of rectangle is : "
                + area);
    }

        void perimeterOfRectangle(){
          int perimeter = 2 * (length+bredth);
            System.out.println("Perimeter of rectangle is : "
                    + perimeter);
        }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        r1.areaOfReactangle();
        r1.perimeterOfRectangle();
    }
    }

