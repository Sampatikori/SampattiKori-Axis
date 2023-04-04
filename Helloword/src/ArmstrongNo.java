import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (digit * digit * digit);
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
