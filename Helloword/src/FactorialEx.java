public class FactorialEx {
    public static void main(String[] args) {
        int n,fact,i;
        n=4;
        fact=1;
        for (i=n; i>=1; i--){
            fact= fact *i;
        }
        System.out.println("Factorial of a given number " + n +"is" + fact);
//        int number = 6;
//        long factorial = 1;
//
//        for (int i = 1; i <= number; i++)
//        {
//            factorial = factorial * i;
//        }
//        System.out.println("Factorial of " + number + " is: " + factorial);
//    }

//        using while loop
        int f=1;
        i=n;
        while(i>=1){
            f= f * i;
        }
        System.out.println("Factorial of a given number " + n +"is" + fact);

//        int number = 6;
//        long factorial = 1;
//        int i=1;
//
//        while (i <= number)
//        {
//            factorial = factorial * i;
//            i++;
//        }
//        System.out.println("Factorial of " + number + " is: " + factorial);
//    }

//        using do while loop

        int number = 6;
        int factorial = 1;
        int j = 1;

        do
        {
            factorial = factorial * j;
            j++;
        } while (j <= number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }


    }
