import java.util.Scanner;

public class LargElemetInArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = s1.nextInt();
        int arr[] = new int[size];
        System.out.println("enter " + size + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest " + max);

//        Smallest number

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number " + min);

//        duplicate elements

        System.out.println("duplicate elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }

            }
        }

//        sum of an array
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum "+sum);
    }
}


