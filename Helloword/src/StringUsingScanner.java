import java.util.Scanner;

public class StringUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        String sr[] = new String[n];
        for(int i=0; i<n; i++){
            sr[i]=sc.nextLine();
        }
        System.out.println("array elements are : ");
        for(int i=0; i<n; i++){System.out.println(sr[i]);
        }

//        String s;
//        System.out.println("enter an element to search");
//        s=sc.nextLine();


    }
}
