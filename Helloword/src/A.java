public class A {
    static int x;

    A() {

    }

    A(int x) {
        this.x = x;
    }

    void method1() {
        x = x + 2;
        System.out.println(x);
    }

    void method2() {
        x = x - 5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a1 = new A(5);
          a1.method1();
          a1.method2();
    }
}
