import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String num1Str = scanner.nextLine();
        int num1 = 0;
        try {
            num1 = Integer.parseInt(num1Str);
            if (num1 < 10 || num1 > 100) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error");
            scanner.close();
            return;
        }


        String num2Str = scanner.nextLine();
        int num2 = 0;
        try {
            num2 = Integer.parseInt(num2Str);
            if (num2 < -10 || num2 > 10) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error");
            scanner.close();
            return;
        }


        String operation = scanner.nextLine();
        if (!operation.matches("[+\\-*/]")) {
            System.out.println("Error");
            scanner.close();
            return;
        }

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
                    System.out.println("Error");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
        }

        System.out.println(result);

        scanner.close();
    }
}

