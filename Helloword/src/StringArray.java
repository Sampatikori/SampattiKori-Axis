import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=s1.nextInt();
        String arr[]=new String[size];
        System.out.println("enter "+size+" elements");
        for (int i=0; i<arr.length; i++){
            arr[i]=s1.nextLine();
            System.out.println(arr[i]);
        }

//        length of string array

        int len=arr.length;
        System.out.println(len);

    }
}
