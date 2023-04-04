public class ArrayDemo {
    public static void main(String[] args) {
        int a[];
        a = new int[10];
        int num=0;
        for (int i = 0; i < 10; i++) {
            a[i]=num;
            num=num+1;

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int b[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i]);
        }
    }
}