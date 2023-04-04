public class OperatorsExercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 6;
        int x1 = a + b;
        int x2 = a - b;
        int x3 = a * b;
        int x4 = a / b;
        int x5 = a % b;

//        Arithmetic Operators
        System.out.println("Addition of " + a + "&" + b + " is " + x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        /*  Unary Operator */
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);

//        Logical && and Bitwise & Operator
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);

//        Logical || and Bitwise | Operator
        System.out.println(a>b||a<c);
        System.out.println(a>b|a<c);

//        Ternary Operator
        int min=(a<b)?a:b;
        System.out.println(min);

//        Assignment Operator
        a+=2;
        b-=5;
        System.out.println(a);
        System.out.println(b);

//        Relational Operator

//        Shift Operator
        int p=a<<5;
        int q=c>>>4;

    }
}