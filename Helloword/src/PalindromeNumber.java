import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,rem,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check palindrome");
        n=sc.nextInt();
        int temp=n;
        while(n>0){
            rem = n%10;
            sum = sum*10+rem;
            n=n/10;
        }
         if(temp==sum){
       System.out.println("given number is palindrom");
       }else {
             System.out.println("given number is not palindrom");
         }

    }
}
