import java.util.Scanner;

public class NumberToWord {
        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();
            int n1=n,n2=n;
            int b=n1%10,a=n2/10; //  n1/10 means last digit is removed and n2%10 means last digit by modulus

            String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
            String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
            String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
            if(a==1)
            {
                System.out.println(two_digits[b+1]);
            }
            else if(b==0)
                System.out.println(tens_multiple[a]);
            else
                System.out.println(tens_multiple[a]+"-"+single_digits[b]);
        }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 9: ");
//        int num = scanner.nextInt();
//
//
//        String word = "";
//
//        switch (num) {
//            case 1:
//                word = "one";
//                break;
//            case 2:
//                word = "two";
//                break;
//            case 3:
//                word = "three";
//                break;
//            case 4:
//                word = "four";
//                break;
//            case 5:
//                word = "five";
//                break;
//            case 6:
//                word = "six";
//                break;
//            case 7:
//                word = "seven";
//                break;
//            case 8:
//                word = "eight";
//                break;
//            case 9:
//                word = "nine";
//                break;
//            default:
//                System.out.println("Invalid input");
//                return;
//        }
//
//        System.out.println("The number " + num + " in words is: " + word);
//    }
    }


