import java.util.Scanner;

public class ReverseOfANum {
    public static void main(String[] args) {
        int n,rem,reverse=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to to be reversed");
        n=sc.nextInt();
        int temp=n;
        while(n>0){
            rem = n%10;
            reverse = reverse*10+rem;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("reverse of a number is "+reverse);
        }
    }
}
