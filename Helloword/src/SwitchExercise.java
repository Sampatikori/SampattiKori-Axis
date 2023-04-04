import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
//        int month = 5;
//        String displayMonth;
//        switch (month) {
//            case 1:  displayMonth = "January";
//                break;
//            case 2:  displayMonth = "February";
//                break;
//            case 3:  displayMonth = "March";
//                break;
//            case 4:  displayMonth = "April";
//                break;
//            case 5:  displayMonth = "May";
//                break;
//            case 6:  displayMonth = "June";
//                break;
//            case 7:  displayMonth = "July";
//                break;
//            case 8:  displayMonth = "August";
//                break;
//            case 9:  displayMonth = "September";
//                break;
//            case 10: displayMonth = "October";
//                break;
//            case 11: displayMonth = "November";
//                break;
//            case 12: displayMonth = "December";
//                break;
//            default: displayMonth = "Invalid month";
//                break;
//        }
//        System.out.println(displayMonth);
//    }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber;
        monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}

