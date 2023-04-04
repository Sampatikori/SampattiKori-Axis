import java.util.Scanner;

public class SearchForElemtInarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, search, flag = 0;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be seached");
        search = sc.nextInt();

        /*Perform search operation*/
        for (i = 0; i < n; i++) {
            if (a[i] == search) {
                System.out.println("Element " + search + " found at " + i + " position");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element " + search + " not found");
        }

//        public static void main(String[] args) {
//            String[] names = {"Somu", "Sam", "Smita", "Aishwarya", "Preeti"};
//            boolean found = false;
//            Scanner input = new Scanner(System.in);
//
//
//            System.out.println("Enter the string to search for:");
//            String searchString = input.nextLine();
//
//
//            for (int j= 0;  j< names.length; i++) {
//                if (names[i].equals(searchString)) {
//                    found = true;
//                    break;
//                }
//            }
//
//
//            if (found) {
//                System.out.println("The string " + searchString + " was found in the array.");
//            } else {
//                System.out.println("The string " + searchString + " was not found in the array.");
//            }
//        }
//    }

    }
}