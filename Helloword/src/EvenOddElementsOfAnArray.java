import java.util.Scanner;

public class EvenOddElementsOfAnArray {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=s1.nextInt();
        int arr[]=new int[size];
        System.out.println("enter "+size+" elements");
        for(int i=0; i<arr.length; i++) {
            arr[i]=s1.nextInt();
        }
        System.out.println("odd numbers");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2!=0) {
                System.out.println(arr[i]);
            }}
        System.out.println("Even numbers");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                System.out.println(arr[i]);

            }
        }


    }
}
