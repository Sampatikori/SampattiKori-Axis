import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for Num1
        System.out.print("Enter Num1 (between 10 and 100): ");
        int num1 = 0;
        try {
            num1 = Integer.parseInt(scanner.nextLine());
            if (num1 < 10 || num1 > 100) {
                System.out.println("Error: Num1 must be between 10 and 100");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Bad number for Num1");
            return;
        }

        // Take input for Num2
        System.out.print("Enter Num2 (between -10 and 10): ");
        int num2 = 0;
        try {
            num2 = Integer.parseInt(scanner.nextLine());
            if (num2 < -10 || num2 > 10) {
                System.out.println("Error: Num2 must be between -10 and 10");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Bad number for Num2");
            return;
        }

        // Take input for operation
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.nextLine();
        if (!operation.matches("[+\\-*/]")) {
            System.out.println("Error: Invalid operation");
            return;
        }

        // Perform calculation
        int result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = num1 / num2;
                break;
        }

        // Print result
        System.out.println("Result: " + result);
    }
}

